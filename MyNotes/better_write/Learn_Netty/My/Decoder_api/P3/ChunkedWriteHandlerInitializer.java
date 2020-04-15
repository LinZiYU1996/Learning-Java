package better_write.Learn_Netty.My.Decoder_api.P3;

import io.netty.channel.*;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslHandler;
import io.netty.handler.stream.ChunkedStream;
import io.netty.handler.stream.ChunkedWriteHandler;

import java.io.File;
import java.io.FileInputStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/14
 * \* Time: 10:24
 * \* Description:
 * \
 */
public class ChunkedWriteHandlerInitializer extends ChannelInitializer<Channel> {

    private final File file;

    private final SslContext context;

    public ChunkedWriteHandlerInitializer(File file, SslContext context) {
        this.file = file;
        this.context = context;
    }

    @Override
    protected void initChannel(Channel channel) throws Exception {
        ChannelPipeline pipeline = channel.pipeline();
        /*
        将 SslHandler 添加到ChannelPipeline 中
         */
        pipeline.addLast(new SslHandler(context.newEngine(channel.alloc())));        /*
        添加 Chunked-WriteHandler以处理作为ChunkedInput传入的数据
         */
        pipeline.addLast(new ChunkedWriteHandler());
        /*
        一旦连接建立，WriteStreamHandler就开始写文件数据
         */
        pipeline.addLast(new WriteStreamHandler());
    }

    public final class WriteStreamHandler
            extends ChannelInboundHandlerAdapter {

        /*
        当连接建立时，channelActive()方法将使用ChunkedInput写文件数据
         */
        @Override
        public void channelActive(ChannelHandlerContext ctx)
                throws Exception {
            super.channelActive(ctx);
            ctx.writeAndFlush(
                    new ChunkedStream(new FileInputStream(file)));
        }
    }
}
