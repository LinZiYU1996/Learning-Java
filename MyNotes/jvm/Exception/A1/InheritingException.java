package jvm.Exception.A1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/21
 * \* Time: 18:09
 * \* Description:
 * \
 */
public class InheritingException {

    public void f() throws SimpleException {
        System.out.println("throw fron f");
        throw new SimpleException();
    }

    public static void main(String[] args) {

        InheritingException inheritingException = new InheritingException();

        try {
            inheritingException.f();

        } catch (SimpleException s) {
            System.out.println("caught");
        }


    }
    /*
    throw fron f
caught
     */
}

//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\Exception\A1>javap -v InheritingException
//警告: 二进制文件InheritingException包含jvm.Exception.A1.InheritingException
//Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/jvm/Exception/A1/InheritingException.class
//  Last modified 2020-3-21; size 941 bytes
//  MD5 checksum 977f585946219f728d6d34b0554d1480
//  Compiled from "InheritingException.java"
//public class jvm.Exception.A1.InheritingException
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Methodref          #11.#34        // java/lang/Object."<init>":()V
//   #2 = Fieldref           #35.#36        // java/lang/System.out:Ljava/io/PrintStream;
//   #3 = String             #37            // throw fron f
//   #4 = Methodref          #38.#39        // java/io/PrintStream.println:(Ljava/lang/String;)V
//   #5 = Class              #40            // jvm/Exception/A1/SimpleException
//   #6 = Methodref          #5.#34         // jvm/Exception/A1/SimpleException."<init>":()V
//   #7 = Class              #41            // jvm/Exception/A1/InheritingException
//   #8 = Methodref          #7.#34         // jvm/Exception/A1/InheritingException."<init>":()V
//   #9 = Methodref          #7.#42         // jvm/Exception/A1/InheritingException.f:()V
//  #10 = String             #43            // caught
//  #11 = Class              #44            // java/lang/Object
//  #12 = Utf8               <init>
//  #13 = Utf8               ()V
//  #14 = Utf8               Code
//  #15 = Utf8               LineNumberTable
//  #16 = Utf8               LocalVariableTable
//  #17 = Utf8               this
//  #18 = Utf8               Ljvm/Exception/A1/InheritingException;
//  #19 = Utf8               f
//  #20 = Utf8               Exceptions
//  #21 = Utf8               main
//  #22 = Utf8               ([Ljava/lang/String;)V
//  #23 = Utf8               s
//  #24 = Utf8               Ljvm/Exception/A1/SimpleException;
//  #25 = Utf8               args
//  #26 = Utf8               [Ljava/lang/String;
//  #27 = Utf8               inheritingException
//  #28 = Utf8               StackMapTable
//  #29 = Class              #26            // "[Ljava/lang/String;"
//  #30 = Class              #41            // jvm/Exception/A1/InheritingException
//  #31 = Class              #40            // jvm/Exception/A1/SimpleException
//  #32 = Utf8               SourceFile
//  #33 = Utf8               InheritingException.java
//  #34 = NameAndType        #12:#13        // "<init>":()V
//  #35 = Class              #45            // java/lang/System
//  #36 = NameAndType        #46:#47        // out:Ljava/io/PrintStream;
//  #37 = Utf8               throw fron f
//  #38 = Class              #48            // java/io/PrintStream
//  #39 = NameAndType        #49:#50        // println:(Ljava/lang/String;)V
//  #40 = Utf8               jvm/Exception/A1/SimpleException
//  #41 = Utf8               jvm/Exception/A1/InheritingException
//  #42 = NameAndType        #19:#13        // f:()V
//  #43 = Utf8               caught
//  #44 = Utf8               java/lang/Object
//  #45 = Utf8               java/lang/System
//  #46 = Utf8               out
//  #47 = Utf8               Ljava/io/PrintStream;
//  #48 = Utf8               java/io/PrintStream
//  #49 = Utf8               println
//  #50 = Utf8               (Ljava/lang/String;)V
//{
//  public jvm.Exception.A1.InheritingException();
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
//            0       5     0  this   Ljvm/Exception/A1/InheritingException;
//
//  public void f() throws jvm.Exception.A1.SimpleException;
//    descriptor: ()V
//    flags: ACC_PUBLIC
//    Code:
//      stack=2, locals=1, args_size=1
//         0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
//         3: ldc           #3                  // String throw fron f
//         5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//         8: new           #5                  // class jvm/Exception/A1/SimpleException
//        11: dup
//        12: invokespecial #6                  // Method jvm/Exception/A1/SimpleException."<init>":()V
//        15: athrow
//      LineNumberTable:
//        line 14: 0
//        line 15: 8
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      16     0  this   Ljvm/Exception/A1/InheritingException;
//    Exceptions:
//      throws jvm.Exception.A1.SimpleException
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=2, locals=3, args_size=1
//         0: new           #7                  // class jvm/Exception/A1/InheritingException
//         3: dup
//         4: invokespecial #8                  // Method "<init>":()V
//         7: astore_1
//         8: aload_1
//         9: invokevirtual #9                  // Method f:()V
//        12: goto          24
//        15: astore_2
//        16: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        19: ldc           #10                 // String caught
//        21: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        24: return
//      Exception table:
//         from    to  target type
//             8    12    15   Class jvm/Exception/A1/SimpleException
//      LineNumberTable:
//        line 20: 0
//        line 23: 8
//        line 27: 12
//        line 25: 15
//        line 26: 16
//        line 30: 24
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//           16       8     2     s   Ljvm/Exception/A1/SimpleException;
//            0      25     0  args   [Ljava/lang/String;
//            8      17     1 inheritingException   Ljvm/Exception/A1/InheritingException;
//      StackMapTable: number_of_entries = 2
//        frame_type = 255 /* full_frame */
//          offset_delta = 15
//          locals = [ class "[Ljava/lang/String;", class jvm/Exception/A1/InheritingException ]
//          stack = [ class jvm/Exception/A1/SimpleException ]
//        frame_type = 8 /* same */
//}
//SourceFile: "InheritingException.java"
//
//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\Exception\A1>
