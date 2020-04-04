package better_write.Java_NIO.learn_api.ByteBuffer_api.P2;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/3
 * \* Time: 11:30
 * \* Description:
 * \
 */
public class T9 {

    public static void main(String[] args) throws UnsupportedEncodingException {

        byte[] bs1 = "我是中国人".getBytes("utf-8");

        System.out.println(Charset.defaultCharset().name());

        ByteBuffer buffer = ByteBuffer.wrap(bs1);
        CharBuffer charBuffer = Charset.forName("utf-8").decode(buffer);

        charBuffer.position(0);

        for (int i = 0; i < charBuffer.limit(); i++) {
            System.out.print(charBuffer.get() + "  ");
        }


    }
}
