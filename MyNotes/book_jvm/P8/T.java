package book_jvm.P8;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/15
 * \* Time: 15:31
 * \* Description:
 * \
 */
public class T {

    public int calc() {

        int a = 100;

        int b = 200;

        int c = 300;

        return (a+b) * c;


    }


    /*

    E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\P8>javap -verbose T
警告: 二进制文件T包含book_jvm.P8.T
Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/book_jvm/P8/T.class
  Last modified 2020-3-15; size 396 bytes
  MD5 checksum 4c3a994aca025c9a9179821fc24317cf
  Compiled from "T.java"
public class book_jvm.P8.T
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #3.#19         // java/lang/Object."<init>":()V
   #2 = Class              #20            // book_jvm/P8/T
   #3 = Class              #21            // java/lang/Object
   #4 = Utf8               <init>
   #5 = Utf8               ()V
   #6 = Utf8               Code
   #7 = Utf8               LineNumberTable
   #8 = Utf8               LocalVariableTable
   #9 = Utf8               this
  #10 = Utf8               Lbook_jvm/P8/T;
  #11 = Utf8               calc
  #12 = Utf8               ()I
  #13 = Utf8               a
  #14 = Utf8               I
  #15 = Utf8               b
  #16 = Utf8               c
  #17 = Utf8               SourceFile
  #18 = Utf8               T.java
  #19 = NameAndType        #4:#5          // "<init>":()V
  #20 = Utf8               book_jvm/P8/T
  #21 = Utf8               java/lang/Object
{
  public book_jvm.P8.T();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 11: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lbook_jvm/P8/T;


解析:

这段代码 需要  深度为 2 的操作数栈 以及 4 个 SLot的局部变量空间



  public int calc();
    descriptor: ()I
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=1

      首先 执行偏移地址为 0 的指令 bipush指令的作用是将单字节的整型常量值(-128 - 127)
      推入操作数栈顶  跟随着一个参数  指明推送的常量值  这里是  100

         0: bipush        100


         执行偏移地址为 2 的指令  istore_1 指令 作用将 操作数 栈顶的
         整型值出栈并存放到第一个局部变量 Slot

         后续 4 条指令(直到偏移值为 11 指令为止)都是做一样的事情

         就是 在对应代码中把变量 a b c 赋值为 100 200 300 这4条指令
         2: istore_1


         3: sipush        200
         6: istore_2
         7: sipush        300
        10: istore_3


        执行 11 指令

        iload_1指令作用是将局部变量表第一个Slot中的整型值复制到操作数栈顶


        11: iload_1


        执行 12 指令

        iload_2 执行过程与 iload_1类似

        把第二个 Slot的整型值入栈

        12: iload_2

        执行 13 指令

        iadd 将操作数栈中头两个栈顶元素出栈

        做整型加法   然后把结果重写入栈

        在 iadd指令执行完毕后   栈中原有的 100 和 200 出栈

        它们和 300 重新入栈
        13: iadd


        执行 14 指令

        iload_3 把存放在第3个局部变量Slot中的300压入操作数栈中

        这时操作数栈为两个整数300
        下一条指令 imul 将操作数栈中头两个栈顶元素出栈  做整型乘法

        然后把结果重新写入 栈  与 iadd完成类似

        14: iload_3
        15: imul


        执行 16 指令

        ireturn 方法返回指令之一

        它将结束方法执行并将操作数栈顶的整型值返回给此方法的调用者

        到此为止 方法执行结束




        16: ireturn
      LineNumberTable:
        line 15: 0
        line 17: 3
        line 19: 7
        line 21: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lbook_jvm/P8/T;
            3      14     1     a   I
            7      10     2     b   I
           11       6     3     c   I
}
SourceFile: "T.java"

E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\P8>

     */
}
