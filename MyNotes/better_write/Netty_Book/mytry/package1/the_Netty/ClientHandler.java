package better_write.Netty_Book.mytry.package1.the_Netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

import java.util.Date;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/14
 * \* Time: 21:48
 * \* Description:
 * \
 */
public class ClientHandler extends SimpleChannelInboundHandler<ByteBuf> {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        while (true) {
            String msg = new Date() + ": hello world";
            ctx.writeAndFlush(Unpooled.copiedBuffer(msg
                    , CharsetUtil.UTF_8));

            Thread.sleep(3000);
        }

    }


}
