package better_write.Netty_Book.decoder.my_try_1;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/19
 * \* Time: 15:24
 * \* Description:
 * \
 */
public class ServerHandler_4_19 extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        if (msg instanceof MyProtocol) {

            System.out.println(msg.toString());

        }

    }
}
