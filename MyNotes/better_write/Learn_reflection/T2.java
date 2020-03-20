package better_write.Learn_reflection;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/19
 * \* Time: 21:48
 * \* Description:
 * \
 */
public class T2 {

    public static void main(String[] args) {

        A a = new A();

    }
}

//E:\learn-java\Learning-Java\output\production\Learning-Java\better_write\Learn_reflection>javap -v T2
//警告: 二进制文件T2包含better_write.Learn_reflection.T2
//Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/better_write/Learn_reflection/T2.class
//  Last modified 2020-3-19; size 513 bytes
//  MD5 checksum 2595cce5b7af84ad5407208e7095340f
//  Compiled from "T2.java"
//public class better_write.Learn_reflection.T2
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Methodref          #5.#21         // java/lang/Object."<init>":()V
//   #2 = Class              #22            // better_write/Learn_reflection/A
//   #3 = Methodref          #2.#21         // better_write/Learn_reflection/A."<init>":()V
//   #4 = Class              #23            // better_write/Learn_reflection/T2
//   #5 = Class              #24            // java/lang/Object
//   #6 = Utf8               <init>
//   #7 = Utf8               ()V
//   #8 = Utf8               Code
//   #9 = Utf8               LineNumberTable
//  #10 = Utf8               LocalVariableTable
//  #11 = Utf8               this
//  #12 = Utf8               Lbetter_write/Learn_reflection/T2;
//  #13 = Utf8               main
//  #14 = Utf8               ([Ljava/lang/String;)V
//  #15 = Utf8               args
//  #16 = Utf8               [Ljava/lang/String;
//  #17 = Utf8               a
//  #18 = Utf8               Lbetter_write/Learn_reflection/A;
//  #19 = Utf8               SourceFile
//  #20 = Utf8               T2.java
//  #21 = NameAndType        #6:#7          // "<init>":()V
//  #22 = Utf8               better_write/Learn_reflection/A
//  #23 = Utf8               better_write/Learn_reflection/T2
//  #24 = Utf8               java/lang/Object
//{
//  public better_write.Learn_reflection.T2();
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
//            0       5     0  this   Lbetter_write/Learn_reflection/T2;
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=2, locals=2, args_size=1
//         0: new           #2                  // class better_write/Learn_reflection/A
//         3: dup
//         4: invokespecial #3                  // Method better_write/Learn_reflection/A."<init>":()V
//         7: astore_1
//         8: return
//      LineNumberTable:
//        line 15: 0
//        line 17: 8
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       9     0  args   [Ljava/lang/String;
//            8       1     1     a   Lbetter_write/Learn_reflection/A;
//}
//SourceFile: "T2.java"