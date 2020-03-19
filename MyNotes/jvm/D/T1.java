package jvm.D;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/18
 * \* Time: 20:23
 * \* Description:
 * \
 */
public class T1 {


    public static void m() {
        System.out.println("mm");
    }

    public static void main(String[] args) {

        m();

    }
}
//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\D>javap -v T1
//        警告: 二进制文件T1包含jvm.D.T1
//        Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/jvm/D/T1.class
//Last modified 2020-3-18; size 572 bytes
//        MD5 checksum f3e77a6e055f0b2e4d81367fc621de77
//        Compiled from "T1.java"
//public class jvm.D.T1
//        minor version: 0
//        major version: 52
//        flags: ACC_PUBLIC, ACC_SUPER
//        Constant pool:
//        #1 = Methodref          #7.#22         // java/lang/Object."<init>":()V
//        #2 = Fieldref           #23.#24        // java/lang/System.out:Ljava/io/PrintStream;
//        #3 = String             #25            // mm
//        #4 = Methodref          #26.#27        // java/io/PrintStream.println:(Ljava/lang/String;)V
//        #5 = Methodref          #6.#28         // jvm/D/T1.m:()V
//        #6 = Class              #29            // jvm/D/T1
//        #7 = Class              #30            // java/lang/Object
//        #8 = Utf8               <init>
//   #9 = Utf8               ()V
//           #10 = Utf8               Code
//           #11 = Utf8               LineNumberTable
//           #12 = Utf8               LocalVariableTable
//           #13 = Utf8               this
//           #14 = Utf8               Ljvm/D/T1;
//           #15 = Utf8               m
//           #16 = Utf8               main
//           #17 = Utf8               ([Ljava/lang/String;)V
//           #18 = Utf8               args
//           #19 = Utf8               [Ljava/lang/String;
//           #20 = Utf8               SourceFile
//           #21 = Utf8               T1.java
//           #22 = NameAndType        #8:#9          // "<init>":()V
//           #23 = Class              #31            // java/lang/System
//           #24 = NameAndType        #32:#33        // out:Ljava/io/PrintStream;
//           #25 = Utf8               mm
//           #26 = Class              #34            // java/io/PrintStream
//           #27 = NameAndType        #35:#36        // println:(Ljava/lang/String;)V
//           #28 = NameAndType        #15:#9         // m:()V
//           #29 = Utf8               jvm/D/T1
//           #30 = Utf8               java/lang/Object
//           #31 = Utf8               java/lang/System
//           #32 = Utf8               out
//           #33 = Utf8               Ljava/io/PrintStream;
//           #34 = Utf8               java/io/PrintStream
//           #35 = Utf8               println
//           #36 = Utf8               (Ljava/lang/String;)V
//           {
//public jvm.D.T1();
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
//        0       5     0  this   Ljvm/D/T1;
//
//public static void m();
//        descriptor: ()V
//        flags: ACC_PUBLIC, ACC_STATIC
//        Code:
//        stack=2, locals=0, args_size=0
//        0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        3: ldc           #3                  // String mm
//        5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        8: return
//        LineNumberTable:
//        line 15: 0
//        line 16: 8
//
//public static void main(java.lang.String[]);
//        descriptor: ([Ljava/lang/String;)V
//        flags: ACC_PUBLIC, ACC_STATIC
//        Code:
//        stack=0, locals=1, args_size=1
//        0: invokestatic  #5                  // Method m:()V
//        3: return
//        LineNumberTable:
//        line 20: 0
//        line 22: 3
//        LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//        0       4     0  args   [Ljava/lang/String;
//        }
//        SourceFile: "T1.java"
//
//        E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\D>