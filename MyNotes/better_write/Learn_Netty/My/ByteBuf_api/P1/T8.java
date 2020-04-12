package better_write.Learn_Netty.My.ByteBuf_api.P1;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/11
 * \* Time: 11:37
 * \* Description:
 * \
 */
public class T8 {

    public static void main(String[] args) {

        ByteBuf buf = Unpooled.buffer(10);

        while (buf.writableBytes() >= 4) {

            buf.writeInt(5);

        }

        for (int i = 0; i < buf.capacity(); i++) {
            System.out.print(buf.getByte(i));
        }
    }
}
