package better_write.Netty_Book.decoder.package7;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/19
 * \* Time: 16:45
 * \* Description:
 * \
 */
public class BusinessServerHandler extends ChannelInboundHandlerAdapter {

    private static int count = 0;

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("BusinessServerHandler call count="+ ++count);
        ByteBuf buf = (ByteBuf)msg;
        int length = buf.readInt();
        assert length == (8);

        byte[] head = new byte[4];
        buf.readBytes(head);
        String headString = new String(head);
        assert  "head".equals(headString);

        byte[] body = new byte[4];
        buf.readBytes(body);
        String bodyString = new String(body);
        assert  "body".equals(bodyString);
    }


}
