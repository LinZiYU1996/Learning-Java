package better_write.Java_Net.P1;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 11:52
 * \* Description:
 * \
 */
public class T3 {

    public static void main(String[] args) throws SocketException {

        Enumeration<NetworkInterface> networkInterfaceEnumeration = NetworkInterface.getNetworkInterfaces();

        while ( networkInterfaceEnumeration.hasMoreElements()) {

            NetworkInterface networkInterface = networkInterfaceEnumeration.nextElement();

            System.out.println("父接口的hashcode:\n"
            +networkInterface.hashCode());

            System.out.println("");

            System.out.println("名称 : \n"
            +networkInterface.getName());

            System.out.println("");

            System.out.println("是否为虚拟接口 : \n"
            + networkInterface.isVirtual());

            System.out.println("");

            System.out.println("获取父接口 :\n"
            + networkInterface.getParent());

            System.out.println("");

            System.out.println("获取子接口信息 : \n");

            Enumeration<NetworkInterface> sub = networkInterface.getSubInterfaces();

            while (sub.hasMoreElements()) {

                NetworkInterface each = sub.nextElement();
                System.out.println("名称 : \n"
                        +each.getName());

                System.out.println("是否为虚拟接口 : \n"
                        + each.isVirtual());

                System.out.println("父接口的hashcode:\n"
                        +each.hashCode());

            }

        }



    }
}


/*
"C:\Program Files\Java\jdk1.8.0_212\bin\java.exe" "-javaagent:E:\IDEA Develop\IntelliJ IDEA 2019.2.2\lib\idea_rt.jar=2408:E:\IDEA Develop\IntelliJ IDEA 2019.2.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_212\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\rt.jar;E:\learn-java\Learning-Java\output\production\Learning-Java" better_write.Java_Net.P1.T3
父接口的hashcode:
3459

名称 :
lo

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
3377715

名称 :
net0

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
3123639

名称 :
eth0

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
3377716

名称 :
net1

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
3123640

名称 :
eth1

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
3377717

名称 :
net2

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
3447744

名称 :
ppp0

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
3377718

名称 :
net3

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
3123641

名称 :
eth2

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
3123642

名称 :
eth3

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
3123643

名称 :
eth4

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
113213102

名称 :
wlan0

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
3123644

名称 :
eth5

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
3377719

名称 :
net4

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
3377720

名称 :
net5

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
3377721

名称 :
net6

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
113213103

名称 :
wlan1

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
3123645

名称 :
eth6

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
3123646

名称 :
eth7

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
113213104

名称 :
wlan2

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
3123647

名称 :
eth8

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
3123648

名称 :
eth9

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
96832888

名称 :
eth10

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
113213105

名称 :
wlan3

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
113213106

名称 :
wlan4

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
113213107

名称 :
wlan5

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
113213108

名称 :
wlan6

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
113213109

名称 :
wlan7

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
113213110

名称 :
wlan8

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
113213111

名称 :
wlan9

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
96832889

名称 :
eth11

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
96832890

名称 :
eth12

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
96832891

名称 :
eth13

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
96832892

名称 :
eth14

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
96832893

名称 :
eth15

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
96832894

名称 :
eth16

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
-785361055

名称 :
wlan10

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
-785361054

名称 :
wlan11

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
-785361053

名称 :
wlan12

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
-785361052

名称 :
wlan13

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
-785361051

名称 :
wlan14

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :

父接口的hashcode:
-785361050

名称 :
wlan15

是否为虚拟接口 :
false

获取父接口 :
null

获取子接口信息 :


Process finished with exit code 0

 */