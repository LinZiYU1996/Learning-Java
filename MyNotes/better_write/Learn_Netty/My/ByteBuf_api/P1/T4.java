package better_write.Learn_Netty.My.ByteBuf_api.P1;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/11
 * \* Time: 11:13
 * \* Description:
 * \
 */
public class T4 {

    public static void main(String[] args) {

        ByteBuf b1 = Unpooled.copiedBuffer("string".getBytes());

        for (int i = 0; i < b1.capacity(); i++) {

            byte b = b1.getByte(i);

            System.out.println((char)b);
        }

    }
}
