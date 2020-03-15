package book_jvm.P8;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/12
 * \* Time: 10:34
 * \* Description:
 * \
 */
public class DynamicDispatch {


/*
方法动态分派演示
 */
    static abstract class Human {
        protected abstract void sayHello();
    }

    static class Man extends Human {


        @Override
        protected void sayHello() {
            System.out.println("man say hello");
        }
    }

    static class Woman extends Human {


        @Override
        protected void sayHello() {
            System.out.println("woman say hello");
        }
    }

    public static void main(String[] args) {

        Human man = new Man();

        Human woman = new Woman();

        man.sayHello();

        woman.sayHello();

        man = new Woman();

        man.sayHello();

        /*

        man say hello
        woman say hello
        woman say hello


         */

        /*

        这里不可能再根据静态类型来决定了

        因为静态类型同样都是 Human 的两个变量man 和woman在调用

        sayhello方法时执行了不同的行为

        并且变量man在两次调用中执行了不同的方法

        导致这个现象的原因很明显

        因为两个变量的实际类型不同

         */

    }


    /*

    E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\P8>javap -verbose DynamicDispatch
警告: 二进制文件DynamicDispatch包含book_jvm.P8.DynamicDispatch
Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/book_jvm/P8/DynamicDispatch.class
  Last modified 2020-3-12; size 759 bytes
  MD5 checksum b2b92bed3c80d4633336dd2c56a1636d
  Compiled from "DynamicDispatch.java"
public class book_jvm.P8.DynamicDispatch
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #8.#30         // java/lang/Object."<init>":()V
   #2 = Class              #31            // book_jvm/P8/DynamicDispatch$Man
   #3 = Methodref          #2.#30         // book_jvm/P8/DynamicDispatch$Man."<init>":()V
   #4 = Class              #32            // book_jvm/P8/DynamicDispatch$Woman
   #5 = Methodref          #4.#30         // book_jvm/P8/DynamicDispatch$Woman."<init>":()V
   #6 = Methodref          #12.#33        // book_jvm/P8/DynamicDispatch$Human.sayHello:()V
   #7 = Class              #34            // book_jvm/P8/DynamicDispatch
   #8 = Class              #35            // java/lang/Object
   #9 = Utf8               Woman
  #10 = Utf8               InnerClasses
  #11 = Utf8               Man
  #12 = Class              #36            // book_jvm/P8/DynamicDispatch$Human
  #13 = Utf8               Human
  #14 = Utf8               <init>
  #15 = Utf8               ()V
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Lbook_jvm/P8/DynamicDispatch;
  #21 = Utf8               main
  #22 = Utf8               ([Ljava/lang/String;)V
  #23 = Utf8               args
  #24 = Utf8               [Ljava/lang/String;
  #25 = Utf8               man
  #26 = Utf8               Lbook_jvm/P8/DynamicDispatch$Human;
  #27 = Utf8               woman
  #28 = Utf8               SourceFile
  #29 = Utf8               DynamicDispatch.java
  #30 = NameAndType        #14:#15        // "<init>":()V
  #31 = Utf8               book_jvm/P8/DynamicDispatch$Man
  #32 = Utf8               book_jvm/P8/DynamicDispatch$Woman
  #33 = NameAndType        #37:#15        // sayHello:()V
  #34 = Utf8               book_jvm/P8/DynamicDispatch
  #35 = Utf8               java/lang/Object
  #36 = Utf8               book_jvm/P8/DynamicDispatch$Human
  #37 = Utf8               sayHello
{
  public book_jvm.P8.DynamicDispatch();
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
            0       5     0  this   Lbook_jvm/P8/DynamicDispatch;




//  进行字节码分析了

0 - 15 是准备动作  建立man 和 woman 的内存空间  调用

Man 和 Woman 类型的实例构造器  将这两个实例的引用放在第 1 ,2 个局部变量表  slot之中

这个动作对应了代码中这两句:

Human man = new Man();

Human woman = new Woman();


16-21  关键部分

16 与 20 分别把刚刚创建的两个对象的引用压到栈顶  这两个对象是将要执行的
sayHello()方法的所有者 称为接收者


17和21 是方法调用指令  这两条调用指令单从字节码角度看

无论是指令(都是invokevirtual)还是参数(都是常量池中第22项的常量) 是完全一样的

但是这两句指令最终执行的目标方法并不相同

原因需要从  invokevirtual指令的多态查找过程说起

invokevirtual指令的运行时解析过程大致如下:


1). 找到操作数栈顶的第一个元素所指向的对象的实际类型，记作C.

2). 如果在类型C中找到与常量池中描述符和简单名称都相符的方法，则进行访问权限的校验，如果校验不通过，则返回java.lang.IllegaAccessError异常，校验通过则直接返回方法的直接引用，查找过程结束。

3). 否则，按照继承关系从下往上一次对C的各个父类进行第二步骤的搜索和验证过程。

4). 如果始终还是没有找到合适的方法直接引用，则抛出java.lang.AbstractMethodError异常。

由于invokevirtual指令执行的第一步是在运行时确定接收者的实际类型，所以两次中的invokevirtual指令把常量池中的类方法符号引用解析到不同的直接引用上，这个就是java语言中方法重写的本质。


  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=3, args_size=1
         0: new           #2                  // class book_jvm/P8/DynamicDispatch$Man
         3: dup
         4: invokespecial #3                  // Method book_jvm/P8/DynamicDispatch$Man."<init>":()V
         7: astore_1
         8: new           #4                  // class book_jvm/P8/DynamicDispatch$Woman
        11: dup
        12: invokespecial #5                  // Method book_jvm/P8/DynamicDispatch$Woman."<init>":()V
        15: astore_2
        16: aload_1
        17: invokevirtual #6                  // Method book_jvm/P8/DynamicDispatch$Human.sayHello:()V
        20: aload_2
        21: invokevirtual #6                  // Method book_jvm/P8/DynamicDispatch$Human.sayHello:()V
        24: new           #4                  // class book_jvm/P8/DynamicDispatch$Woman
        27: dup
        28: invokespecial #5                  // Method book_jvm/P8/DynamicDispatch$Woman."<init>":()V
        31: astore_1
        32: aload_1
        33: invokevirtual #6                  // Method book_jvm/P8/DynamicDispatch$Human.sayHello:()V
        36: return
      LineNumberTable:
        line 41: 0
        line 43: 8
        line 45: 16
        line 47: 20
        line 49: 24
        line 51: 32
        line 78: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  args   [Ljava/lang/String;
            8      29     1   man   Lbook_jvm/P8/DynamicDispatch$Human;
           16      21     2 woman   Lbook_jvm/P8/DynamicDispatch$Human;
}
SourceFile: "DynamicDispatch.java"
InnerClasses:
     static #9= #4 of #7; //Woman=class book_jvm/P8/DynamicDispatch$Woman of class book_jvm/P8/DynamicDispatch
     static #11= #2 of #7; //Man=class book_jvm/P8/DynamicDispatch$Man of class book_jvm/P8/DynamicDispatch
     static abstract #13= #12 of #7; //Human=class book_jvm/P8/DynamicDispatch$Human of class book_jvm/P8/DynamicDispatch

E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\P8>javap -verbose DynamicDispatch



     */


}
