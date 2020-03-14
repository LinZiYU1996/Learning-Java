package book_jvm.P6;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/14
 * \* Time: 11:12
 * \* Description:
 * \
 */
public class T1 {

/*
字节码学习
 */
    private int m;

    public int inc() {
        return  m + 1;
    }



}
/*

E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\P6>javap -verbose T1
警告: 二进制文件T1包含book_jvm.P6.T1
Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/book_jvm/P6/T1.class
  Last modified 2020-3-14; size 356 bytes
  MD5 checksum 21ccb1da9bb3dd6e179d30852f3b0541
  Compiled from "T1.java"
public class book_jvm.P6.T1
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #4.#18         // java/lang/Object."<init>":()V
   #2 = Fieldref           #3.#19         // book_jvm/P6/T1.m:I
   #3 = Class              #20            // book_jvm/P6/T1
   #4 = Class              #21            // java/lang/Object
   #5 = Utf8               m
   #6 = Utf8               I
   #7 = Utf8               <init>
   #8 = Utf8               ()V
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               LocalVariableTable
  #12 = Utf8               this
  #13 = Utf8               Lbook_jvm/P6/T1;
  #14 = Utf8               inc
  #15 = Utf8               ()I
  #16 = Utf8               SourceFile
  #17 = Utf8               T1.java
  #18 = NameAndType        #7:#8          // "<init>":()V
  #19 = NameAndType        #5:#6          // m:I
  #20 = Utf8               book_jvm/P6/T1
  #21 = Utf8               java/lang/Object
{
  public book_jvm.P6.T1();
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
            0       5     0  this   Lbook_jvm/P6/T1;

  public int inc();
    descriptor: ()I
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #2                  // Field m:I
         4: iconst_1
         5: iadd
         6: ireturn
      LineNumberTable:
        line 17: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lbook_jvm/P6/T1;
}
SourceFile: "T1.java"

E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\P6>
 */

/*

这个类两个方法


实例构造器<init>()   inc()

它们都是没有参数的

但是为甚  Args_size == 1

无论参数列表还是方法体内 都没有定义任何局部变量  为什么Locals = 1

解答:

任何实例方法 都可以通过  this

关键字来访问到此方法所属的对象  这个访问机制

对Java 程序很重要

它的实现很简单:


仅仅是通过  Javac 编译器编译的时候把对this关键字的访问转变为对一个普通
方法参数的访问  然后在虚拟机调用实例方法时自动传入此参数而已

因此在实例方法的局部变量表中至少会存在一个指向当前对象实例的局部变量

局部变量表中也会预留出一个Slot位置来存放对象实例的引用

方法参数值 从 1 开始计算

这个处理只对          实例方法有效

如果上述Java代码中  inc方法声明 加上 static

那么 Args_size 就 == 0










 */