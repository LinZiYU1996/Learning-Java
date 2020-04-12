package better_write.Learn_Netty.My.ByteBuf_api.P1;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/11
 * \* Time: 11:35
 * \* Description:
 * \
 */
public class T7 {

    public static void main(String[] args) {

        ByteBuf buf = Unpooled.copiedBuffer("abcdefghijklmn".getBytes());

        while (buf.isReadable()) {

            System.out.println(buf.readByte());

        }
    }
}
