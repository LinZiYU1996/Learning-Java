package better_write.Netty_Book.decoder.my_try_1;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.io.UnsupportedEncodingException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/19
 * \* Time: 15:49
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) throws UnsupportedEncodingException {

        ByteBuf buf = Unpooled.buffer(1024);

        String body = "this message is from client";

        MyProtocol protocol = new MyProtocol(body.length(),body);

        buf.writeInt(body.length());

        buf.writeBytes(body.getBytes());

        int length = buf.readInt();

        String content = null;

        if (length > 0 ) {

            ByteBuf buf1 = buf.readBytes(length);
            byte[] req = new byte[buf1.readableBytes()];
            buf1.readBytes(req);
            content = new String(req, "UTF-8");

        }

        System.out.println(length);

        System.out.println(content);

    }
}
