package better_write.Netty_Book.Tcp_Package.package3;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/16
 * \* Time: 11:42
 * \* Description:
 * \
 */
public class ClientHandler extends ChannelInboundHandlerAdapter {

    private int count =0;

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        // Send the message to Server
        ByteBuf buf = null;
        for(int i=0; i<100; i++){

            String msg = "hello from client "+i + "\n";
            byte[] r = msg.getBytes();
            buf = Unpooled.buffer(r.length);
            buf.writeBytes(r);
           ctx.writeAndFlush(buf);
        }

    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)
            throws Exception {
        String body = (String) msg;
        count++;
        System.out.println("client read msg:{}, count:{}   " + body + "    " + count);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
            throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
