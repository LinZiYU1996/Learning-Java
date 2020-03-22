package jvm.ji_ke_shi_jian.P7;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/21
 * \* Time: 16:52
 * \* Description:
 * \
 */
public class Foo {

    private int tryBlock;
    private int catchBlock;
    private int finallyBlock;
    private int methodExit;

    public void test() {
        try {
            tryBlock = 0;
        } catch (Exception e) {
            catchBlock = 1;
        } finally {
            finallyBlock = 2;
        }
        methodExit = 3;
    }

}


//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\ji_ke_shi_jian\P7>javap -v Foo
//警告: 二进制文件Foo包含jvm.ji_ke_shi_jian.P7.Foo
//Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/jvm/ji_ke_shi_jian/P7/Foo.class
//  Last modified 2020-3-21; size 698 bytes
//  MD5 checksum 69264ce472afdf1e029b89cd45d415e5
//  Compiled from "Foo.java"
//public class jvm.ji_ke_shi_jian.P7.Foo
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Methodref          #8.#29         // java/lang/Object."<init>":()V
//   #2 = Fieldref           #7.#30         // jvm/ji_ke_shi_jian/P7/Foo.tryBlock:I
//   #3 = Fieldref           #7.#31         // jvm/ji_ke_shi_jian/P7/Foo.finallyBlock:I
//   #4 = Class              #32            // java/lang/Exception
//   #5 = Fieldref           #7.#33         // jvm/ji_ke_shi_jian/P7/Foo.catchBlock:I
//   #6 = Fieldref           #7.#34         // jvm/ji_ke_shi_jian/P7/Foo.methodExit:I
//   #7 = Class              #35            // jvm/ji_ke_shi_jian/P7/Foo
//   #8 = Class              #36            // java/lang/Object
//   #9 = Utf8               tryBlock
//  #10 = Utf8               I
//  #11 = Utf8               catchBlock
//  #12 = Utf8               finallyBlock
//  #13 = Utf8               methodExit
//  #14 = Utf8               <init>
//  #15 = Utf8               ()V
//  #16 = Utf8               Code
//  #17 = Utf8               LineNumberTable
//  #18 = Utf8               LocalVariableTable
//  #19 = Utf8               this
//  #20 = Utf8               Ljvm/ji_ke_shi_jian/P7/Foo;
//  #21 = Utf8               test
//  #22 = Utf8               e
//  #23 = Utf8               Ljava/lang/Exception;
//  #24 = Utf8               StackMapTable
//  #25 = Class              #32            // java/lang/Exception
//  #26 = Class              #37            // java/lang/Throwable
//  #27 = Utf8               SourceFile
//  #28 = Utf8               Foo.java
//  #29 = NameAndType        #14:#15        // "<init>":()V
//  #30 = NameAndType        #9:#10         // tryBlock:I
//  #31 = NameAndType        #12:#10        // finallyBlock:I
//  #32 = Utf8               java/lang/Exception
//  #33 = NameAndType        #11:#10        // catchBlock:I
//  #34 = NameAndType        #13:#10        // methodExit:I
//  #35 = Utf8               jvm/ji_ke_shi_jian/P7/Foo
//  #36 = Utf8               java/lang/Object
//  #37 = Utf8               java/lang/Throwable
//{
//  public jvm.ji_ke_shi_jian.P7.Foo();
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
//            0       5     0  this   Ljvm/ji_ke_shi_jian/P7/Foo;
//
//  public void test();
//    descriptor: ()V
//    flags: ACC_PUBLIC
//    Code:
//      stack=2, locals=3, args_size=1
//         0: aload_0
//         1: iconst_0
//         2: putfield      #2                  // Field tryBlock:I
//         5: aload_0
//         6: iconst_2
//         7: putfield      #3                  // Field finallyBlock:I
//        10: goto          35
//        13: astore_1
//        14: aload_0
//        15: iconst_1
//        16: putfield      #5                  // Field catchBlock:I
//        19: aload_0
//        20: iconst_2
//        21: putfield      #3                  // Field finallyBlock:I
//        24: goto          35
//        27: astore_2
//        28: aload_0
//        29: iconst_2
//        30: putfield      #3                  // Field finallyBlock:I

/*
可以看到，编译结果包含三份 finally 代码块。其中，前两份分别位于 try 代码块和 catch 代码块的正常执行路径出口。
最后一份则作为异常处理器，监控 try 代码块以及 catch 代码块。它将捕获 try 代码块触发的、未被 catch 代码块捕获的异常，以及 catch 代码块触发的异常。

这里有一个小问题，如果 catch 代码块捕获了异常，并且触发了另一个异常，那么 finally 捕获并且重抛的异常是哪个呢？答案是后者。
也就是说原本的异常便会被忽略掉，这对于代码调试来说十分不利。
 */
//        33: aload_2
//        34: athrow
//        35: aload_0
//        36: iconst_3
//        37: putfield      #6                  // Field methodExit:I
//        40: return
//      Exception table:
//         from    to  target type
//             0     5    13   Class java/lang/Exception
//             0     5    27   any
//            13    19    27   any
//      LineNumberTable:
//        line 20: 0
//        line 24: 5
//        line 25: 10
//        line 21: 13
//        line 22: 14
//        line 24: 19
//        line 25: 24
//        line 24: 27
//        line 25: 33
//        line 26: 35
//        line 27: 40
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//           14       5     1     e   Ljava/lang/Exception;
//            0      41     0  this   Ljvm/ji_ke_shi_jian/P7/Foo;
//      StackMapTable: number_of_entries = 3
//        frame_type = 77 /* same_locals_1_stack_item */
//          stack = [ class java/lang/Exception ]
//        frame_type = 77 /* same_locals_1_stack_item */
//          stack = [ class java/lang/Throwable ]
//        frame_type = 7 /* same */
//}
//SourceFile: "Foo.java"

