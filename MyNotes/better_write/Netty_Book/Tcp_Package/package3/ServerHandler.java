package better_write.Netty_Book.Tcp_Package.package3;

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

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        String body = (String) msg;
        System.out.println("");
        System.out.println("============package=====================");
        System.out.println(body);
        System.out.println("============package=====================");
        System.out.println("");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
            throws Exception {
        cause.printStackTrace();
        ctx.close();
    }

}
