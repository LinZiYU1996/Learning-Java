package better_write.Learn_Netty.My.ByteBuf_api.P1;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.CharsetUtil;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/11
 * \* Time: 10:48
 * \* Description:
 * \
 */
public class T3 {

    public static void main(String args[]){
        CompositeByteBuf messageBuf = Unpooled.compositeBuffer();
        ByteBuf headerBuf = Unpooled.copiedBuffer("head", CharsetUtil.UTF_8); // can be backing or direct
        ByteBuf bodyBuf = Unpooled.copiedBuffer("body", CharsetUtil.UTF_8); // can be backing or direct
        messageBuf.addComponents(headerBuf, bodyBuf);
        System.out.println("Remove Head Before------------------");
        printCompositeBuffer(messageBuf);
        for (ByteBuf buf : messageBuf) {
            System.out.println(buf.toString(CharsetUtil.UTF_8));
        }
        messageBuf.removeComponent(0); // remove the header
        System.out.println("Remove Head After------------------");
        printCompositeBuffer(messageBuf);
        for (ByteBuf buf : messageBuf) {
            System.out.println(buf.toString(CharsetUtil.UTF_8));
        }
    }

    public static void printCompositeBuffer(CompositeByteBuf compBuf){
        int length = compBuf.readableBytes();
        byte[] array = new byte[length];
        compBuf.getBytes(compBuf.readerIndex(), array);
        System.out.println (Arrays.toString(array));
        System.out.println (length);
    }

}
