package better_write.Java_NIO.learn_api.Buffer_api.Demo;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/2
 * \* Time: 12:05
 * \* Description:
 * \
 */
public class D1 {

    // capacity limit  position 不可为负数
    public static void main(String[] args) {

        try {
            ByteBuffer byteBuffer = ByteBuffer.allocate(-1);

        } catch (IllegalArgumentException e) {
            System.out.println("capacity 不可为负数");
        }

        System.out.println("-----------------------------");

        char[] chars = new char[]{'a','b','c','d','e'};

        CharBuffer charBuffer = CharBuffer.wrap(chars);

        try {
            charBuffer = (CharBuffer) charBuffer.position(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("position 不可为负数");
        }

        System.out.println("--------------------------------------------");

        try {
            charBuffer = (CharBuffer) charBuffer.limit(-1);
        }catch (IllegalArgumentException e) {
            System.out.println("limit 不可为负数");
        }
    }
}
