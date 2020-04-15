package better_write.Learn_Netty.My.Decoder_api.P2;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslHandler;

import javax.net.ssl.SSLEngine;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/14
 * \* Time: 9:09
 * \* Description:
 * \
 */
public class SslChannelInitializer extends ChannelInitializer<Channel> {

    private final SslContext context;

    private final boolean startTls;


    public SslChannelInitializer(SslContext context, //传入要使用的SslContext
                                 boolean startTls) {//如果设置为 true，第一个写入的消息将不会被加密（客户端应该设置为 true）
        this.context = context;
        this.startTls = startTls;
    }

    @Override
    protected void initChannel(Channel channel) throws Exception {

        //对于每个 SslHandler 实例，
        //都使用 Channel 的 ByteBuf-
        //Allocator 从 SslContext 获
        //取一个新的 SSLEngine
        SSLEngine engine = context.newEngine(channel.alloc());

        //将 SslHandler 作为第一个
        //ChannelHandler 添加到
        //ChannelPipeline 中
        channel.pipeline().addFirst("ssl"
        ,new SslHandler(engine,startTls));
    }
}
