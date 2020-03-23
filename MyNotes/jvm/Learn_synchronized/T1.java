package jvm.Learn_synchronized;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/22
 * \* Time: 11:19
 * \* Description:
 * \
 */
public class T1 {

    public void foo(Object lock) {
        synchronized (lock) {
            lock.hashCode();
        }
    }
}


//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\Learn_synchronized>javap -v T1
//警告: 二进制文件T1包含jvm.Learn_synchronized.T1
//Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/jvm/Learn_synchronized/T1.class
//  Last modified 2020-3-22; size 553 bytes
//  MD5 checksum 6ab21b3e48c0004281ae6c958a840fbb
//  Compiled from "T1.java"
//public class jvm.Learn_synchronized.T1
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Methodref          #4.#22         // java/lang/Object."<init>":()V
//   #2 = Methodref          #4.#23         // java/lang/Object.hashCode:()I
//   #3 = Class              #24            // jvm/Learn_synchronized/T1
//   #4 = Class              #25            // java/lang/Object
//   #5 = Utf8               <init>
//   #6 = Utf8               ()V
//   #7 = Utf8               Code
//   #8 = Utf8               LineNumberTable
//   #9 = Utf8               LocalVariableTable
//  #10 = Utf8               this
//  #11 = Utf8               Ljvm/Learn_synchronized/T1;
//  #12 = Utf8               foo
//  #13 = Utf8               (Ljava/lang/Object;)V
//  #14 = Utf8               lock
//  #15 = Utf8               Ljava/lang/Object;
//  #16 = Utf8               StackMapTable
//  #17 = Class              #24            // jvm/Learn_synchronized/T1
//  #18 = Class              #25            // java/lang/Object
//  #19 = Class              #26            // java/lang/Throwable
//  #20 = Utf8               SourceFile
//  #21 = Utf8               T1.java
//  #22 = NameAndType        #5:#6          // "<init>":()V
//  #23 = NameAndType        #27:#28        // hashCode:()I
//  #24 = Utf8               jvm/Learn_synchronized/T1
//  #25 = Utf8               java/lang/Object
//  #26 = Utf8               java/lang/Throwable
//  #27 = Utf8               hashCode
//  #28 = Utf8               ()I
//{
//  public jvm.Learn_synchronized.T1();
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
//            0       5     0  this   Ljvm/Learn_synchronized/T1;
//


//  public void foo(java.lang.Object);
//    descriptor: (Ljava/lang/Object;)V
//    flags: ACC_PUBLIC
//    Code:
//      stack=2, locals=4, args_size=2
//         0: aload_1
//         1: dup
//         2: astore_2
//         3: monitorenter
//         4: aload_1
//         5: invokevirtual #2                  // Method java/lang/Object.hashCode:()I
//         8: pop
//         9: aload_2
//        10: monitorexit
//        11: goto          19
//        14: astore_3
//        15: aload_2
//        16: monitorexit
//        17: aload_3
//        18: athrow
//        19: return

/*
上面的字节码中包含一个 monitorenter 指令以及多个 monitorexit 指令。
这是因为 Java 虚拟机需要确保所获得的锁在正常执行路径，
以及异常执行路径上都能够被解锁。
 */


//      Exception table:
//         from    to  target type
//             4    11    14   any
//            14    17    14   any
//      LineNumberTable:
//        line 14: 0
//        line 15: 4
//        line 16: 9
//        line 17: 19
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      20     0  this   Ljvm/Learn_synchronized/T1;
//            0      20     1  lock   Ljava/lang/Object;
//      StackMapTable: number_of_entries = 2
//        frame_type = 255 /* full_frame */
//          offset_delta = 14
//          locals = [ class jvm/Learn_synchronized/T1, class java/lang/Object, class java/lang/Object ]
//          stack = [ class java/lang/Throwable ]
//        frame_type = 250 /* chop */
//          offset_delta = 4
//}
//SourceFile: "T1.java"
//
//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\Learn_synchronized>

