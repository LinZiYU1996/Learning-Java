package better_write.Java_Net.P1;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 11:36
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) throws SocketException {

        Enumeration<NetworkInterface> networkInterfaceEnumeration = NetworkInterface.getNetworkInterfaces();

        while ( networkInterfaceEnumeration.hasMoreElements()) {

            NetworkInterface networkInterface = networkInterfaceEnumeration.nextElement();

            System.out.println("getNama 获取网络设备名称 \n"
            + networkInterface.getName());

            System.out.println("");

            System.out.println("getDisplayName 获取网络设备显示名称\n"
            + networkInterface.getDisplayName());

            System.out.println("");

            System.out.println("Getindex 获取网络接口的索引\n"
            +networkInterface.getIndex());

            System.out.println("");

            System.out.println("isUp 是否已经开启并且运行\n"
            + networkInterface.isUp());

            System.out.println("");

            System.out.println("------------------------------------------");




        }



    }
}


/*
"C:\Program Files\Java\jdk1.8.0_212\bin\java.exe" "-javaagent:E:\IDEA Develop\IntelliJ IDEA 2019.2.2\lib\idea_rt.jar=2226:E:\IDEA Develop\IntelliJ IDEA 2019.2.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_212\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\rt.jar;E:\learn-java\Learning-Java\output\production\Learning-Java" better_write.Java_Net.P1.T1
getNama 获取网络设备名称
lo

getDisplayName 获取网络设备显示名称
Software Loopback Interface 1

Getindex 获取网络接口的索引
1

isUp 是否已经开启并且运行
true

------------------------------------------
getNama 获取网络设备名称
net0

getDisplayName 获取网络设备显示名称
Microsoft 6to4 Adapter

Getindex 获取网络接口的索引
2

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
eth0

getDisplayName 获取网络设备显示名称
WAN Miniport (Network Monitor)

Getindex 获取网络接口的索引
3

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
net1

getDisplayName 获取网络设备显示名称
WAN Miniport (IKEv2)

Getindex 获取网络接口的索引
4

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
eth1

getDisplayName 获取网络设备显示名称
WAN Miniport (IPv6)

Getindex 获取网络接口的索引
5

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
net2

getDisplayName 获取网络设备显示名称
Microsoft IP-HTTPS Platform Adapter

Getindex 获取网络接口的索引
6

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
ppp0

getDisplayName 获取网络设备显示名称
WAN Miniport (PPPOE)

Getindex 获取网络接口的索引
7

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
net3

getDisplayName 获取网络设备显示名称
WAN Miniport (L2TP)

Getindex 获取网络接口的索引
8

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
eth2

getDisplayName 获取网络设备显示名称
Realtek PCIe GbE Family Controller

Getindex 获取网络接口的索引
9

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
eth3

getDisplayName 获取网络设备显示名称
WAN Miniport (IP)

Getindex 获取网络接口的索引
10

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
eth4

getDisplayName 获取网络设备显示名称
Bluetooth Device (Personal Area Network)

Getindex 获取网络接口的索引
11

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
wlan0

getDisplayName 获取网络设备显示名称
Microsoft Wi-Fi Direct Virtual Adapter

Getindex 获取网络接口的索引
12

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
eth5

getDisplayName 获取网络设备显示名称
VMware Virtual Ethernet Adapter for VMnet8

Getindex 获取网络接口的索引
13

isUp 是否已经开启并且运行
true

------------------------------------------
getNama 获取网络设备名称
net4

getDisplayName 获取网络设备显示名称
WAN Miniport (SSTP)

Getindex 获取网络接口的索引
14

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
net5

getDisplayName 获取网络设备显示名称
Microsoft Teredo Tunneling Adapter

Getindex 获取网络接口的索引
15

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
net6

getDisplayName 获取网络设备显示名称
WAN Miniport (PPTP)

Getindex 获取网络接口的索引
16

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
wlan1

getDisplayName 获取网络设备显示名称
Qualcomm QCA9377 802.11ac Wireless Adapter

Getindex 获取网络接口的索引
17

isUp 是否已经开启并且运行
true

------------------------------------------
getNama 获取网络设备名称
eth6

getDisplayName 获取网络设备显示名称
VMware Virtual Ethernet Adapter for VMnet1

Getindex 获取网络接口的索引
18

isUp 是否已经开启并且运行
true

------------------------------------------
getNama 获取网络设备名称
eth7

getDisplayName 获取网络设备显示名称
Microsoft Kernel Debug Network Adapter

Getindex 获取网络接口的索引
19

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
wlan2

getDisplayName 获取网络设备显示名称
Microsoft Wi-Fi Direct Virtual Adapter #2

Getindex 获取网络接口的索引
20

isUp 是否已经开启并且运行
true

------------------------------------------
getNama 获取网络设备名称
eth8

getDisplayName 获取网络设备显示名称
Realtek PCIe GbE Family Controller-WFP Native MAC Layer LightWeight Filter-0000

Getindex 获取网络接口的索引
21

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
eth9

getDisplayName 获取网络设备显示名称
Realtek PCIe GbE Family Controller-QoS Packet Scheduler-0000

Getindex 获取网络接口的索引
22

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
eth10

getDisplayName 获取网络设备显示名称
Realtek PCIe GbE Family Controller-WFP 802.3 MAC Layer LightWeight Filter-0000

Getindex 获取网络接口的索引
23

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
wlan3

getDisplayName 获取网络设备显示名称
Qualcomm QCA9377 802.11ac Wireless Adapter-WFP Native MAC Layer LightWeight Filter-0000

Getindex 获取网络接口的索引
24

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
wlan4

getDisplayName 获取网络设备显示名称
Qualcomm QCA9377 802.11ac Wireless Adapter-Virtual WiFi Filter Driver-0000

Getindex 获取网络接口的索引
25

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
wlan5

getDisplayName 获取网络设备显示名称
Qualcomm QCA9377 802.11ac Wireless Adapter-Native WiFi Filter Driver-0000

Getindex 获取网络接口的索引
26

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
wlan6

getDisplayName 获取网络设备显示名称
Qualcomm QCA9377 802.11ac Wireless Adapter-QoS Packet Scheduler-0000

Getindex 获取网络接口的索引
27

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
wlan7

getDisplayName 获取网络设备显示名称
Qualcomm QCA9377 802.11ac Wireless Adapter-WFP 802.3 MAC Layer LightWeight Filter-0000

Getindex 获取网络接口的索引
28

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
wlan8

getDisplayName 获取网络设备显示名称
Microsoft Wi-Fi Direct Virtual Adapter #2-WFP Native MAC Layer LightWeight Filter-0000

Getindex 获取网络接口的索引
29

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
wlan9

getDisplayName 获取网络设备显示名称
Microsoft Wi-Fi Direct Virtual Adapter-WFP Native MAC Layer LightWeight Filter-0000

Getindex 获取网络接口的索引
30

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
eth11

getDisplayName 获取网络设备显示名称
WAN Miniport (IP)-WFP Native MAC Layer LightWeight Filter-0000

Getindex 获取网络接口的索引
31

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
eth12

getDisplayName 获取网络设备显示名称
WAN Miniport (IP)-QoS Packet Scheduler-0000

Getindex 获取网络接口的索引
32

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
eth13

getDisplayName 获取网络设备显示名称
WAN Miniport (IPv6)-WFP Native MAC Layer LightWeight Filter-0000

Getindex 获取网络接口的索引
33

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
eth14

getDisplayName 获取网络设备显示名称
WAN Miniport (IPv6)-QoS Packet Scheduler-0000

Getindex 获取网络接口的索引
34

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
eth15

getDisplayName 获取网络设备显示名称
WAN Miniport (Network Monitor)-WFP Native MAC Layer LightWeight Filter-0000

Getindex 获取网络接口的索引
35

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
eth16

getDisplayName 获取网络设备显示名称
WAN Miniport (Network Monitor)-QoS Packet Scheduler-0000

Getindex 获取网络接口的索引
36

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
wlan10

getDisplayName 获取网络设备显示名称
Microsoft Wi-Fi Direct Virtual Adapter-Native WiFi Filter Driver-0000

Getindex 获取网络接口的索引
37

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
wlan11

getDisplayName 获取网络设备显示名称
Microsoft Wi-Fi Direct Virtual Adapter-QoS Packet Scheduler-0000

Getindex 获取网络接口的索引
38

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
wlan12

getDisplayName 获取网络设备显示名称
Microsoft Wi-Fi Direct Virtual Adapter-WFP 802.3 MAC Layer LightWeight Filter-0000

Getindex 获取网络接口的索引
39

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
wlan13

getDisplayName 获取网络设备显示名称
Microsoft Wi-Fi Direct Virtual Adapter #2-Native WiFi Filter Driver-0000

Getindex 获取网络接口的索引
40

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
wlan14

getDisplayName 获取网络设备显示名称
Microsoft Wi-Fi Direct Virtual Adapter #2-QoS Packet Scheduler-0000

Getindex 获取网络接口的索引
41

isUp 是否已经开启并且运行
false

------------------------------------------
getNama 获取网络设备名称
wlan15

getDisplayName 获取网络设备显示名称
Microsoft Wi-Fi Direct Virtual Adapter #2-WFP 802.3 MAC Layer LightWeight Filter-0000

Getindex 获取网络接口的索引
42

isUp 是否已经开启并且运行
false

------------------------------------------

Process finished with exit code 0

 */