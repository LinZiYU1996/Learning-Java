package jvm.Learn_synchronized;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/22
 * \* Time: 11:23
 * \* Description:
 * \
 */
public class T2 {

    public synchronized void foo(Object lock) {
        lock.hashCode();
    }
}

//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\Learn_synchronized>javap -v T2
//警告: 二进制文件T2包含jvm.Learn_synchronized.T2
//Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/jvm/Learn_synchronized/T2.class
//  Last modified 2020-3-22; size 438 bytes
//  MD5 checksum b67b05e4185dc978f5d6a939cd5912d2
//  Compiled from "T2.java"
//public class jvm.Learn_synchronized.T2
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Methodref          #4.#18         // java/lang/Object."<init>":()V
//   #2 = Methodref          #4.#19         // java/lang/Object.hashCode:()I
//   #3 = Class              #20            // jvm/Learn_synchronized/T2
//   #4 = Class              #21            // java/lang/Object
//   #5 = Utf8               <init>
//   #6 = Utf8               ()V
//   #7 = Utf8               Code
//   #8 = Utf8               LineNumberTable
//   #9 = Utf8               LocalVariableTable
//  #10 = Utf8               this
//  #11 = Utf8               Ljvm/Learn_synchronized/T2;
//  #12 = Utf8               foo
//  #13 = Utf8               (Ljava/lang/Object;)V
//  #14 = Utf8               lock
//  #15 = Utf8               Ljava/lang/Object;
//  #16 = Utf8               SourceFile
//  #17 = Utf8               T2.java
//  #18 = NameAndType        #5:#6          // "<init>":()V
//  #19 = NameAndType        #22:#23        // hashCode:()I
//  #20 = Utf8               jvm/Learn_synchronized/T2
//  #21 = Utf8               java/lang/Object
//  #22 = Utf8               hashCode
//  #23 = Utf8               ()I
//{
//  public jvm.Learn_synchronized.T2();
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
//            0       5     0  this   Ljvm/Learn_synchronized/T2;
//


//  public synchronized void foo(java.lang.Object);
//    descriptor: (Ljava/lang/Object;)V
//    flags: ACC_PUBLIC, ACC_SYNCHRONIZED
//    Code:
//      stack=1, locals=2, args_size=2
//         0: aload_1
//         1: invokevirtual #2                  // Method java/lang/Object.hashCode:()I
//         4: pop
//         5: return
/*
当用 synchronized 标记方法时，你会看到字节码中方法的访问标记包括
 ACC_SYNCHRONIZED。该标记表示在进入该方法时，Java 虚拟机需要进行
  monitorenter 操作。而在退出该方法时，不管是正常返回，还是向调用者抛异常，
  Java 虚拟机均需要进行 monitorexit 操作。
 */

//      LineNumberTable:
//        line 14: 0
//        line 15: 5
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       6     0  this   Ljvm/Learn_synchronized/T2;
//            0       6     1  lock   Ljava/lang/Object;
//}
//SourceFile: "T2.java"
//
//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\Learn_synchronized>


