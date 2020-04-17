package better_write.Netty_Book.Tcp_Package.Package1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/16
 * \* Time: 21:10
 * \* Description:
 * \
 */
public class T {

    public static void main(String[] args) {

        byte[] req = ("QUERY TIME ORDER" + System.getProperty("line.separator")).getBytes();

        String s = "abc";
        byte[] bytes = s.getBytes();
        System.out.println(req.length);//18


        String msg = "hello from client "+ 1 + "\n";

        byte[] bytes1 = msg.getBytes();

        System.out.println(bytes1.length); // 20

    }
}
