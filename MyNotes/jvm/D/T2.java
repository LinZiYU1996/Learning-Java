package jvm.D;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/18
 * \* Time: 20:28
 * \* Description:
 * \
 */
public class T2 {

    private int num;

    public static void main(String[] args) {

        T2 t2 = new T2();


    }
}


//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\D>javap -v T2
//        警告: 二进制文件T2包含jvm.D.T2
//        Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/jvm/D/T2.class
//Last modified 2020-3-18; size 411 bytes
//        MD5 checksum 0bd855b51dc2bbd6882b29746d64fb83
//        Compiled from "T2.java"
//public class jvm.D.T2
//        minor version: 0
//        major version: 52
//        flags: ACC_PUBLIC, ACC_SUPER
//        Constant pool:
//        #1 = Methodref          #4.#21         // java/lang/Object."<init>":()V
//        #2 = Class              #22            // jvm/D/T2
//        #3 = Methodref          #2.#21         // jvm/D/T2."<init>":()V
//        #4 = Class              #23            // java/lang/Object
//        #5 = Utf8               num
//        #6 = Utf8               I
//        #7 = Utf8               <init>
//   #8 = Utf8               ()V
//           #9 = Utf8               Code
//           #10 = Utf8               LineNumberTable
//           #11 = Utf8               LocalVariableTable
//           #12 = Utf8               this
//           #13 = Utf8               Ljvm/D/T2;
//           #14 = Utf8               main
//           #15 = Utf8               ([Ljava/lang/String;)V
//           #16 = Utf8               args
//           #17 = Utf8               [Ljava/lang/String;
//           #18 = Utf8               t2
//           #19 = Utf8               SourceFile
//           #20 = Utf8               T2.java
//           #21 = NameAndType        #7:#8          // "<init>":()V
//           #22 = Utf8               jvm/D/T2
//           #23 = Utf8               java/lang/Object
//           {
//public jvm.D.T2();
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
//        0       5     0  this   Ljvm/D/T2;
//
//public static void main(java.lang.String[]);
//        descriptor: ([Ljava/lang/String;)V
//        flags: ACC_PUBLIC, ACC_STATIC
//        Code:
//        stack=2, locals=2, args_size=1
//        0: new           #2                  // class jvm/D/T2
//        3: dup
//        4: invokespecial #3                  // Method "<init>":()V
//        7: astore_1
//        8: return
//        LineNumberTable:
//        line 17: 0
//        line 20: 8
//        LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//        0       9     0  args   [Ljava/lang/String;
//        8       1     1    t2   Ljvm/D/T2;
//        }
//        SourceFile: "T2.java"
