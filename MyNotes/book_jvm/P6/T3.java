package book_jvm.P6;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/14
 * \* Time: 14:44
 * \* Description:
 * \
 */
public class T3 {

    public int i = 0;

    //静态变量 变量a在准备阶段过后初始值是0而不是1，因为这时候还未执行java方法，
    // 把a赋值为1的putstatic指令是程序编译后，存放在类构造器<clinit>之中，所以赋值的动作在初始化阶段之后才进行
    public static int a = 1;

    //静态常量 有final和static的情况，编译时javac会为b生成ConstantValue属性，在准备阶段就会根据这个属性赋值
    public static final int b = 2;

    public static final Integer c = Integer.valueOf(3);//静态引用类型常量 无ConstantValue


}


/*

E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\P6>javap -verbose T3
警告: 二进制文件T3包含book_jvm.P6.T3
Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/book_jvm/P6/T3.class
  Last modified 2020-3-14; size 530 bytes
  MD5 checksum 36cd1ea4202de27350f259efc5f05eb5
  Compiled from "T3.java"
public class book_jvm.P6.T3
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #7.#26         // java/lang/Object."<init>":()V
   #2 = Fieldref           #6.#27         // book_jvm/P6/T3.i:I
   #3 = Fieldref           #6.#28         // book_jvm/P6/T3.a:I
   #4 = Methodref          #29.#30        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #5 = Fieldref           #6.#31         // book_jvm/P6/T3.c:Ljava/lang/Integer;
   #6 = Class              #32            // book_jvm/P6/T3
   #7 = Class              #33            // java/lang/Object
   #8 = Utf8               i
   #9 = Utf8               I
  #10 = Utf8               a
  #11 = Utf8               b
  #12 = Utf8               ConstantValue
  #13 = Integer            2
  #14 = Utf8               c
  #15 = Utf8               Ljava/lang/Integer;
  #16 = Utf8               <init>
  #17 = Utf8               ()V
  #18 = Utf8               Code
  #19 = Utf8               LineNumberTable
  #20 = Utf8               LocalVariableTable
  #21 = Utf8               this
  #22 = Utf8               Lbook_jvm/P6/T3;
  #23 = Utf8               <clinit>
  #24 = Utf8               SourceFile
  #25 = Utf8               T3.java
  #26 = NameAndType        #16:#17        // "<init>":()V
  #27 = NameAndType        #8:#9          // i:I
  #28 = NameAndType        #10:#9         // a:I
  #29 = Class              #34            // java/lang/Integer
  #30 = NameAndType        #35:#36        // valueOf:(I)Ljava/lang/Integer;
  #31 = NameAndType        #14:#15        // c:Ljava/lang/Integer;
  #32 = Utf8               book_jvm/P6/T3
  #33 = Utf8               java/lang/Object
  #34 = Utf8               java/lang/Integer
  #35 = Utf8               valueOf
  #36 = Utf8               (I)Ljava/lang/Integer;
{
  public int i;
    descriptor: I
    flags: ACC_PUBLIC

  public static int a;
    descriptor: I
    flags: ACC_PUBLIC, ACC_STATIC

  public static final int b;
    descriptor: I
    flags: ACC_PUBLIC, ACC_STATIC, ACC_FINAL

    #编译后查看jvm指令集 可以看到b变量有ConstantValue属性，
    并且对于变量b无赋值等指令，经javac编译成class文件的时候就已赋值


    ConstantValue: int 2

  public static final java.lang.Integer c;
    descriptor: Ljava/lang/Integer;
    flags: ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public book_jvm.P6.T3();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_0
         6: putfield      #2                  // Field i:I
         9: return
      LineNumberTable:
        line 11: 0
        line 13: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lbook_jvm/P6/T3;

  static {};
    descriptor: ()V
    flags: ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: iconst_1
         1: putstatic     #3                  // Field a:I
         4: iconst_3
         5: invokestatic  #4                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: putstatic     #5                  // Field c:Ljava/lang/Integer;
        11: return
      LineNumberTable:
        line 15: 0
        line 19: 4
}
SourceFile: "T3.java"

E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\P6>




 */