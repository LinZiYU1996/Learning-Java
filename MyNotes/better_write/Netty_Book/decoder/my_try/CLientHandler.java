package better_write.Netty_Book.decoder.my_try;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/18
 * \* Time: 9:47
 * \* Description:
 * \
 */
public class CLientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        String content = "hello,world!";

//        MyProtocol myProtocol = new MyProtocol(content.length(),content);
//        ctx.writeAndFlush(myProtocol);
//        ctx.writeAndFlush(Unpooled.copiedBuffer("aaa".getBytes()));
        ctx.writeAndFlush(content);
        System.out.println("c write");

    }
}
