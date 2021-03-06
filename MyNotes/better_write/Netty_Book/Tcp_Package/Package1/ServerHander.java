package better_write.Netty_Book.Tcp_Package.Package1;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/15
 * \* Time: 9:39
 * \* Description:
 * \
 */
public class ServerHander extends ChannelInboundHandlerAdapter {


    private int counter;

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)
            throws Exception {
        ByteBuf buf = (ByteBuf) msg;
        byte[] req = new byte[buf.readableBytes()];
        System.out.println("len  " + req.length);
        buf.readBytes(req);
        String body = new String(req, "UTF-8");
//        String body = new String(req, "UTF-8").substring(0, req.length - System.getProperty("line.separator").length());
        System.out.println("");
        System.out.println("The time server receive order : \n" + body + " ; the counter is : " + ++counter);
        System.out.println("");
        String currentTime = "QUERY TIME ORDER".equalsIgnoreCase(body) ?
                new java.util.Date( System.currentTimeMillis()).toString() : "BAD ORDER";
        currentTime = currentTime + System.getProperty("line.separator");
        ByteBuf resp = Unpooled.copiedBuffer(currentTime.getBytes());
        ctx.writeAndFlush(resp);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        ctx.close();
    }
}
