package better_write.Java_performance_tuning.A3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/25
 * \* Time: 9:37
 * \* Description:
 * \
 */
public class T2 {

    public static void main(String[] args) {

        String s = "a";

        String s1 = new String("a");

    }
}
//E:\learn-java\Learning-Java\output\production\Learning-Java\better_write\Java_performance_tuning\A3>javap -v T2
//警告: 二进制文件T2包含better_write.Java_performance_tuning.A3.T2
//Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/better_write/Java_performance_tuning/A3/T2.class
//  Last modified 2020-3-25; size 563 bytes
//  MD5 checksum 900251595178a012506198e2f6b56401
//  Compiled from "T2.java"
//public class better_write.Java_performance_tuning.A3.T2
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Methodref          #6.#23         // java/lang/Object."<init>":()V
//   #2 = String             #24            // a
//   #3 = Class              #25            // java/lang/String
//   #4 = Methodref          #3.#26         // java/lang/String."<init>":(Ljava/lang/String;)V
//   #5 = Class              #27            // better_write/Java_performance_tuning/A3/T2
//   #6 = Class              #28            // java/lang/Object
//   #7 = Utf8               <init>
//   #8 = Utf8               ()V
//   #9 = Utf8               Code
//  #10 = Utf8               LineNumberTable
//  #11 = Utf8               LocalVariableTable
//  #12 = Utf8               this
//  #13 = Utf8               Lbetter_write/Java_performance_tuning/A3/T2;
//  #14 = Utf8               main
//  #15 = Utf8               ([Ljava/lang/String;)V
//  #16 = Utf8               args
//  #17 = Utf8               [Ljava/lang/String;
//  #18 = Utf8               s
//  #19 = Utf8               Ljava/lang/String;
//  #20 = Utf8               s1
//  #21 = Utf8               SourceFile
//  #22 = Utf8               T2.java
//  #23 = NameAndType        #7:#8          // "<init>":()V
//  #24 = Utf8               a
//  #25 = Utf8               java/lang/String
//  #26 = NameAndType        #7:#29         // "<init>":(Ljava/lang/String;)V
//  #27 = Utf8               better_write/Java_performance_tuning/A3/T2
//  #28 = Utf8               java/lang/Object
//  #29 = Utf8               (Ljava/lang/String;)V
//{
//  public better_write.Java_performance_tuning.A3.T2();
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
//            0       5     0  this   Lbetter_write/Java_performance_tuning/A3/T2;
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=3, locals=3, args_size=1
//         0: ldc           #2                  // String a
//         2: astore_1
//         3: new           #3                  // class java/lang/String
//         6: dup
//         7: ldc           #2                  // String a
//         9: invokespecial #4                  // Method java/lang/String."<init>":(Ljava/lang/String;)V
//        12: astore_2
//        13: return
//      LineNumberTable:
//        line 15: 0
//        line 17: 3
//        line 19: 13
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      14     0  args   [Ljava/lang/String;
//            3      11     1     s   Ljava/lang/String;
//           13       1     2    s1   Ljava/lang/String;
//}
//SourceFile: "T2.java"
//
//E:\learn-java\Learning-Java\output\production\Learning-Java\better_write\Java_performance_tuning\A3>


