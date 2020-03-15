package book_jvm.P8;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/11
 * \* Time: 22:26
 * \* Description:
 * \
 */
public class StaticDispatch {

    /*

    方法静态分派演示

     */

    static abstract class Human {

    }


    static class Man extends Human {

    }

    static class Woman extends Human {

    }

    public void sayHello(Human guy) {
        System.out.println("hello guy");
    }

    public void sayHello(Man guy) {
        System.out.println("hello gentleman");
    }

    public void sayHello(Woman guy) {
        System.out.println("hello lady");
    }

    public static void main(String[] args) {

        Human man = new Man();

        Human woman = new Woman();

        StaticDispatch staticDispatch = new StaticDispatch();

        staticDispatch.sayHello(man);

        staticDispatch.sayHello(woman);


        //hello guy
        //hello guy

        /*
        如果不明白为什么是这样的结果，我们先来了解一下，什么是静态类型和实际类型。

        Human man = new Man();
        Human woman = new Woman();

        这里Human为静态类型，man和woman为实际类型。区别为静态类型的变化仅仅在使用时发生，变量本身的静态类型不会改变，并且最终的静态类型是在编译期间可知的；而实际类型变化的结果在运行期间才可确定，编译器在编译程序时并不知道一个对象的实际类型是什么。


        静态分配最典型的应用就是方法重载。我们再来复习一下方法重载的定义：在一个类中有多个方法，名称相同但参数列表不同（参数个数，参数类型，参数顺序）。上面例子就是方法重载。这里的运行结果毫不意外。

        sr.sayHello(man);
        sr.sayHello(woman);

        man和woman的静态类型都是Human。
         */

        /*




        Human man = new Man()

        Human 变量的静态类型  或者叫  外观类型


        Man  变量的实际类型

        静态和实际类型在程序中都可以发生变化

        区别是

        静态：

        仅仅在使用时发生 变量本身的静态类型不会被改变 并且最终的静态类型在编译期是可知的

        实际类型变化的结果在运行期才可以确定

        编译器在编译程序时并不知道一个对象的实际类型是什么

        // 实际类型变化

        Human man = new Man();

        man = new Woman();

        // 静态类型变化

        sr.sayHello( (Man) man);

        sr.sayHello( (Woman) man);



        上面例子中：

        main中的两次sayHello方法调用

        在方法接受者已经确定对象是staticDispatch的前提下

        使用哪个重载版本，就完全取决于参数的数量和数据类型

        代码中刻意定义两个：

        静态类型相同  实际类型不同的变量

        但是编译器在重载时是通过参数的静态类型而不是实际类型作为判断依据的

        并且静态类型是编译器可知的

        因此，编译阶段，Javac编译器会根据参数的静态类型决定使用哪个重载版本

        所以选择了sayHello(Human)作为调用目标

         */


        /*

        E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\P8>javap -verbose StaticDispatch
警告: 二进制文件StaticDispatch包含book_jvm.P8.StaticDispatch
Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/book_jvm/P8/StaticDispatch.class
  Last modified 2020-3-11; size 1394 bytes
  MD5 checksum ef13afeb3eadaccf8ee43f2b4673a06e
  Compiled from "StaticDispatch.java"
public class book_jvm.P8.StaticDispatch
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #14.#44        // java/lang/Object."<init>":()V
   #2 = Fieldref           #45.#46        // java/lang/System.out:Ljava/io/PrintStream;
   #3 = String             #47            // hello guy
   #4 = Methodref          #48.#49        // java/io/PrintStream.println:(Ljava/lang/String;)V
   #5 = String             #50            // hello gentleman
   #6 = String             #51            // hello lady
   #7 = Class              #52            // book_jvm/P8/StaticDispatch$Man
   #8 = Methodref          #7.#44         // book_jvm/P8/StaticDispatch$Man."<init>":()V
   #9 = Class              #53            // book_jvm/P8/StaticDispatch$Woman
  #10 = Methodref          #9.#44         // book_jvm/P8/StaticDispatch$Woman."<init>":()V
  #11 = Class              #54            // book_jvm/P8/StaticDispatch
  #12 = Methodref          #11.#44        // book_jvm/P8/StaticDispatch."<init>":()V
  #13 = Methodref          #11.#55        // book_jvm/P8/StaticDispatch.sayHello:(Lbook_jvm/P8/StaticDispatch$Human;)V
  #14 = Class              #56            // java/lang/Object
  #15 = Utf8               Woman
  #16 = Utf8               InnerClasses
  #17 = Utf8               Man
  #18 = Class              #57            // book_jvm/P8/StaticDispatch$Human
  #19 = Utf8               Human
  #20 = Utf8               <init>
  #21 = Utf8               ()V
  #22 = Utf8               Code
  #23 = Utf8               LineNumberTable
  #24 = Utf8               LocalVariableTable
  #25 = Utf8               this
  #26 = Utf8               Lbook_jvm/P8/StaticDispatch;
  #27 = Utf8               sayHello
  #28 = Utf8               (Lbook_jvm/P8/StaticDispatch$Human;)V
  #29 = Utf8               guy
  #30 = Utf8               Lbook_jvm/P8/StaticDispatch$Human;
  #31 = Utf8               (Lbook_jvm/P8/StaticDispatch$Man;)V
  #32 = Utf8               Lbook_jvm/P8/StaticDispatch$Man;
  #33 = Utf8               (Lbook_jvm/P8/StaticDispatch$Woman;)V
  #34 = Utf8               Lbook_jvm/P8/StaticDispatch$Woman;
  #35 = Utf8               main
  #36 = Utf8               ([Ljava/lang/String;)V
  #37 = Utf8               args
  #38 = Utf8               [Ljava/lang/String;
  #39 = Utf8               man
  #40 = Utf8               woman
  #41 = Utf8               staticDispatch
  #42 = Utf8               SourceFile
  #43 = Utf8               StaticDispatch.java
  #44 = NameAndType        #20:#21        // "<init>":()V
  #45 = Class              #58            // java/lang/System
  #46 = NameAndType        #59:#60        // out:Ljava/io/PrintStream;
  #47 = Utf8               hello guy
  #48 = Class              #61            // java/io/PrintStream
  #49 = NameAndType        #62:#63        // println:(Ljava/lang/String;)V
  #50 = Utf8               hello gentleman
  #51 = Utf8               hello lady
  #52 = Utf8               book_jvm/P8/StaticDispatch$Man
  #53 = Utf8               book_jvm/P8/StaticDispatch$Woman
  #54 = Utf8               book_jvm/P8/StaticDispatch
  #55 = NameAndType        #27:#28        // sayHello:(Lbook_jvm/P8/StaticDispatch$Human;)V
  #56 = Utf8               java/lang/Object
  #57 = Utf8               book_jvm/P8/StaticDispatch$Human
  #58 = Utf8               java/lang/System
  #59 = Utf8               out
  #60 = Utf8               Ljava/io/PrintStream;
  #61 = Utf8               java/io/PrintStream
  #62 = Utf8               println
  #63 = Utf8               (Ljava/lang/String;)V
{
  public book_jvm.P8.StaticDispatch();
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
            0       5     0  this   Lbook_jvm/P8/StaticDispatch;

  public void sayHello(book_jvm.P8.StaticDispatch$Human);
    descriptor: (Lbook_jvm/P8/StaticDispatch$Human;)V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #3                  // String hello guy
         5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 33: 0
        line 34: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lbook_jvm/P8/StaticDispatch;
            0       9     1   guy   Lbook_jvm/P8/StaticDispatch$Human;

  public void sayHello(book_jvm.P8.StaticDispatch$Man);
    descriptor: (Lbook_jvm/P8/StaticDispatch$Man;)V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #5                  // String hello gentleman
         5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 37: 0
        line 38: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lbook_jvm/P8/StaticDispatch;
            0       9     1   guy   Lbook_jvm/P8/StaticDispatch$Man;

  public void sayHello(book_jvm.P8.StaticDispatch$Woman);
    descriptor: (Lbook_jvm/P8/StaticDispatch$Woman;)V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #6                  // String hello lady
         5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 41: 0
        line 42: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lbook_jvm/P8/StaticDispatch;
            0       9     1   guy   Lbook_jvm/P8/StaticDispatch$Woman;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=4, args_size=1
         0: new           #7                  // class book_jvm/P8/StaticDispatch$Man
         3: dup
         4: invokespecial #8                  // Method book_jvm/P8/StaticDispatch$Man."<init>":()V
         7: astore_1
         8: new           #9                  // class book_jvm/P8/StaticDispatch$Woman
        11: dup
        12: invokespecial #10                 // Method book_jvm/P8/StaticDispatch$Woman."<init>":()V
        15: astore_2
        16: new           #11                 // class book_jvm/P8/StaticDispatch
        19: dup
        20: invokespecial #12                 // Method "<init>":()V
        23: astore_3
        24: aload_3
        25: aload_1
        26: invokevirtual #13                 // Method sayHello:(Lbook_jvm/P8/StaticDispatch$Human;)V
        29: aload_3
        30: aload_2
        31: invokevirtual #13                 // Method sayHello:(Lbook_jvm/P8/StaticDispatch$Human;)V
        34: return
      LineNumberTable:
        line 46: 0
        line 48: 8
        line 50: 16
        line 52: 24
        line 54: 29
        line 113: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  args   [Ljava/lang/String;
            8      27     1   man   Lbook_jvm/P8/StaticDispatch$Human;
           16      19     2 woman   Lbook_jvm/P8/StaticDispatch$Human;
           24      11     3 staticDispatch   Lbook_jvm/P8/StaticDispatch;
}
SourceFile: "StaticDispatch.java"
InnerClasses:
     static #15= #9 of #11; //Woman=class book_jvm/P8/StaticDispatch$Woman of class book_jvm/P8/StaticDispatch
     static #17= #7 of #11; //Man=class book_jvm/P8/StaticDispatch$Man of class book_jvm/P8/StaticDispatch
     static abstract #19= #18 of #11; //Human=class book_jvm/P8/StaticDispatch$Human of class book_jvm/P8/StaticDispatch

E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\P8>




         */

    }

}
