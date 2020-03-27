package better_write.Java_performance_tuning.A3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/25
 * \* Time: 9:44
 * \* Description:
 * \
 */
public class T4 {


    public static void main(String[] args) {
        //字符串常量的累计

        String s = "a" + "b" + "c";

        System.out.println(s);

    }
}
//E:\learn-java\Learning-Java\output\production\Learning-Java\better_write\Java_performance_tuning\A3>javap -v T4
//警告: 二进制文件T4包含better_write.Java_performance_tuning.A3.T4
//Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/better_write/Java_performance_tuning/A3/T4.class
//  Last modified 2020-3-25; size 622 bytes
//  MD5 checksum 41f5d41553a076d7a6d69e5d6a4e2e53
//  Compiled from "T4.java"
//public class better_write.Java_performance_tuning.A3.T4
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Methodref          #6.#22         // java/lang/Object."<init>":()V
//   #2 = String             #23            // abc
//   #3 = Fieldref           #24.#25        // java/lang/System.out:Ljava/io/PrintStream;
//   #4 = Methodref          #26.#27        // java/io/PrintStream.println:(Ljava/lang/String;)V
//   #5 = Class              #28            // better_write/Java_performance_tuning/A3/T4
//   #6 = Class              #29            // java/lang/Object
//   #7 = Utf8               <init>
//   #8 = Utf8               ()V
//   #9 = Utf8               Code
//  #10 = Utf8               LineNumberTable
//  #11 = Utf8               LocalVariableTable
//  #12 = Utf8               this
//  #13 = Utf8               Lbetter_write/Java_performance_tuning/A3/T4;
//  #14 = Utf8               main
//  #15 = Utf8               ([Ljava/lang/String;)V
//  #16 = Utf8               args
//  #17 = Utf8               [Ljava/lang/String;
//  #18 = Utf8               s
//  #19 = Utf8               Ljava/lang/String;
//  #20 = Utf8               SourceFile
//  #21 = Utf8               T4.java
//  #22 = NameAndType        #7:#8          // "<init>":()V
//  #23 = Utf8               abc
//  #24 = Class              #30            // java/lang/System
//  #25 = NameAndType        #31:#32        // out:Ljava/io/PrintStream;
//  #26 = Class              #33            // java/io/PrintStream
//  #27 = NameAndType        #34:#35        // println:(Ljava/lang/String;)V
//  #28 = Utf8               better_write/Java_performance_tuning/A3/T4
//  #29 = Utf8               java/lang/Object
//  #30 = Utf8               java/lang/System
//  #31 = Utf8               out
//  #32 = Utf8               Ljava/io/PrintStream;
//  #33 = Utf8               java/io/PrintStream
//  #34 = Utf8               println
//  #35 = Utf8               (Ljava/lang/String;)V
//{
//  public better_write.Java_performance_tuning.A3.T4();
//    descriptor: ()V
//    flags: ACC_PUBLIC
//    Code:
//      stack=1, locals=1, args_size=1
//         0: aload_0
//         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//         4: return
//      LineNumberTable:
//        line 11: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       5     0  this   Lbetter_write/Java_performance_tuning/A3/T4;
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=2, locals=2, args_size=1
//         0: ldc           #2                  // String abc
//         2: astore_1
//         3: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
//         6: aload_1
//         7: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        10: return
//      LineNumberTable:
//        line 16: 0
//        line 18: 3
//        line 20: 10
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      11     0  args   [Ljava/lang/String;
//            3       8     1     s   Ljava/lang/String;
//}
//SourceFile: "T4.java"
//
//E:\learn-java\Learning-Java\output\production\Learning-Java\better_write\Java_performance_tuning\A3>


// 反编译class文件

//// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
//// Jad home page: http://www.kpdus.com/jad.html
//// Decompiler options: packimports(3)
//// Source File Name:   T4.java
//
//package better_write.Java_performance_tuning.A3;
//
//import java.io.PrintStream;
//
//public class T4
//{
//
//    public T4()
//    {
//    }
//
//    public static void main(String args[])
//    {
//        String s = "abc";
//        System.out.println(s);
//    }
//}

