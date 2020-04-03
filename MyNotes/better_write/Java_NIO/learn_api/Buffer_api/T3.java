package better_write.Java_NIO.learn_api.Buffer_api;

import java.nio.Buffer;
import java.nio.CharBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/2
 * \* Time: 11:38
 * \* Description:
 * \
 */
public class T3 {


    public static void main(String[] args) {

        char[] chars = new char[]{'a','b','c','d','e'};

        CharBuffer charBuffer = CharBuffer.wrap(chars);

        print(charBuffer);

        System.out.println("-----------");

        charBuffer.position(2);

        print(charBuffer);

        System.out.println("-----------");

        charBuffer.put('1');

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i] + "   ");
        }
    }

    private static void print(Buffer buffer) {

        System.out.println("Capacity : " + buffer.capacity()

        +"   " + "limit :  " + buffer.limit() + "   "
        + "position : " + buffer.position());

    }
}
