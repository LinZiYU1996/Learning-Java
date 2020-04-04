package better_write.Java_NIO.learn_api.ByteBuffer_api.P2;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/3
 * \* Time: 11:13
 * \* Description:
 * \
 */
public class T7 {

    public static void main(String[] args) {

        byte[] bs1 = "我是中国人".getBytes();

        // 运行本代码的*.java文件是UTF-8编码，所以运行环境取得的编码默认是UTF-8
        System.out.println(Charset.defaultCharset().name());

        System.out.println("");

        ByteBuffer b1 = ByteBuffer.wrap(bs1);
        System.out.println("bytebuffer =   " + b1.getClass().getName());

        System.out.println("");

        CharBuffer charBuffer = b1.asCharBuffer();

        System.out.println("charbuffer   " + charBuffer.getClass().getName());

        System.out.println();

        System.out.println("b1 position   "
        + b1.position()
        +"\n"
        +"b1 capacity  "
        + b1.capacity()
        +"\n"
        +"b1 limit   "
        +b1.limit());

        System.out.println("");

        System.out.println("c1 position   "
                + charBuffer.position()
                +"\n"
                +"c1 capacity  "
                + charBuffer.capacity()
                +"\n"
                +"c1 limit   "
                +charBuffer.limit());

        System.out.println("");

        System.out.println(charBuffer.capacity());

        charBuffer.position(0);

        for (int i = 0; i < charBuffer.capacity(); i++) {

            // get()方法时使用的编码 Wie UTF-16BE
            // 所以乱码了
            System.out.print(charBuffer.get() + "  ");
        }


    }
}
