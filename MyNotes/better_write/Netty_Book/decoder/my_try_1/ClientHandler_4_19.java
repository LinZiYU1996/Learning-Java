package better_write.Netty_Book.decoder.my_try_1;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/19
 * \* Time: 15:26
 * \* Description:
 * \
 */
public class ClientHandler_4_19 extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        String body = "this message is from client";

        ctx.writeAndFlush(new MyProtocol(body.length(),body));

    }
}
