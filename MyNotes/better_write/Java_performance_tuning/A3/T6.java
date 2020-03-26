package better_write.Java_performance_tuning.A3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/25
 * \* Time: 9:55
 * \* Description:
 * \
 */
public class T6 {


    public static void main(String[] args) {

        String a =new String("abc").intern();
        String b = new String("abc").intern();

        if(a==b) {
            System.out.print("a==b");
        }

        /*
        在一开始创建 a 变量时，会在堆内存中创建一个对象，同时会在加载类时，在常量池中创建一个字符串对象，在调用 intern 方法之后，会去常量池中查找是否有等于该字符串的对象，有就返回引用。

在创建 b 字符串变量时，也会在堆中创建一个对象，此时常量池中有该字符串对象，就不再创建。调用 intern 方法则会去常量池中判断是否有等于该字符串的对象，
发现有等于"abc"字符串的对象，就直接返回引用。而在堆内存中的对象，由于没有引用指向它，将会被垃圾回收。所以 a 和 b 引用的是同一个对象。
         */

    }
}


//E:\learn-java\Learning-Java\output\production\Learning-Java\better_write\Java_performance_tuning\A3>javap -v T6
//警告: 二进制文件T6包含better_write.Java_performance_tuning.A3.T6
//Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/better_write/Java_performance_tuning/A3/T6.class
//  Last modified 2020-3-25; size 791 bytes
//  MD5 checksum 4c55584ce2244bbe4ed77f3b9fcfc0f1
//  Compiled from "T6.java"
//public class better_write.Java_performance_tuning.A3.T6
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Methodref          #10.#29        // java/lang/Object."<init>":()V
//   #2 = Class              #30            // java/lang/String
//   #3 = String             #31            // abc
//   #4 = Methodref          #2.#32         // java/lang/String."<init>":(Ljava/lang/String;)V
//   #5 = Methodref          #2.#33         // java/lang/String.intern:()Ljava/lang/String;
//   #6 = Fieldref           #34.#35        // java/lang/System.out:Ljava/io/PrintStream;
//   #7 = String             #36            // a==b
//   #8 = Methodref          #37.#38        // java/io/PrintStream.print:(Ljava/lang/String;)V
//   #9 = Class              #39            // better_write/Java_performance_tuning/A3/T6
//  #10 = Class              #40            // java/lang/Object
//  #11 = Utf8               <init>
//  #12 = Utf8               ()V
//  #13 = Utf8               Code
//  #14 = Utf8               LineNumberTable
//  #15 = Utf8               LocalVariableTable
//  #16 = Utf8               this
//  #17 = Utf8               Lbetter_write/Java_performance_tuning/A3/T6;
//  #18 = Utf8               main
//  #19 = Utf8               ([Ljava/lang/String;)V
//  #20 = Utf8               args
//  #21 = Utf8               [Ljava/lang/String;
//  #22 = Utf8               a
//  #23 = Utf8               Ljava/lang/String;
//  #24 = Utf8               b
//  #25 = Utf8               StackMapTable
//  #26 = Class              #30            // java/lang/String
//  #27 = Utf8               SourceFile
//  #28 = Utf8               T6.java
//  #29 = NameAndType        #11:#12        // "<init>":()V
//  #30 = Utf8               java/lang/String
//  #31 = Utf8               abc
//  #32 = NameAndType        #11:#41        // "<init>":(Ljava/lang/String;)V
//  #33 = NameAndType        #42:#43        // intern:()Ljava/lang/String;
//  #34 = Class              #44            // java/lang/System
//  #35 = NameAndType        #45:#46        // out:Ljava/io/PrintStream;
//  #36 = Utf8               a==b
//  #37 = Class              #47            // java/io/PrintStream
//  #38 = NameAndType        #48:#41        // print:(Ljava/lang/String;)V
//  #39 = Utf8               better_write/Java_performance_tuning/A3/T6
//  #40 = Utf8               java/lang/Object
//  #41 = Utf8               (Ljava/lang/String;)V
//  #42 = Utf8               intern
//  #43 = Utf8               ()Ljava/lang/String;
//  #44 = Utf8               java/lang/System
//  #45 = Utf8               out
//  #46 = Utf8               Ljava/io/PrintStream;
//  #47 = Utf8               java/io/PrintStream
//  #48 = Utf8               print
//{
//  public better_write.Java_performance_tuning.A3.T6();
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
//            0       5     0  this   Lbetter_write/Java_performance_tuning/A3/T6;
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=3, locals=3, args_size=1
//         0: new           #2                  // class java/lang/String
//         3: dup
//         4: ldc           #3                  // String abc
//         6: invokespecial #4                  // Method java/lang/String."<init>":(Ljava/lang/String;)V
//         9: invokevirtual #5                  // Method java/lang/String.intern:()Ljava/lang/String;
//        12: astore_1
//        13: new           #2                  // class java/lang/String
//        16: dup
//        17: ldc           #3                  // String abc
//        19: invokespecial #4                  // Method java/lang/String."<init>":(Ljava/lang/String;)V
//        22: invokevirtual #5                  // Method java/lang/String.intern:()Ljava/lang/String;
//        25: astore_2
//        26: aload_1
//        27: aload_2
//        28: if_acmpne     39
//        31: getstatic     #6                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        34: ldc           #7                  // String a==b
//        36: invokevirtual #8                  // Method java/io/PrintStream.print:(Ljava/lang/String;)V
//        39: return
//      LineNumberTable:
//        line 16: 0
//        line 17: 13
//        line 19: 26
//        line 20: 31
//        line 23: 39
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      40     0  args   [Ljava/lang/String;
//           13      27     1     a   Ljava/lang/String;
//           26      14     2     b   Ljava/lang/String;
//      StackMapTable: number_of_entries = 1
//        frame_type = 253 /* append */
//          offset_delta = 39
//          locals = [ class java/lang/String, class java/lang/String ]
//}
//SourceFile: "T6.java"
//
//E:\learn-java\Learning-Java\output\production\Learning-Java\better_write\Java_performance_tuning\A3>

