package better_write.Java_Net.P1;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 19:25
 * \* Description:
 * \
 */
public class T5 {

    public static void main(String[] args) throws SocketException {

        Enumeration<NetworkInterface> networkInterfaceEnumeration = NetworkInterface.getNetworkInterfaces();

        while (networkInterfaceEnumeration.hasMoreElements()) {

            NetworkInterface each = networkInterfaceEnumeration.nextElement();

            Enumeration<InetAddress> inetAddressEnumeration = each.getInetAddresses();

            while (inetAddressEnumeration.hasMoreElements()) {

                InetAddress inetAddress = inetAddressEnumeration.nextElement();

                System.out.println(inetAddress.getCanonicalHostName());

                System.out.println("");

                System.out.println(inetAddress.getHostAddress());

                System.out.println("");

                System.out.println(inetAddress.getAddress());

                System.out.println("-------------------------------------");

            }

        }


    }


}
