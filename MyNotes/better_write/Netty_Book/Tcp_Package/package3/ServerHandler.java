package better_write.Netty_Book.Tcp_Package.package3;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/16
 * \* Time: 11:41
 * \* Description:
 * \
 */
public class ServerHandler extends ChannelInboundHandlerAdapter {
//    private Logger logger = LoggerFactory.getLogger(getClass());

    private int count = 0;
//    @Override
//    public void channelRead(ChannelHandlerContext ctx, Object msg)
//            throws Exception {
//
//        count++;
//        String body = (String) msg;
//        System.out.println("server read msg:{}, count:{}   "  + body + "   "  + count);
//
//        String response = "hello from server"+System.getProperty("line.separator");
//        ctx.writeAndFlush(response);
//    }


    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf buf = (ByteBuf) msg;
        byte[] req = new byte[buf.readableBytes()];
        System.out.println("len  " + req.length);
        buf.readBytes(req);
        String body = new String(req, "UTF-8");

        System.out.println("============package=====================");
        System.out.println(body);
        System.out.println("============package=====================");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
            throws Exception {
        cause.printStackTrace();
        ctx.close();
    }

}
