package better_write.Java_NIO.learn_api.Buffer_api.P1;

import java.nio.Buffer;
import java.nio.CharBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/2
 * \* Time: 18:10
 * \* Description:
 * \
 */
public class T2 {

    public static void main(String[] args) {

        CharBuffer charBuffer = CharBuffer.allocate(20);

        print(charBuffer);

        charBuffer.put(" I am from China");

        System.out.println("-----------------------------");
        print(charBuffer);
        System.out.println("-----------------------------");
        charBuffer.position(0);
        print(charBuffer);
        System.out.println("-----------------------------");

        // 以下循环多输出了6个空格 为无效的数据
        // 正确的应该是只打印前面有效的字符 空格不在输出
        for (int i = 0; i < charBuffer.limit(); i++) {
            System.out.println(charBuffer.get());
        }

        /*
        上面为错误的读取数据示例
         */
        System.out.println("-----------------------------");

        print(charBuffer);
        System.out.println("-----------------------------");

        // 还原缓冲区状态
        charBuffer.clear();

        print(charBuffer);
        System.out.println("-----------------------------");

        charBuffer.put(" I ams usa");

        print(charBuffer);
        System.out.println("-----------------------------");

        /*
        以下操作是自己手动实现了 flip方法的逻辑
         */
        charBuffer.limit(charBuffer.position());

        charBuffer.position(0);

        print(charBuffer);
        System.out.println("-----------------------------");

        for (int i = 0; i < charBuffer.limit(); i++) {
            System.out.println(charBuffer.get());
        }

    }

    private static void print(Buffer buffer){
        System.out.println("position : \n"
        + buffer.position()
        +"\n"
        +"limit : \n"
        +buffer.limit());
    }
}
