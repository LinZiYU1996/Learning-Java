package jvm.D1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/18
 * \* Time: 19:48
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) {

        Passenger passenger = new Chinese();

        passenger.go_abroad();

    }
}


//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\D1>javap -v T1
//        警告: 二进制文件T1包含jvm.D1.T1
//        Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/jvm/D1/T1.class
//Last modified 2020-3-18; size 495 bytes
//        MD5 checksum 40288af52b80a6bfee06799a1784a9c8
//        Compiled from "T1.java"
//public class jvm.D1.T1
//        minor version: 0
//        major version: 52
//        flags: ACC_PUBLIC, ACC_SUPER
//        Constant pool:
//        #1 = Methodref          #6.#22         // java/lang/Object."<init>":()V
//        #2 = Class              #23            // jvm/D1/Chinese
//        #3 = Methodref          #2.#22         // jvm/D1/Chinese."<init>":()V
//        #4 = Methodref          #24.#25        // jvm/D1/Passenger.go_abroad:()V
//        #5 = Class              #26            // jvm/D1/T1
//        #6 = Class              #27            // java/lang/Object
//        #7 = Utf8               <init>
//   #8 = Utf8               ()V
//           #9 = Utf8               Code
//           #10 = Utf8               LineNumberTable
//           #11 = Utf8               LocalVariableTable
//           #12 = Utf8               this
//           #13 = Utf8               Ljvm/D1/T1;
//           #14 = Utf8               main
//           #15 = Utf8               ([Ljava/lang/String;)V
//           #16 = Utf8               args
//           #17 = Utf8               [Ljava/lang/String;
//           #18 = Utf8               passenger
//           #19 = Utf8               Ljvm/D1/Passenger;
//           #20 = Utf8               SourceFile
//           #21 = Utf8               T1.java
//           #22 = NameAndType        #7:#8          // "<init>":()V
//           #23 = Utf8               jvm/D1/Chinese
//           #24 = Class              #28            // jvm/D1/Passenger
//           #25 = NameAndType        #29:#8         // go_abroad:()V
//           #26 = Utf8               jvm/D1/T1
//           #27 = Utf8               java/lang/Object
//           #28 = Utf8               jvm/D1/Passenger
//           #29 = Utf8               go_abroad
//           {
//public jvm.D1.T1();
//        descriptor: ()V
//        flags: ACC_PUBLIC
//        Code:
//        stack=1, locals=1, args_size=1
//        0: aload_0
//        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        4: return
//        LineNumberTable:
//        line 11: 0
//        LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//        0       5     0  this   Ljvm/D1/T1;
//
//public static void main(java.lang.String[]);
//        descriptor: ([Ljava/lang/String;)V
//        flags: ACC_PUBLIC, ACC_STATIC
//        Code:
//        stack=2, locals=2, args_size=1
//        0: new           #2                  // class jvm/D1/Chinese
//        3: dup
//        4: invokespecial #3                  // Method jvm/D1/Chinese."<init>":()V
//        7: astore_1
//        8: aload_1
//        9: invokevirtual #4                  // Method jvm/D1/Passenger.go_abroad:()V
//        12: return
//        LineNumberTable:
//        line 15: 0
//        line 17: 8
//        line 19: 12
//        LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//        0      13     0  args   [Ljava/lang/String;
//        8       5     1 passenger   Ljvm/D1/Passenger;
//        }
//        SourceFile: "T1.java"
//
//        E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\D1>
