package better_write.Netty_Book.decoder.package7;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.UnpooledByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/19
 * \* Time: 16:46
 * \* Description:
 * \
 */
public class SocketClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
//        UnpooledByteBufAllocator allocator = new UnpooledByteBufAllocator(false);
//        ByteBuf buffer = allocator.buffer(20);
//        buffer.writeInt(8);
//        buffer.writeBytes("head".getBytes());
//        buffer.writeBytes("body".getBytes());
//
//        ctx.writeAndFlush(buffer);

        UnpooledByteBufAllocator allocator = new UnpooledByteBufAllocator(false);
        ByteBuf buffer = allocator.buffer(20);
        buffer.writeInt(1604);
        buffer.writeBytes("head".getBytes());
        String longMsgBody = "";
        for (int i = 0; i < 400; i++) {
            longMsgBody = longMsgBody + "body";
        }
        buffer.writeBytes(longMsgBody.getBytes());

        ctx.writeAndFlush(buffer);

    }

}
