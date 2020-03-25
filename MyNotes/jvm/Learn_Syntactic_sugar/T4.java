package jvm.Learn_Syntactic_sugar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/24
 * \* Time: 19:58
 * \* Description:
 * \
 */
public class T4 {

    public void m1(int[] a) {

        for (int i : a) {
            System.out.println(i);
        }
    }
}

//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\Learn_Syntactic_sugar>javap -v T4
//警告: 二进制文件T4包含jvm.Learn_Syntactic_sugar.T4
//Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/jvm/Learn_Syntactic_sugar/T4.class
//  Last modified 2020-3-24; size 588 bytes
//  MD5 checksum 601aa352b0aef17e069fb06e4ba3c3f8
//  Compiled from "T4.java"
//public class jvm.Learn_Syntactic_sugar.T4
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Methodref          #5.#23         // java/lang/Object."<init>":()V
//   #2 = Fieldref           #24.#25        // java/lang/System.out:Ljava/io/PrintStream;
//   #3 = Methodref          #26.#27        // java/io/PrintStream.println:(I)V
//   #4 = Class              #28            // jvm/Learn_Syntactic_sugar/T4
//   #5 = Class              #29            // java/lang/Object
//   #6 = Utf8               <init>
//   #7 = Utf8               ()V
//   #8 = Utf8               Code
//   #9 = Utf8               LineNumberTable
//  #10 = Utf8               LocalVariableTable
//  #11 = Utf8               this
//  #12 = Utf8               Ljvm/Learn_Syntactic_sugar/T4;
//  #13 = Utf8               m1
//  #14 = Utf8               ([I)V
//  #15 = Utf8               i
//  #16 = Utf8               I
//  #17 = Utf8               a
//  #18 = Utf8               [I
//  #19 = Utf8               StackMapTable
//  #20 = Class              #18            // "[I"
//  #21 = Utf8               SourceFile
//  #22 = Utf8               T4.java
//  #23 = NameAndType        #6:#7          // "<init>":()V
//  #24 = Class              #30            // java/lang/System
//  #25 = NameAndType        #31:#32        // out:Ljava/io/PrintStream;
//  #26 = Class              #33            // java/io/PrintStream
//  #27 = NameAndType        #34:#35        // println:(I)V
//  #28 = Utf8               jvm/Learn_Syntactic_sugar/T4
//  #29 = Utf8               java/lang/Object
//  #30 = Utf8               java/lang/System
//  #31 = Utf8               out
//  #32 = Utf8               Ljava/io/PrintStream;
//  #33 = Utf8               java/io/PrintStream
//  #34 = Utf8               println
//  #35 = Utf8               (I)V
//{
//  public jvm.Learn_Syntactic_sugar.T4();
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
//            0       5     0  this   Ljvm/Learn_Syntactic_sugar/T4;
//
//  public void m1(int[]);
//    descriptor: ([I)V
//    flags: ACC_PUBLIC
//    Code:
//      stack=2, locals=6, args_size=2
//         0: aload_1
//         1: astore_2
//         2: aload_2
//         3: arraylength
//         4: istore_3
//         5: iconst_0
//         6: istore        4
//         8: iload         4
//        10: iload_3
//        11: if_icmpge     34
//        14: aload_2
//        15: iload         4
//        17: iaload
//        18: istore        5
//        20: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        23: iload         5
//        25: invokevirtual #3                  // Method java/io/PrintStream.println:(I)V
//        28: iinc          4, 1
//        31: goto          8
//        34: return
//      LineNumberTable:
//        line 15: 0
//        line 16: 20
//        line 15: 28
//        line 18: 34
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//           20       8     5     i   I
//            0      35     0  this   Ljvm/Learn_Syntactic_sugar/T4;
//            0      35     1     a   [I
//      StackMapTable: number_of_entries = 2
//        frame_type = 254 /* append */
//          offset_delta = 8
//          locals = [ class "[I", int, int ]
//        frame_type = 248 /* chop */
//          offset_delta = 25
//}
//SourceFile: "T4.java"
//
//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\Learn_Syntactic_sugar>


