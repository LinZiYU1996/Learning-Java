package better_write.Java_Net.P1;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 11:48
 * \* Description:
 * \
 */
public class T2 {

    public static void main(String[] args) throws SocketException {

        Enumeration<NetworkInterface> networkInterfaceEnumeration = NetworkInterface.getNetworkInterfaces();

        while (networkInterfaceEnumeration.hasMoreElements()) {

            NetworkInterface networkInterface = networkInterfaceEnumeration.nextElement();
            System.out.println("getNama 获取网络设备名称 \n"
                    + networkInterface.getName());
            System.out.println("");

            System.out.println("最大传输单元 \n"
            + networkInterface.getMTU());
        }
    }
}
/*
"C:\Program Files\Java\jdk1.8.0_212\bin\java.exe" "-javaagent:E:\IDEA Develop\IntelliJ IDEA 2019.2.2\lib\idea_rt.jar=2307:E:\IDEA Develop\IntelliJ IDEA 2019.2.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_212\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\rt.jar;E:\learn-java\Learning-Java\output\production\Learning-Java" better_write.Java_Net.P1.T2
getNama 获取网络设备名称
lo

最大传输单元
-1
getNama 获取网络设备名称
net0

最大传输单元
-1
getNama 获取网络设备名称
eth0

最大传输单元
-1
getNama 获取网络设备名称
net1

最大传输单元
-1
getNama 获取网络设备名称
eth1

最大传输单元
-1
getNama 获取网络设备名称
net2

最大传输单元
-1
getNama 获取网络设备名称
ppp0

最大传输单元
-1
getNama 获取网络设备名称
net3

最大传输单元
-1
getNama 获取网络设备名称
eth2

最大传输单元
1500
getNama 获取网络设备名称
eth3

最大传输单元
-1
getNama 获取网络设备名称
eth4

最大传输单元
-1
getNama 获取网络设备名称
wlan0

最大传输单元
1500
getNama 获取网络设备名称
eth5

最大传输单元
1500
getNama 获取网络设备名称
net4

最大传输单元
-1
getNama 获取网络设备名称
net5

最大传输单元
-1
getNama 获取网络设备名称
net6

最大传输单元
-1
getNama 获取网络设备名称
wlan1

最大传输单元
1500
getNama 获取网络设备名称
eth6

最大传输单元
1500
getNama 获取网络设备名称
eth7

最大传输单元
-1
getNama 获取网络设备名称
wlan2

最大传输单元
1500
getNama 获取网络设备名称
eth8

最大传输单元
-1
getNama 获取网络设备名称
eth9

最大传输单元
-1
getNama 获取网络设备名称
eth10

最大传输单元
-1
getNama 获取网络设备名称
wlan3

最大传输单元
-1
getNama 获取网络设备名称
wlan4

最大传输单元
-1
getNama 获取网络设备名称
wlan5

最大传输单元
-1
getNama 获取网络设备名称
wlan6

最大传输单元
-1
getNama 获取网络设备名称
wlan7

最大传输单元
-1
getNama 获取网络设备名称
wlan8

最大传输单元
-1
getNama 获取网络设备名称
wlan9

最大传输单元
-1
getNama 获取网络设备名称
eth11

最大传输单元
-1
getNama 获取网络设备名称
eth12

最大传输单元
-1
getNama 获取网络设备名称
eth13

最大传输单元
-1
getNama 获取网络设备名称
eth14

最大传输单元
-1
getNama 获取网络设备名称
eth15

最大传输单元
-1
getNama 获取网络设备名称
eth16

最大传输单元
-1
getNama 获取网络设备名称
wlan10

最大传输单元
-1
getNama 获取网络设备名称
wlan11

最大传输单元
-1
getNama 获取网络设备名称
wlan12

最大传输单元
-1
getNama 获取网络设备名称
wlan13

最大传输单元
-1
getNama 获取网络设备名称
wlan14

最大传输单元
-1
getNama 获取网络设备名称
wlan15

最大传输单元
-1

Process finished with exit code 0

 */