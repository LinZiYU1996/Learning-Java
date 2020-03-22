package jvm.ji_ke_shi_jian.P7;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/21
 * \* Time: 16:42
 * \* Description:
 * \
 */
public class T {

    public static void m(){
        System.out.println("hello");
    }
    public static void main(String[] args) {

        try {
            m();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\ji_ke_shi_jian\P7>javap -v T
//警告: 二进制文件T包含jvm.ji_ke_shi_jian.P7.T
//Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/jvm/ji_ke_shi_jian/P7/T.class
//  Last modified 2020-3-21; size 755 bytes
//  MD5 checksum b403b9c45b3f65ee30699416f3439402
//  Compiled from "T.java"
//public class jvm.ji_ke_shi_jian.P7.T
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Methodref          #9.#28         // java/lang/Object."<init>":()V
//   #2 = Fieldref           #29.#30        // java/lang/System.out:Ljava/io/PrintStream;
//   #3 = String             #31            // hello
//   #4 = Methodref          #32.#33        // java/io/PrintStream.println:(Ljava/lang/String;)V
//   #5 = Methodref          #8.#34         // jvm/ji_ke_shi_jian/P7/T.m:()V
//   #6 = Class              #35            // java/lang/Exception
//   #7 = Methodref          #6.#36         // java/lang/Exception.printStackTrace:()V
//   #8 = Class              #37            // jvm/ji_ke_shi_jian/P7/T
//   #9 = Class              #38            // java/lang/Object
//  #10 = Utf8               <init>
//  #11 = Utf8               ()V
//  #12 = Utf8               Code
//  #13 = Utf8               LineNumberTable
//  #14 = Utf8               LocalVariableTable
//  #15 = Utf8               this
//  #16 = Utf8               Ljvm/ji_ke_shi_jian/P7/T;
//  #17 = Utf8               m
//  #18 = Utf8               main
//  #19 = Utf8               ([Ljava/lang/String;)V
//  #20 = Utf8               e
//  #21 = Utf8               Ljava/lang/Exception;
//  #22 = Utf8               args
//  #23 = Utf8               [Ljava/lang/String;
//  #24 = Utf8               StackMapTable
//  #25 = Class              #35            // java/lang/Exception
//  #26 = Utf8               SourceFile
//  #27 = Utf8               T.java
//  #28 = NameAndType        #10:#11        // "<init>":()V
//  #29 = Class              #39            // java/lang/System
//  #30 = NameAndType        #40:#41        // out:Ljava/io/PrintStream;
//  #31 = Utf8               hello
//  #32 = Class              #42            // java/io/PrintStream
//  #33 = NameAndType        #43:#44        // println:(Ljava/lang/String;)V
//  #34 = NameAndType        #17:#11        // m:()V
//  #35 = Utf8               java/lang/Exception
//  #36 = NameAndType        #45:#11        // printStackTrace:()V
//  #37 = Utf8               jvm/ji_ke_shi_jian/P7/T
//  #38 = Utf8               java/lang/Object
//  #39 = Utf8               java/lang/System
//  #40 = Utf8               out
//  #41 = Utf8               Ljava/io/PrintStream;
//  #42 = Utf8               java/io/PrintStream
//  #43 = Utf8               println
//  #44 = Utf8               (Ljava/lang/String;)V
//  #45 = Utf8               printStackTrace
//{
//  public jvm.ji_ke_shi_jian.P7.T();
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
//            0       5     0  this   Ljvm/ji_ke_shi_jian/P7/T;
//
//  public static void m();
//    descriptor: ()V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=2, locals=0, args_size=0
//         0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
//         3: ldc           #3                  // String hello
//         5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//         8: return
//      LineNumberTable:
//        line 14: 0
//        line 15: 8
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=1, locals=2, args_size=1
//         0: invokestatic  #5                  // Method m:()V
//         3: goto          11
//         6: astore_1
//         7: aload_1
//         8: invokevirtual #7                  // Method java/lang/Exception.printStackTrace:()V
//        11: return


//      Exception table:
//         from    to  target type
//             0     3     6   Class java/lang/Exception

/*

编译过后，该方法的异常表拥有一个条目。其 from 指针和 to 指针分别为 0 和 3，
代表它的监控范围从索引为 0 的字节码开始，到索引为 3 的字节码结束（不包括 3）。
该条目的 target 指针是 6，代表这个异常处理器从索引为 6 的字节码开始。条目的最后一列，
代表该异常处理器所捕获的异常类型正是 Exception。

当程序触发异常时，Java 虚拟机会从上至下遍历异常表中的所有条目。
当触发异常的字节码的索引值在某个异常表条目的监控范围内，
Java 虚拟机会判断所抛出的异常和该条目想要捕获的异常是否匹配。如果匹配，
Java 虚拟机会将控制流转移至该条目 target 指针指向的字节码。

如果遍历完所有异常表条目，Java 虚拟机仍未匹配到异常处理器，
那么它会弹出当前方法对应的 Java 栈帧，并且在调用者（caller）中重复上述操作
。在最坏情况下，Java 虚拟机需要遍历当前线程 Java 栈上所有方法的异常表。


 */


//      LineNumberTable:
//        line 19: 0
//        line 22: 3
//        line 20: 6
//        line 21: 7
//        line 25: 11
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            7       4     1     e   Ljava/lang/Exception;
//            0      12     0  args   [Ljava/lang/String;
//      StackMapTable: number_of_entries = 2
//        frame_type = 70 /* same_locals_1_stack_item */
//          stack = [ class java/lang/Exception ]
//        frame_type = 4 /* same */
//}
//SourceFile: "T.java"
//
//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\ji_ke_shi_jian\P7>