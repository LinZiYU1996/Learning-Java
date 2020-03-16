package book_jvm.A4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/15
 * \* Time: 21:44
 * \* Description:
 * \
 */
public class ConstantPoolTestCase {

    static final int alalal = 2;

    static final boolean b2b1b1 = true;

    static final String c1c1c1 = "This is a ConstantPool Test Case.";

    public static void main(String[] args) {

        ConstantPoolTestCase cptc = new ConstantPoolTestCase();

        System.out.println(cptc.alalal);

        System.out.println(cptc.b2b1b1);

        System.out.println(cptc.c1c1c1);

    }

    /*


    E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\A4>javap -v ConstantPoolTestCase
警告: 二进制文件ConstantPoolTestCase包含book_jvm.A4.ConstantPoolTestCase
Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/book_jvm/A4/ConstantPoolTestCase.class
  Last modified 2020-3-15; size 835 bytes
  MD5 checksum 7d3ef480f4f9c46979d8083fa24f3df7
  Compiled from "ConstantPoolTestCase.java"
public class book_jvm.A4.ConstantPoolTestCase
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #9.#33         // java/lang/Object."<init>":()V
   #2 = Class              #34            // book_jvm/A4/ConstantPoolTestCase
   #3 = Methodref          #2.#33         // book_jvm/A4/ConstantPoolTestCase."<init>":()V
   #4 = Fieldref           #35.#36        // java/lang/System.out:Ljava/io/PrintStream;
   #5 = Methodref          #37.#38        // java/io/PrintStream.println:(I)V
   #6 = Methodref          #37.#39        // java/io/PrintStream.println:(Z)V
   #7 = String             #40            // This is a ConstantPool Test Case.
   #8 = Methodref          #37.#41        // java/io/PrintStream.println:(Ljava/lang/String;)V
   #9 = Class              #42            // java/lang/Object
  #10 = Utf8               alalal
  #11 = Utf8               I
  #12 = Utf8               ConstantValue
  #13 = Integer            2
  #14 = Utf8               b2b1b1
  #15 = Utf8               Z
  #16 = Integer            1
  #17 = Utf8               c1c1c1
  #18 = Utf8               Ljava/lang/String;
  #19 = Utf8               <init>
  #20 = Utf8               ()V
  #21 = Utf8               Code
  #22 = Utf8               LineNumberTable
  #23 = Utf8               LocalVariableTable
  #24 = Utf8               this
  #25 = Utf8               Lbook_jvm/A4/ConstantPoolTestCase;
  #26 = Utf8               main
  #27 = Utf8               ([Ljava/lang/String;)V
  #28 = Utf8               args
  #29 = Utf8               [Ljava/lang/String;
  #30 = Utf8               cptc
  #31 = Utf8               SourceFile
  #32 = Utf8               ConstantPoolTestCase.java
  #33 = NameAndType        #19:#20        // "<init>":()V
  #34 = Utf8               book_jvm/A4/ConstantPoolTestCase
  #35 = Class              #43            // java/lang/System
  #36 = NameAndType        #44:#45        // out:Ljava/io/PrintStream;
  #37 = Class              #46            // java/io/PrintStream
  #38 = NameAndType        #47:#48        // println:(I)V
  #39 = NameAndType        #47:#49        // println:(Z)V
  #40 = Utf8               This is a ConstantPool Test Case.
  #41 = NameAndType        #47:#50        // println:(Ljava/lang/String;)V
  #42 = Utf8               java/lang/Object
  #43 = Utf8               java/lang/System
  #44 = Utf8               out
  #45 = Utf8               Ljava/io/PrintStream;
  #46 = Utf8               java/io/PrintStream
  #47 = Utf8               println
  #48 = Utf8               (I)V
  #49 = Utf8               (Z)V
  #50 = Utf8               (Ljava/lang/String;)V
{
  static final int alalal;
    descriptor: I
    flags: ACC_STATIC, ACC_FINAL
    ConstantValue: int 2

  static final boolean b2b1b1;
    descriptor: Z
    flags: ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  static final java.lang.String c1c1c1;
    descriptor: Ljava/lang/String;
    flags: ACC_STATIC, ACC_FINAL
    ConstantValue: String This is a ConstantPool Test Case.

  public book_jvm.A4.ConstantPoolTestCase();
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
            0       5     0  this   Lbook_jvm/A4/ConstantPoolTestCase;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=1
       **  0: new           #2                  // class book_jvm/A4/ConstantPoolTestCase
         3: dup
         4: invokespecial #3                  // Method "<init>":()V
         7: astore_1
        ** 8: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
        11: aload_1
        12: pop
        13: iconst_2
       ** 14: invokevirtual #5                  // Method java/io/PrintStream.println:(I)V
        **17: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
        20: aload_1
        21: pop
        22: iconst_1
        **23: invokevirtual #6                  // Method java/io/PrintStream.println:(Z)V
        **26: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
        29: aload_1
        30: pop
        **31: ldc           #7                  // String This is a ConstantPool Test Case.
        **33: invokevirtual #8                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        36: return
      LineNumberTable:
        line 21: 0
        line 23: 8
        line 25: 17
        line 27: 26
        line 29: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  args   [Ljava/lang/String;
            8      29     1  cptc   Lbook_jvm/A4/ConstantPoolTestCase;
}
SourceFile: "ConstantPoolTestCase.java"

E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\A4>



     */
}
