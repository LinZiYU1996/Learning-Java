package better_write.Java_NIO.learn_api.Buffer_api;

import java.nio.Buffer;
import java.nio.CharBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/2
 * \* Time: 11:50
 * \* Description:
 * \
 */
public class T4 {

    public static void main(String[] args) {
        char[] chars = new char[]{'a','b','c','d','e'};

        CharBuffer charBuffer = CharBuffer.wrap(chars);

        print(charBuffer);

        System.out.println("-----------");

        charBuffer.position(2);

        print(charBuffer);

        System.out.println("-----------");

        System.out.println("remaining   " + charBuffer.remaining());

    }

    private static void print(Buffer buffer) {

        System.out.println("Capacity : " + buffer.capacity()

                +"   " + "limit :  " + buffer.limit() + "   "
                + "position : " + buffer.position());

    }
}
