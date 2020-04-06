package better_write.Java_Net.P1;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 11:58
 * \* Description:
 * \
 */
public class T4 {

    public static void main(String[] args) throws SocketException {

        Enumeration<NetworkInterface> networkInterfaceEnumeration = NetworkInterface.getNetworkInterfaces();

        while ( networkInterfaceEnumeration.hasMoreElements()) {

            NetworkInterface each = networkInterfaceEnumeration.nextElement();

            System.out.println("名称 : \n"
                    +each.getName());

            System.out.println("网卡物理地址:\n");

            byte[] bytes = each.getHardwareAddress();

            if (bytes != null && bytes.length != 0) {
                for (int i = 0; i < bytes.length; i++) {
                    System.out.print(bytes[i] + "  ");
                }
                System.out.println("");
            }


        }
    }
}

/*
"C:\Program Files\Java\jdk1.8.0_212\bin\java.exe" "-javaagent:E:\IDEA Develop\IntelliJ IDEA 2019.2.2\lib\idea_rt.jar=2525:E:\IDEA Develop\IntelliJ IDEA 2019.2.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_212\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\rt.jar;E:\learn-java\Learning-Java\output\production\Learning-Java" better_write.Java_Net.P1.T4
名称 :
lo
网卡物理地址:

名称 :
net0
网卡物理地址:

名称 :
eth0
网卡物理地址:

名称 :
net1
网卡物理地址:

名称 :
eth1
网卡物理地址:

名称 :
net2
网卡物理地址:

名称 :
ppp0
网卡物理地址:

名称 :
net3
网卡物理地址:

名称 :
eth2
网卡物理地址:

-28  84  -24  32  -81  -80
名称 :
eth3
网卡物理地址:

名称 :
eth4
网卡物理地址:

名称 :
wlan0
网卡物理地址:

-62  -75  -41  -47  50  -113
名称 :
eth5
网卡物理地址:

0  80  86  -64  0  8
名称 :
net4
网卡物理地址:

名称 :
net5
网卡物理地址:

名称 :
net6
网卡物理地址:

名称 :
wlan1
网卡物理地址:

-64  -75  -41  -47  50  -113
名称 :
eth6
网卡物理地址:

0  80  86  -64  0  1
名称 :
eth7
网卡物理地址:

名称 :
wlan2
网卡物理地址:

-46  -75  -41  -47  50  -113
名称 :
eth8
网卡物理地址:

名称 :
eth9
网卡物理地址:

名称 :
eth10
网卡物理地址:

名称 :
wlan3
网卡物理地址:

名称 :
wlan4
网卡物理地址:

名称 :
wlan5
网卡物理地址:

名称 :
wlan6
网卡物理地址:

名称 :
wlan7
网卡物理地址:

名称 :
wlan8
网卡物理地址:

名称 :
wlan9
网卡物理地址:

名称 :
eth11
网卡物理地址:

名称 :
eth12
网卡物理地址:

名称 :
eth13
网卡物理地址:

名称 :
eth14
网卡物理地址:

名称 :
eth15
网卡物理地址:

名称 :
eth16
网卡物理地址:

名称 :
wlan10
网卡物理地址:

名称 :
wlan11
网卡物理地址:

名称 :
wlan12
网卡物理地址:

名称 :
wlan13
网卡物理地址:

名称 :
wlan14
网卡物理地址:

名称 :
wlan15
网卡物理地址:


Process finished with exit code 0

 */
