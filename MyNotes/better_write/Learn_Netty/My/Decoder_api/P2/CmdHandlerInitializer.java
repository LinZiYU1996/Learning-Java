package better_write.Learn_Netty.My.Decoder_api.P2;

import io.netty.buffer.ByteBuf;
import io.netty.channel.*;
import io.netty.handler.codec.LineBasedFrameDecoder;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/14
 * \* Time: 10:07
 * \* Description:
 * \
 */
public class CmdHandlerInitializer extends ChannelInitializer<Channel> {

    final static byte SPACE = (byte) ' ';

    @Override
    protected void initChannel(Channel channel) throws Exception {
        ChannelPipeline pipeline = channel.pipeline();
        /*
        添加 CmdDecoder 以提取Cmd 对象，并将它转发给下一个ChannelInboundHandler
         */
        pipeline.addLast(new CmdDecoder(64 * 1024));
        /*
        添加 CmdHandler 以接收和处理 Cmd 对象
         */
        pipeline.addLast(new CmdHandler());
    }


    /*
     将帧（命令）的内容存储在 ByteBuf 中，一个 ByteBuf 用于名称，另一个用于参数
     */
    public static final class  Cmd{

        private final ByteBuf name;
        private final ByteBuf args;
        public Cmd(ByteBuf name, ByteBuf args) {
            this.name = name;
            this.args = args;
        }
        public ByteBuf name() {
            return name;
        }
        public ByteBuf args() {
            return args;
        }

    }

    /*
    从被重写了的 decode()方法中获取一行字符串，并从它的内容构建一个 Cmd 的实例；
     */
    public static final class CmdDecoder extends LineBasedFrameDecoder {
        public CmdDecoder(int maxLength) {
            super(maxLength);
        }
        @Override
        protected Object decode(ChannelHandlerContext ctx, ByteBuf buffer)
                throws Exception {
            /*
            从 ByteBuf 中提取由行尾符序列分隔的帧
             */
            ByteBuf frame = (ByteBuf) super.decode(ctx, buffer);
            if (frame == null) {
                /*
                如果输入中没有帧，则返回 null
                 */
                return null;
            }
            /*
            查找第一个空格字符的索引。前面是命令名称，接着是参数
             */
            int index = frame.indexOf(frame.readerIndex(),
                    frame.writerIndex(), SPACE);
            /*
            使用包含有命令名称和参数的切片创建新的Cmd对象
             */
            return new Cmd(frame.slice(frame.readerIndex(), index),
                    frame.slice(index + 1, frame.writerIndex()));
        }
    }

    /*
     从 CmdDecoder 获取解码的 Cmd 对象，并对它进行一些处理；
     */
    public static final class CmdHandler extends SimpleChannelInboundHandler<Cmd>{

        @Override
        protected void channelRead0(ChannelHandlerContext channelHandlerContext, Cmd cmd) throws Exception {

        }
    }


}
