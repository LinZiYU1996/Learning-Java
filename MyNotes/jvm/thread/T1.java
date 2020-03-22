package jvm.thread;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/21
 * \* Time: 21:00
 * \* Description:
 * \
 */
public class T1 {

    private int[] intArray = new int[10];
    void reverseOrder() {
        synchronized (this) {
            int halfWay = intArray.length / 2;
            for (int i = 0; i < halfWay; ++i) {
                int upperIndex = intArray.length - 1 - i;
                int save = intArray[upperIndex];
                intArray[upperIndex] = intArray[i];
                intArray[i] = save;
            }
        }
    }

}

//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\thread>javap -v T1
//警告: 二进制文件T1包含jvm.thread.T1
//Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/jvm/thread/T1.class
//  Last modified 2020-3-21; size 649 bytes
//  MD5 checksum d73fba8d4d914c81698a07c5217336eb
//  Compiled from "T1.java"
//public class jvm.thread.T1
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Methodref          #4.#25         // java/lang/Object."<init>":()V
//   #2 = Fieldref           #3.#26         // jvm/thread/T1.intArray:[I
//   #3 = Class              #27            // jvm/thread/T1
//   #4 = Class              #28            // java/lang/Object
//   #5 = Utf8               intArray
//   #6 = Utf8               [I
//   #7 = Utf8               <init>
//   #8 = Utf8               ()V
//   #9 = Utf8               Code
//  #10 = Utf8               LineNumberTable
//  #11 = Utf8               LocalVariableTable
//  #12 = Utf8               this
//  #13 = Utf8               Ljvm/thread/T1;
//  #14 = Utf8               reverseOrder
//  #15 = Utf8               upperIndex
//  #16 = Utf8               I
//  #17 = Utf8               save
//  #18 = Utf8               i
//  #19 = Utf8               halfWay
//  #20 = Utf8               StackMapTable
//  #21 = Class              #28            // java/lang/Object
//  #22 = Class              #29            // java/lang/Throwable
//  #23 = Utf8               SourceFile
//  #24 = Utf8               T1.java
//  #25 = NameAndType        #7:#8          // "<init>":()V
//  #26 = NameAndType        #5:#6          // intArray:[I
//  #27 = Utf8               jvm/thread/T1
//  #28 = Utf8               java/lang/Object
//  #29 = Utf8               java/lang/Throwable
//{
//  public jvm.thread.T1();
//    descriptor: ()V
//    flags: ACC_PUBLIC
//    Code:
//      stack=2, locals=1, args_size=1
//         0: aload_0
//         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//         4: aload_0
//         5: bipush        10
//         7: newarray       int
//         9: putfield      #2                  // Field intArray:[I
//        12: return
//      LineNumberTable:
//        line 11: 0
//        line 13: 4
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      13     0  this   Ljvm/thread/T1;
//
//  void reverseOrder();
//    descriptor: ()V
//    flags:
//    Code:
//      stack=4, locals=7, args_size=1
//         0: aload_0
//         1: dup
//         2: astore_1


//         3: monitorenter


//         4: aload_0
//         5: getfield      #2                  // Field intArray:[I
//         8: arraylength
//         9: iconst_2
//        10: idiv
//        11: istore_2
//        12: iconst_0
//        13: istore_3
//        14: iload_3
//        15: iload_2
//        16: if_icmpge     66
//        19: aload_0
//        20: getfield      #2                  // Field intArray:[I
//        23: arraylength
//        24: iconst_1
//        25: isub
//        26: iload_3
//        27: isub
//        28: istore        4
//        30: aload_0
//        31: getfield      #2                  // Field intArray:[I
//        34: iload         4
//        36: iaload
//        37: istore        5
//        39: aload_0
//        40: getfield      #2                  // Field intArray:[I
//        43: iload         4
//        45: aload_0
//        46: getfield      #2                  // Field intArray:[I
//        49: iload_3
//        50: iaload
//        51: iastore
//        52: aload_0
//        53: getfield      #2                  // Field intArray:[I
//        56: iload_3
//        57: iload         5
//        59: iastore
//        60: iinc          3, 1
//        63: goto          14
//        66: aload_1


//        67: monitorexit


//        68: goto          78
//        71: astore        6
//        73: aload_1
//        74: monitorexit
//        75: aload         6
//        77: athrow
//        78: return
//      Exception table:
//         from    to  target type
//             4    68    71   any
//            71    75    71   any
//      LineNumberTable:
//        line 15: 0
//        line 16: 4
//        line 17: 12
//        line 18: 19
//        line 19: 30
//        line 20: 39
//        line 21: 52
//        line 17: 60
//        line 23: 66
//        line 24: 78
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//           30      30     4 upperIndex   I
//           39      21     5  save   I
//           14      52     3     i   I
//           12      54     2 halfWay   I
//            0      79     0  this   Ljvm/thread/T1;
//      StackMapTable: number_of_entries = 4
//        frame_type = 254 /* append */
//          offset_delta = 14
//          locals = [ class java/lang/Object, int, int ]
//        frame_type = 249 /* chop */
//          offset_delta = 51
//        frame_type = 68 /* same_locals_1_stack_item */
//          stack = [ class java/lang/Throwable ]
//        frame_type = 250 /* chop */
//          offset_delta = 6
//}
//SourceFile: "T1.java"
//
//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\thread>


