package better_write.Netty_Book.Tcp_Package.my1;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/16
 * \* Time: 20:11
 * \* Description:
 * \
 */
public class ClientHandler extends ChannelInboundHandlerAdapter {

    private int cnt;

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        for (int i = 0; i < 100; i++) {

            String msg = "hello from client "+i;
            System.out.println("client active");
            ctx.writeAndFlush(msg+System.getProperty("line.separator"));

        }
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        String body = (String) msg;
        cnt++;
        System.out.println("client read msg:{}, count:{}   " + body + "    " + cnt);
    }
}
