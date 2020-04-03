package better_write.Java_NIO.learn_api.Buffer_api;

import java.nio.CharBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/2
 * \* Time: 11:13
 * \* Description:
 * \
 */
public class T2 {

    public static void main(String[] args) {

        char[] chars = new char[]{'a','b','c','d','e'};

        CharBuffer charBuffer = CharBuffer.wrap(chars);

        System.out.println("capacity : \n");

        System.out.println(charBuffer.capacity());

        System.out.println("");

        System.out.println("Limit : \n");

        System.out.println(charBuffer.limit());

        System.out.println("");

        charBuffer.limit(3);

        System.out.println("设置调整之后 : \n");

        System.out.println("capacity : \n");

        System.out.println(charBuffer.capacity());

        System.out.println("");

        System.out.println("Limit : \n");

        System.out.println(charBuffer.limit());

        System.out.println("");

        charBuffer.put(0,'0');

        charBuffer.put(1,'1');

        charBuffer.put(2,'2');

        charBuffer.put(3,'3');//报错

        charBuffer.put(4,'4');

        charBuffer.put(5,'5');

        charBuffer.put(6,'6');

    }
}
