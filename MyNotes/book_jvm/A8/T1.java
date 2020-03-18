package book_jvm.A8;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/17
 * \* Time: 14:52
 * \* Description:
 * \
 */
public class T1 {


    public static void main(String[] args) {

        T1 t1 = new T1();

        A a = t1.new A();

        A b = t1.new B();

        A c = t1.new C();

        a.print();

        b.print();

        c.print();

    }


    class A{

        public void print() {
            System.out.println("AAAAa");
        }

    }

    class  B extends A {
        public void print() {
            System.out.println("BBBBB");
        }
    }

    class C extends A {

        public void print() {
            System.out.println("CCCCC");
        }

    }


}


/*

main 函数关键 分析字节码

        49: astore        4
        51: aload_2
        52: invokevirtual #11                 // Method book_jvm/A8/T1$A.print:()V
        55: aload_3
        56: invokevirtual #11                 // Method book_jvm/A8/T1$A.print:()V
        59: aload         4
        61: invokevirtual #11                 // Method book_jvm/A8/T1$A.print:()V

 */

/*
    现在获取 三个 内部类 的 print方法的字节码

main 方法中 对 ABC方法 print方法调用 在编译器
实现上， 都统一使用了一样的 invokevirtual 指令

指令名一样 指令参数常量池索引 也一样 #11

仅仅是 aload_<n>取到的对象引用不一样

被调用方法都是A类方法print()

那么如何实现分别调用覆写的方法么?

秘密在于:

invokevirtual指令根据对象的 vtable在
运行时定位方法



    A :

     public void print();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #4                  // String AAAAa
         5: invokevirtual #5                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: return

B :
       public void print();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #4                  // String BBBBB
         5: invokevirtual #5                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: return


C:

 public void print();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #4                  // String CCCCC
         5: invokevirtual #5                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: return
 */


/*


E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\A8>javap -v T1
警告: 二进制文件T1包含book_jvm.A8.T1
Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/book_jvm/A8/T1.class
  Last modified 2020-3-17; size 776 bytes
  MD5 checksum da96481f270384ee6dbb2b418041b3ad
  Compiled from "T1.java"
public class book_jvm.A8.T1
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #12.#35        // java/lang/Object."<init>":()V
   #2 = Class              #36            // book_jvm/A8/T1
   #3 = Methodref          #2.#35         // book_jvm/A8/T1."<init>":()V
   #4 = Class              #37            // book_jvm/A8/T1$A
   #5 = Methodref          #12.#38        // java/lang/Object.getClass:()Ljava/lang/Class;
   #6 = Methodref          #4.#39         // book_jvm/A8/T1$A."<init>":(Lbook_jvm/A8/T1;)V
   #7 = Class              #40            // book_jvm/A8/T1$B
   #8 = Methodref          #7.#39         // book_jvm/A8/T1$B."<init>":(Lbook_jvm/A8/T1;)V
   #9 = Class              #41            // book_jvm/A8/T1$C
  #10 = Methodref          #9.#39         // book_jvm/A8/T1$C."<init>":(Lbook_jvm/A8/T1;)V
  #11 = Methodref          #4.#42         // book_jvm/A8/T1$A.print:()V
  #12 = Class              #43            // java/lang/Object
  #13 = Utf8               C
  #14 = Utf8               InnerClasses
  #15 = Utf8               B
  #16 = Utf8               A
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Utf8               Code
  #20 = Utf8               LineNumberTable
  #21 = Utf8               LocalVariableTable
  #22 = Utf8               this
  #23 = Utf8               Lbook_jvm/A8/T1;
  #24 = Utf8               main
  #25 = Utf8               ([Ljava/lang/String;)V
  #26 = Utf8               args
  #27 = Utf8               [Ljava/lang/String;
  #28 = Utf8               t1
  #29 = Utf8               a
  #30 = Utf8               Lbook_jvm/A8/T1$A;
  #31 = Utf8               b
  #32 = Utf8               c
  #33 = Utf8               SourceFile
  #34 = Utf8               T1.java
  #35 = NameAndType        #17:#18        // "<init>":()V
  #36 = Utf8               book_jvm/A8/T1
  #37 = Utf8               book_jvm/A8/T1$A
  #38 = NameAndType        #44:#45        // getClass:()Ljava/lang/Class;
  #39 = NameAndType        #17:#46        // "<init>":(Lbook_jvm/A8/T1;)V
  #40 = Utf8               book_jvm/A8/T1$B
  #41 = Utf8               book_jvm/A8/T1$C
  #42 = NameAndType        #47:#18        // print:()V
  #43 = Utf8               java/lang/Object
  #44 = Utf8               getClass
  #45 = Utf8               ()Ljava/lang/Class;
  #46 = Utf8               (Lbook_jvm/A8/T1;)V
  #47 = Utf8               print
{
  public book_jvm.A8.T1();
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
            0       5     0  this   Lbook_jvm/A8/T1;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=5, args_size=1
         0: new           #2                  // class book_jvm/A8/T1
         3: dup
         4: invokespecial #3                  // Method "<init>":()V
         7: astore_1
         8: new           #4                  // class book_jvm/A8/T1$A
        11: dup
        12: aload_1
        13: dup
        14: invokevirtual #5                  // Method java/lang/Object.getClass:()Ljava/lang/Class;
        17: pop
        18: invokespecial #6                  // Method book_jvm/A8/T1$A."<init>":(Lbook_jvm/A8/T1;)V
        21: astore_2
        22: new           #7                  // class book_jvm/A8/T1$B
        25: dup
        26: aload_1
        27: dup
        28: invokevirtual #5                  // Method java/lang/Object.getClass:()Ljava/lang/Class;
        31: pop
        32: invokespecial #8                  // Method book_jvm/A8/T1$B."<init>":(Lbook_jvm/A8/T1;)V
        35: astore_3
        36: new           #9                  // class book_jvm/A8/T1$C
        39: dup
        40: aload_1
        41: dup
        42: invokevirtual #5                  // Method java/lang/Object.getClass:()Ljava/lang/Class;
        45: pop
        46: invokespecial #10                 // Method book_jvm/A8/T1$C."<init>":(Lbook_jvm/A8/T1;)V
        49: astore        4
        51: aload_2
        52: invokevirtual #11                 // Method book_jvm/A8/T1$A.print:()V
        55: aload_3
        56: invokevirtual #11                 // Method book_jvm/A8/T1$A.print:()V
        59: aload         4
        61: invokevirtual #11                 // Method book_jvm/A8/T1$A.print:()V
        64: return
      LineNumberTable:
        line 16: 0
        line 18: 8
        line 20: 22
        line 22: 36
        line 24: 51
        line 26: 55
        line 28: 59
        line 30: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      65     0  args   [Ljava/lang/String;
            8      57     1    t1   Lbook_jvm/A8/T1;
           22      43     2     a   Lbook_jvm/A8/T1$A;
           36      29     3     b   Lbook_jvm/A8/T1$A;
           51      14     4     c   Lbook_jvm/A8/T1$A;
}
SourceFile: "T1.java"
InnerClasses:
     #13= #9 of #2; //C=class book_jvm/A8/T1$C of class book_jvm/A8/T1
     #15= #7 of #2; //B=class book_jvm/A8/T1$B of class book_jvm/A8/T1
     #16= #4 of #2; //A=class book_jvm/A8/T1$A of class book_jvm/A8/T1

E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\A8>


 */