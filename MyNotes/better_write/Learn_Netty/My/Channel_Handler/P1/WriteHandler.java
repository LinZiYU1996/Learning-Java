package better_write.Learn_Netty.My.Channel_Handler.P1;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/12
 * \* Time: 20:29
 * \* Description:
 * \
 */
public class WriteHandler extends ChannelHandlerAdapter {

    private ChannelHandlerContext ctx;
    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        //存储到 ChannelHandlerContext的引用以供稍后使用
        this.ctx = ctx;
    }

    //使用之前存储的到 ChannelHandlerContext的引用来发送消息
    public void send(String msg) {
        ctx.writeAndFlush(msg);
    }
}
