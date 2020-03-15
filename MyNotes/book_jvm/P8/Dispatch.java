package book_jvm.P8;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/12
 * \* Time: 10:52
 * \* Description:
 * \
 */
public class Dispatch {

    /*
     单分派 多分派 演示

     */
    static class QQ {

    }

    static class _360 {

    }

    public static class Father {

        public void hardChoice(QQ arg) {
            System.out.println("father choice QQ");
        }

        public void hardChoice(_360 arg) {
            System.out.println("father choice 360");
        }
    }


    public static class Son extends Father {
        public void hardChoice(QQ arg) {
            System.out.println("son choice QQ");
        }

        public void hardChoice(_360 arg) {
            System.out.println("son choice 360");
        }
    }

    public static void main(String[] args) {

        Father father = new Father();

        Father son = new Son();

        father.hardChoice(new _360());

        son.hardChoice(new QQ());

        /*
        father choice 360
        son choice QQ
         */

        /*

        编译阶段编译器的选择过程 静态分派的过程

        选择目标方法有两点:

        1 静态类型是 father 还是 son

        2 方法参数是 qq 还是 360


        这次选择结果的最终产物是产生了两条 invokevirtual 指令

        两条指令的参数分别为 常量池中 指向 father hardchoice（360）

        以及 father hardchoice（qq） 方法的符号引用

        因为是根据两个宗量进行选择  所以Java的静态分派属于多分派类型

        运行时阶段虚拟机的选择:

        动态分派的过程

        执行  son.hardchoice(new qq)时

        由于编译期间已经决定目标方法的签名必须是 hardchoice(qq)

        虚拟机此时不会关系传递过来的参数 到底是 qq

        到底是 腾讯qq 还是 奇瑞qq

        因为这时参数的静态类型  实际类型都对方法的选择不会构成任何影响

        唯一可以影响虚拟机选择的因素的只有此方法的接受者的实际类型是

        father 还是 son

        因为只有一个宗量作为选择依据  所以 Java 的动态分派

        属于  单分派类型






         */


        /*



        E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\P8>javap -verbose Dispatch
警告: 二进制文件Dispatch包含book_jvm.P8.Dispatch
Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/book_jvm/P8/Dispatch.class
  Last modified 2020-3-12; size 834 bytes
  MD5 checksum 6bf38b0251e2b7b1fcd9c10739914e35
  Compiled from "Dispatch.java"
public class book_jvm.P8.Dispatch
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #13.#35        // java/lang/Object."<init>":()V
   #2 = Class              #36            // book_jvm/P8/Dispatch$Father
   #3 = Methodref          #2.#35         // book_jvm/P8/Dispatch$Father."<init>":()V
   #4 = Class              #37            // book_jvm/P8/Dispatch$Son
   #5 = Methodref          #4.#35         // book_jvm/P8/Dispatch$Son."<init>":()V
   #6 = Class              #38            // book_jvm/P8/Dispatch$_360
   #7 = Methodref          #6.#35         // book_jvm/P8/Dispatch$_360."<init>":()V
   #8 = Methodref          #2.#39         // book_jvm/P8/Dispatch$Father.hardChoice:(Lbook_jvm/P8/Dispatch$_360;)V
   #9 = Class              #40            // book_jvm/P8/Dispatch$QQ
  #10 = Methodref          #9.#35         // book_jvm/P8/Dispatch$QQ."<init>":()V
  #11 = Methodref          #2.#41         // book_jvm/P8/Dispatch$Father.hardChoice:(Lbook_jvm/P8/Dispatch$QQ;)V
  #12 = Class              #42            // book_jvm/P8/Dispatch
  #13 = Class              #43            // java/lang/Object
  #14 = Utf8               Son
  #15 = Utf8               InnerClasses
  #16 = Utf8               Father
  #17 = Utf8               _360
  #18 = Utf8               QQ
  #19 = Utf8               <init>
  #20 = Utf8               ()V
  #21 = Utf8               Code
  #22 = Utf8               LineNumberTable
  #23 = Utf8               LocalVariableTable
  #24 = Utf8               this
  #25 = Utf8               Lbook_jvm/P8/Dispatch;
  #26 = Utf8               main
  #27 = Utf8               ([Ljava/lang/String;)V
  #28 = Utf8               args
  #29 = Utf8               [Ljava/lang/String;
  #30 = Utf8               father
  #31 = Utf8               Lbook_jvm/P8/Dispatch$Father;
  #32 = Utf8               son
  #33 = Utf8               SourceFile
  #34 = Utf8               Dispatch.java
  #35 = NameAndType        #19:#20        // "<init>":()V
  #36 = Utf8               book_jvm/P8/Dispatch$Father
  #37 = Utf8               book_jvm/P8/Dispatch$Son
  #38 = Utf8               book_jvm/P8/Dispatch$_360
  #39 = NameAndType        #44:#45        // hardChoice:(Lbook_jvm/P8/Dispatch$_360;)V
  #40 = Utf8               book_jvm/P8/Dispatch$QQ
  #41 = NameAndType        #44:#46        // hardChoice:(Lbook_jvm/P8/Dispatch$QQ;)V
  #42 = Utf8               book_jvm/P8/Dispatch
  #43 = Utf8               java/lang/Object
  #44 = Utf8               hardChoice
  #45 = Utf8               (Lbook_jvm/P8/Dispatch$_360;)V
  #46 = Utf8               (Lbook_jvm/P8/Dispatch$QQ;)V
{
  public book_jvm.P8.Dispatch();
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
            0       5     0  this   Lbook_jvm/P8/Dispatch;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=3, args_size=1
         0: new           #2                  // class book_jvm/P8/Dispatch$Father
         3: dup
         4: invokespecial #3                  // Method book_jvm/P8/Dispatch$Father."<init>":()V
         7: astore_1
         8: new           #4                  // class book_jvm/P8/Dispatch$Son
        11: dup
        12: invokespecial #5                  // Method book_jvm/P8/Dispatch$Son."<init>":()V
        15: astore_2
        16: aload_1
        17: new           #6                  // class book_jvm/P8/Dispatch$_360
        20: dup
        21: invokespecial #7                  // Method book_jvm/P8/Dispatch$_360."<init>":()V
        24: invokevirtual #8                  // Method book_jvm/P8/Dispatch$Father.hardChoice:(Lbook_jvm/P8/Dispatch$_360;)V
        27: aload_2
        28: new           #9                  // class book_jvm/P8/Dispatch$QQ
        31: dup
        32: invokespecial #10                 // Method book_jvm/P8/Dispatch$QQ."<init>":()V
        35: invokevirtual #11                 // Method book_jvm/P8/Dispatch$Father.hardChoice:(Lbook_jvm/P8/Dispatch$QQ;)V
        38: return
      LineNumberTable:
        line 49: 0
        line 51: 8
        line 53: 16
        line 55: 27
        line 113: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  args   [Ljava/lang/String;
            8      31     1 father   Lbook_jvm/P8/Dispatch$Father;
           16      23     2   son   Lbook_jvm/P8/Dispatch$Father;
}
SourceFile: "Dispatch.java"
InnerClasses:
     public static #14= #4 of #12; //Son=class book_jvm/P8/Dispatch$Son of class book_jvm/P8/Dispatch
     public static #16= #2 of #12; //Father=class book_jvm/P8/Dispatch$Father of class book_jvm/P8/Dispatch
     static #17= #6 of #12; //_360=class book_jvm/P8/Dispatch$_360 of class book_jvm/P8/Dispatch
     static #18= #9 of #12; //QQ=class book_jvm/P8/Dispatch$QQ of class book_jvm/P8/Dispatch

E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\P8>



         */




    }
}
