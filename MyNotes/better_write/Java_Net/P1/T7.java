package better_write.Java_Net.P1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 19:34
 * \* Description:
 * \
 */
public class T7 {

    public static void main(String[] args) throws UnknownHostException {


        InetAddress address2 = InetAddress.getByName("www.baidu.com");

        InetAddress ip = InetAddress.getByName("192.168.0.100");

        InetAddress local = InetAddress.getByName("localhost");

        System.out.println(local.getClass().getName()+"  "
        + local.getHostAddress());

//

        System.out.println(address2.getClass().getName()
        +"   " + address2.getHostAddress());

        System.out.println(ip.getClass().getName()
        +"  "
        + ip.getHostAddress());

    }
}
