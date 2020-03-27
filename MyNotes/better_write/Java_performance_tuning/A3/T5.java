package better_write.Java_performance_tuning.A3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/25
 * \* Time: 9:48
 * \* Description:
 * \
 */
public class T5 {


    public static void main(String[] args) {

        //字符串变量的累计
        String str = "abcdef";

        for(int i=0; i<1000; i++) {
            str = str + i;
        }

    }
}


//E:\learn-java\Learning-Java\output\production\Learning-Java\better_write\Java_performance_tuning\A3>javap -v T5
//警告: 二进制文件T5包含better_write.Java_performance_tuning.A3.T5
//Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/better_write/Java_performance_tuning/A3/T5.class
//  Last modified 2020-3-25; size 791 bytes
//  MD5 checksum 222b0814fa514e4b3977f66299cc3e00
//  Compiled from "T5.java"
//public class better_write.Java_performance_tuning.A3.T5
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Methodref          #9.#29         // java/lang/Object."<init>":()V
//   #2 = String             #30            // abcdef
//   #3 = Class              #31            // java/lang/StringBuilder
//   #4 = Methodref          #3.#29         // java/lang/StringBuilder."<init>":()V
//   #5 = Methodref          #3.#32         // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//   #6 = Methodref          #3.#33         // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
//   #7 = Methodref          #3.#34         // java/lang/StringBuilder.toString:()Ljava/lang/String;
//   #8 = Class              #35            // better_write/Java_performance_tuning/A3/T5
//   #9 = Class              #36            // java/lang/Object
//  #10 = Utf8               <init>
//  #11 = Utf8               ()V
//  #12 = Utf8               Code
//  #13 = Utf8               LineNumberTable
//  #14 = Utf8               LocalVariableTable
//  #15 = Utf8               this
//  #16 = Utf8               Lbetter_write/Java_performance_tuning/A3/T5;
//  #17 = Utf8               main
//  #18 = Utf8               ([Ljava/lang/String;)V
//  #19 = Utf8               i
//  #20 = Utf8               I
//  #21 = Utf8               args
//  #22 = Utf8               [Ljava/lang/String;
//  #23 = Utf8               str
//  #24 = Utf8               Ljava/lang/String;
//  #25 = Utf8               StackMapTable
//  #26 = Class              #37            // java/lang/String
//  #27 = Utf8               SourceFile
//  #28 = Utf8               T5.java
//  #29 = NameAndType        #10:#11        // "<init>":()V
//  #30 = Utf8               abcdef
//  #31 = Utf8               java/lang/StringBuilder
//  #32 = NameAndType        #38:#39        // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//  #33 = NameAndType        #38:#40        // append:(I)Ljava/lang/StringBuilder;
//  #34 = NameAndType        #41:#42        // toString:()Ljava/lang/String;
//  #35 = Utf8               better_write/Java_performance_tuning/A3/T5
//  #36 = Utf8               java/lang/Object
//  #37 = Utf8               java/lang/String
//  #38 = Utf8               append
//  #39 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
//  #40 = Utf8               (I)Ljava/lang/StringBuilder;
//  #41 = Utf8               toString
//  #42 = Utf8               ()Ljava/lang/String;
//{
//  public better_write.Java_performance_tuning.A3.T5();
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
//            0       5     0  this   Lbetter_write/Java_performance_tuning/A3/T5;
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=2, locals=3, args_size=1
//         0: ldc           #2                  // String abcdef
//         2: astore_1
//         3: iconst_0
//         4: istore_2
//         5: iload_2
//         6: sipush        1000
//         9: if_icmpge     37
//        12: new           #3                  // class java/lang/StringBuilder
//        15: dup
//        16: invokespecial #4                  // Method java/lang/StringBuilder."<init>":()V
//        19: aload_1
//        20: invokevirtual #5                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//        23: iload_2
//        24: invokevirtual #6                  // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
//        27: invokevirtual #7                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
//        30: astore_1
//        31: iinc          2, 1
//        34: goto          5
//        37: return
//      LineNumberTable:
//        line 16: 0
//        line 18: 3
//        line 19: 12
//        line 18: 31
//        line 22: 37
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            5      32     2     i   I
//            0      38     0  args   [Ljava/lang/String;
//            3      35     1   str   Ljava/lang/String;
//      StackMapTable: number_of_entries = 2
//        frame_type = 253 /* append */
//          offset_delta = 5
//          locals = [ class java/lang/String, int ]
//        frame_type = 250 /* chop */
//          offset_delta = 31
//}
//SourceFile: "T5.java"
//
//E:\learn-java\Learning-Java\output\production\Learning-Java\better_write\Java_performance_tuning\A3>

// 反编译class文件

//// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
//// Jad home page: http://www.kpdus.com/jad.html
//// Decompiler options: packimports(3)
//// Source File Name:   T5.java
//
//package better_write.Java_performance_tuning.A3;
//
//
//public class T5
//{
//
//    public T5()
//    {
//    }
//
//    public static void main(String args[])
//    {
//        String str = "abcdef";
//        for(int i = 0; i < 1000; i++)
//            str = (new StringBuilder()).append(str).append(i).toString();
//
//    }
//}

/*
即使使用 + 号作为字符串的拼接，也一样可以被编译器优化成 StringBuilder 的方式。但再细致些，
你会发现在编译器优化的代码中，每次循环都会生成一个新的 StringBuilder 实例，同样也会降低系统的性能。

所以平时做字符串拼接的时候，我建议你还是要显示地使用 String Builder 来提升系统性能。

如果在多线程编程中，String 对象的拼接涉及到线程安全，你可以使用 StringBuffer。但是要注意，
由于 StringBuffer 是线程安全的，涉及到锁竞争，所以从性能上来说，要比 StringBuilder 差一些。
 */