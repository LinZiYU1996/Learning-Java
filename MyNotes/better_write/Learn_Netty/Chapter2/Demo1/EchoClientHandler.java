package better_write.Learn_Netty.Chapter2.Demo1;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/10
 * \* Time: 10:22
 * \* Description:
 * \
 */
public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        /*
        当被通知 Channel
        是活跃的时候，发
        送一条消息
         */
        ctx.writeAndFlush(Unpooled.copiedBuffer("Netty rocks"
        , CharsetUtil.UTF_8));
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {

        /*
        记录已接收
        消息的转储
         */
        System.out.println("Client receive: "+
                byteBuf.toString(CharsetUtil.UTF_8));
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
/*
重写了 channelActive()方法，其将在一个连接建立时被调用。这确保了数据
将会被尽可能快地写入服务器，其在这个场景下是一个编码了字符串"Netty rocks!"的字节
缓冲区。

重写了 channelRead0()方法。每当接收数据时，都会调用这个方法。需要注
意的是，由服务器发送的消息可能会被分块接收。也就是说，如果服务器发送了 5 字节，那么不
能保证这 5 字节会被一次性接收。即使是对于这么少量的数据，channelRead0()方法也可能
会被调用两次，第一次使用一个持有 3 字节的 ByteBuf（Netty 的字节容器），第二次使用一个
持有 2 字节的 ByteBuf。作为一个面向流的协议，TCP 保证了字节数组将会按照服务器发送它
们的顺序被接收。


 */