package jvm;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/17
 * \* Time: 20:31
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

/*
极客时间教程


这里面我用到了两个选项。第一个选项是 -p。默认情况下 javap 会打印所有非私有的字段和方法，
当加了 -p 选项后，它还将打印私有的字段和方法。第二个选项是 -v。它尽可能地打印所有信息。
如果你只需要查阅方法对应的字节码，那么可以用 -c 选项来替换 -v。




 */

/*

E:\learn-java\Learning-Java\output\production\Learning-Java\jvm>javap -v Foo
警告: 二进制文件Foo包含jvm.Foo




 javap 的 -v 选项的输出分为几大块。

1. 基本信息，涵盖了原 class 文件的相关信息。

class 文件的版本号（minor version: 0，major version: 54），该类的访问权限（flags: (0x0021) ACC_PUBLIC, ACC_SUPER），该类（this_class: #7）以及父类（super_class: #8）的名字，所实现接口（interfaces: 0）、字段（fields: 4）、方法（methods: 2）以及属性（attributes: 1）的数目。

这里属性指的是 class 文件所携带的辅助信息，比如该 class 文件的源文件的名称。这类信息通常被用于 Java 虚拟机的验证和运行，以及 Java 程序的调试，一般无须深入了解。



Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/jvm/Foo.class
  Last modified 2020-3-17; size 662 bytes
  MD5 checksum b1d33ad9d9663dcf77dcc5d3833391db
  Compiled from "Foo.java"
public class jvm.Foo
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER





常量池，用来存放各种常量以及符号引用。

//常量池中的每一项都有一个对应的索引（如 #1），并且可能引用其他的常量池项（#1 = Methodref #8.#23）




 */
/*


Constant pool:
   #1 = Methodref          #8.#29         // java/lang/Object."<init>":()V
   #2 = Fieldref           #7.#30         // jvm/Foo.tryBlock:I
   #3 = Fieldref           #7.#31         // jvm/Foo.finallyBlock:I
   #4 = Class              #32            // java/lang/Exception
   #5 = Fieldref           #7.#33         // jvm/Foo.catchBlock:I
   #6 = Fieldref           #7.#34         // jvm/Foo.methodExit:I
   #7 = Class              #35            // jvm/Foo
   #8 = Class              #36            // java/lang/Object
   #9 = Utf8               tryBlock
  #10 = Utf8               I
  #11 = Utf8               catchBlock
  #12 = Utf8               finallyBlock
  #13 = Utf8               methodExit
  #14 = Utf8               <init>
  #15 = Utf8               ()V
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Ljvm/Foo;
  #21 = Utf8               test
  #22 = Utf8               e
  #23 = Utf8               Ljava/lang/Exception;
  #24 = Utf8               StackMapTable
  #25 = Class              #32            // java/lang/Exception
  #26 = Class              #37            // java/lang/Throwable
  #27 = Utf8               SourceFile
  #28 = Utf8               Foo.java
  #29 = NameAndType        #14:#15        // "<init>":()V
  #30 = NameAndType        #9:#10         // tryBlock:I
  #31 = NameAndType        #12:#10        // finallyBlock:I
  #32 = Utf8               java/lang/Exception
  #33 = NameAndType        #11:#10        // catchBlock:I
  #34 = NameAndType        #13:#10        // methodExit:I
  #35 = Utf8               jvm/Foo
  #36 = Utf8               java/lang/Object
  #37 = Utf8               java/lang/Throwable





 */





 /*
{



  方法区域，用来列举该类中的各个方法。

除了方法描述符以及访问权限之外，每个方法还包括最为重要的代码区域（Code:)。
  public jvm.Foo();
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
            0       5     0  this   Ljvm/Foo;

  public void test();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:


  代码区域一开始会声明该方法中的操作数栈（stack=2）和局部变量数目（locals=3）的最大值，以及该方法接收参数的个数（args_size=1）。注意这里局部变量指的是字节码中的局部变量，而非 Java 程序中的局部变量。

接下来则是该方法的字节码。每条字节码均标注了对应的偏移量（bytecode index，BCI），这是用来定位字节码的。比如说偏移量为 10 的跳转字节码 10: goto 35，将跳转至偏移量为 35 的字节码 35: aload_0。
      stack=2, locals=3, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #2                  // Field tryBlock:I
         5: aload_0
         6: iconst_2
         7: putfield      #3                  // Field finallyBlock:I
        10: goto          35
        13: astore_1
        14: aload_0
        15: iconst_1
        16: putfield      #5                  // Field catchBlock:I
        19: aload_0
        20: iconst_2
        21: putfield      #3                  // Field finallyBlock:I
        24: goto          35
        27: astore_2
        28: aload_0
        29: iconst_2
        30: putfield      #3                  // Field finallyBlock:I
        33: aload_2
        34: athrow
        35: aload_0
        36: iconst_3
        37: putfield      #6                  // Field methodExit:I
        40: return



紧跟着的异常表（Exception table:）也会使用偏移量来定位每个异常处理器所监控的范围（由 from 到 to 的代码区域），以及异常处理器的起始位置（target）。除此之外，它还会声明所捕获的异常类型（type）。其中，any 指代任意异常类型。
      Exception table:
         from    to  target type
             0     5    13   Class java/lang/Exception
             0     5    27   any
            13    19    27   any



再接下来的行数表（LineNumberTable:）则是 Java 源程序到字节码偏移量的映射。如果你在编译时使用了 -g 参数（javac -g Foo.java），
那么这里还将出现局部变量表（LocalVariableTable:），展示 Java 程序中每个局部变量的名字、类型以及作用域。



  */

 /*
行数表和局部变量表均属于调试信息。Java 虚拟机并不要求 class 文件必备这些信息。
      LineNumberTable:
        line 20: 0
        line 24: 5
        line 25: 10
        line 21: 13
        line 22: 14
        line 24: 19
        line 25: 24
        line 24: 27
        line 25: 33
        line 26: 35
        line 27: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14       5     1     e   Ljava/lang/Exception;
            0      41     0  this   Ljvm/Foo;




          最后则是字节码操作数栈的映射表（StackMapTable: number_of_entries = 3）。该表描述的是字节码跳转后操作数栈的分布情况，
          一般被 Java 虚拟机用于验证所加载的类，以及即时编译相关的一些操作，正常情况下，你无须深入了解。




      StackMapTable: number_of_entries = 3
        frame_type = 77 /* same_locals_1_stack_item */




//          stack = [ class java/lang/Exception ]
//        frame_type = 77 /* same_locals_1_stack_item */
//        stack = [ class java/lang/Throwable ]
//        frame_type = 7 /* same */
//        }
//        SourceFile: "Foo.java"
//
//        E:\learn-java\Learning-Java\output\production\Learning-Java\jvm>


// */
