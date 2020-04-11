package better_write.Learn_Netty.Chapter2.Demo1;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/10
 * \* Time: 10:01
 * \* Description:
 * \
 */
public class EchoServerHandler extends ChannelInboundHandlerAdapter {

/*
Echo 服务器会响应传入的消息，所以它需要实现ChannelInboundHandler 接口，用
来定义响应入站事件的方法。这个简单的应用程序只需要用到少量的这些方法，所以继承 Channel-
InboundHandlerAdapter 类也就足够了，它提供了 ChannelInboundHandler 的默认实现。

channelRead() — 对于每个传入的消息都要调用；
channelReadComplete() — 通知ChannelInboundHandler最后一次对channel-
Read()的调用是当前批量读取中的最后一条消息；
exceptionCaught() — 在读取操作期间，有异常抛出时会调用。
 */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        ByteBuf in = (ByteBuf) msg;

        //将消息
        //记录到
        //控制台
        System.out.println("Server received "
        + in.toString(CharsetUtil.UTF_8));

        //将接收到的消息
        //写给发送者，而
        //不冲刷出站消息
        ctx.write(in);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {

        //将未决消息冲刷到
        //远程节点，并且关
        //闭该 Channel
        ctx.writeAndFlush(Unpooled.EMPTY_BUFFER)
                .addListener(ChannelFutureListener.CLOSE);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {

        //打印异常
        //栈跟踪
        cause.printStackTrace();

        ctx.close();
    }
}
