package book_jvm.P6;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/14
 * \* Time: 11:55
 * \* Description:
 * \
 */
public class T2 {


    private final static String s = "123";

    public static void main(String[] args) {



    }



}


/*

E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\P6>javap -verbose T2
警告: 二进制文件T2包含book_jvm.P6.T2
Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/book_jvm/P6/T2.class
  Last modified 2020-3-14; size 439 bytes
  MD5 checksum ba427dfb4527fdf0bf2dee676ed16f82
  Compiled from "T2.java"
public class book_jvm.P6.T2
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #3.#21         // java/lang/Object."<init>":()V
   #2 = Class              #22            // book_jvm/P6/T2
   #3 = Class              #23            // java/lang/Object
   #4 = Utf8               s
   #5 = Utf8               Ljava/lang/String;
   #6 = Utf8               ConstantValue
   #7 = String             #24            // 123
   #8 = Utf8               <init>
   #9 = Utf8               ()V
  #10 = Utf8               Code
  #11 = Utf8               LineNumberTable
  #12 = Utf8               LocalVariableTable
  #13 = Utf8               this
  #14 = Utf8               Lbook_jvm/P6/T2;
  #15 = Utf8               main
  #16 = Utf8               ([Ljava/lang/String;)V
  #17 = Utf8               args
  #18 = Utf8               [Ljava/lang/String;
  #19 = Utf8               SourceFile
  #20 = Utf8               T2.java
  #21 = NameAndType        #8:#9          // "<init>":()V
  #22 = Utf8               book_jvm/P6/T2
  #23 = Utf8               java/lang/Object
  #24 = Utf8               123
{
  public book_jvm.P6.T2();
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
            0       5     0  this   Lbook_jvm/P6/T2;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  args   [Ljava/lang/String;
}
SourceFile: "T2.java"

E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\P6>
 */

/*

LineNumberTable

用于描述Java源码行号 与  字节码行号之间的对应关系

LocalVariableTable


用于描述 栈帧中局部变量表中变量 与 Java源码中定义的变量直接的关系



 */