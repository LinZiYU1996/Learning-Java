package better_write.Netty_Book.Tcp_Package.my1;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/16
 * \* Time: 20:07
 * \* Description:
 * \
 */
public class ServerHandler extends ChannelInboundHandlerAdapter {

    private int cnt;


    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("server channelActive");
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        System.out.println("server channelRead");
        String body = (String) msg;
        cnt++;
        System.out.println("server read msg:{}, count:{}   "  + body + "   "  + cnt);
        String response = "hello from server"+System.getProperty("line.separator");
        ctx.writeAndFlush(response);



    }
}
