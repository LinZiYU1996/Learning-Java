package better_write.Java_Net.P1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 19:30
 * \* Description:
 * \
 */
public class T6 {

    public static void main(String[] args) throws UnknownHostException {

        InetAddress inetAddress = InetAddress.getLocalHost();

        System.out.println("地址");

        byte[] bytes = inetAddress.getAddress();

        for (int i = 0; i < bytes.length; i++) {
            System.out.print("  " + bytes[i] + "   ");
        }

        System.out.println("");

        System.out.println("  " + inetAddress.getClass().getName());

        System.out.println("地址");

        InetAddress look = InetAddress.getLoopbackAddress();

        byte[] bytes2 = look.getAddress();

        for (int i = 0; i <bytes2.length ; i++) {
            System.out.print("   " + bytes2[i] + "  ");
        }
        System.out.println("");
        System.out.println("  " + inetAddress.getClass().getName());
    }
}
