package better_write.Java_Socket.P7;


import java.io.IOException;
import java.nio.channels.Selector;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 9:25
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) throws IOException {

        Selector selector = Selector.open();
        System.out.println(selector);

    }
}
