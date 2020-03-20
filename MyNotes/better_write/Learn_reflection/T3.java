package better_write.Learn_reflection;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/19
 * \* Time: 21:48
 * \* Description:
 * \
 */
public class T3 {

    public static void main(String[] args) throws ClassNotFoundException {

        Class a = Class.forName("better_write.Learn_reflection.A");

    }
}


//E:\learn-java\Learning-Java\output\production\Learning-Java\better_write\Learn_reflection>javap -v T3
//警告: 二进制文件T3包含better_write.Learn_reflection.T3
//Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/better_write/Learn_reflection/T3.class
//  Last modified 2020-3-19; size 632 bytes
//  MD5 checksum 222a9b713b229324a61f2a219eb02b83
//  Compiled from "T3.java"
//public class better_write.Learn_reflection.T3
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Methodref          #5.#23         // java/lang/Object."<init>":()V
//   #2 = String             #24            // better_write.Learn_reflection.A
//   #3 = Methodref          #25.#26        // java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
//   #4 = Class              #27            // better_write/Learn_reflection/T3
//   #5 = Class              #28            // java/lang/Object
//   #6 = Utf8               <init>
//   #7 = Utf8               ()V
//   #8 = Utf8               Code
//   #9 = Utf8               LineNumberTable
//  #10 = Utf8               LocalVariableTable
//  #11 = Utf8               this
//  #12 = Utf8               Lbetter_write/Learn_reflection/T3;
//  #13 = Utf8               main
//  #14 = Utf8               ([Ljava/lang/String;)V
//  #15 = Utf8               args
//  #16 = Utf8               [Ljava/lang/String;
//  #17 = Utf8               a
//  #18 = Utf8               Ljava/lang/Class;
//  #19 = Utf8               Exceptions
//  #20 = Class              #29            // java/lang/ClassNotFoundException
//  #21 = Utf8               SourceFile
//  #22 = Utf8               T3.java
//  #23 = NameAndType        #6:#7          // "<init>":()V
//  #24 = Utf8               better_write.Learn_reflection.A
//  #25 = Class              #30            // java/lang/Class
//  #26 = NameAndType        #31:#32        // forName:(Ljava/lang/String;)Ljava/lang/Class;
//  #27 = Utf8               better_write/Learn_reflection/T3
//  #28 = Utf8               java/lang/Object
//  #29 = Utf8               java/lang/ClassNotFoundException
//  #30 = Utf8               java/lang/Class
//  #31 = Utf8               forName
//  #32 = Utf8               (Ljava/lang/String;)Ljava/lang/Class;
//{
//  public better_write.Learn_reflection.T3();
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
//            0       5     0  this   Lbetter_write/Learn_reflection/T3;
//
//  public static void main(java.lang.String[]) throws java.lang.ClassNotFoundException;
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=1, locals=2, args_size=1
//         0: ldc           #2                  // String better_write.Learn_reflection.A
//         2: invokestatic  #3                  // Method java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
//         5: astore_1
//         6: return
//      LineNumberTable:
//        line 15: 0
//        line 17: 6
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       7     0  args   [Ljava/lang/String;
//            6       1     1     a   Ljava/lang/Class;
//    Exceptions:
//      throws java.lang.ClassNotFoundException
//}
//SourceFile: "T3.java"
//
//E:\learn-java\Learning-Java\output\production\Learning-Java\better_write\Learn_reflection>