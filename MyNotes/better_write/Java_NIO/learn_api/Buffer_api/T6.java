package better_write.Java_NIO.learn_api.Buffer_api;

import java.nio.CharBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/2
 * \* Time: 12:01
 * \* Description:
 * \
 */
public class T6 {

    public static void main(String[] args) {


        char[] chars = new char[]{'a','b','c','d','e'};

        CharBuffer charBuffer = CharBuffer.wrap(chars);

        System.out.println("capacity        " + charBuffer.capacity());

        charBuffer.position(1);

        charBuffer.mark(); // 位置1设置标记

        System.out.println("position        " + charBuffer.position());

        System.out.println("-----------");


        charBuffer.position(2);

        System.out.println("position        " + charBuffer.position());


        charBuffer.reset();

        System.out.println("---------");

        System.out.println("reset \n");
        System.out.println("position        " + charBuffer.position());


    }
}
