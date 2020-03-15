package book_jvm.P8;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/15
 * \* Time: 11:29
 * \* Description:
 * \
 */
public class StaticResolution {


    public static void say() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {

        StaticResolution.say();

    }
}

/*

E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\P8>javap -verbose StaticResolution
警告: 二进制文件StaticResolution包含book_jvm.P8.StaticResolution
Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/book_jvm/P8/StaticResolution.class
  Last modified 2020-3-15; size 637 bytes
  MD5 checksum e984bcdf95f117ec675a2e51df38e170
  Compiled from "StaticResolution.java"
public class book_jvm.P8.StaticResolution
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #7.#22         // java/lang/Object."<init>":()V
   #2 = Fieldref           #23.#24        // java/lang/System.out:Ljava/io/PrintStream;
   #3 = String             #25            // hello world
   #4 = Methodref          #26.#27        // java/io/PrintStream.println:(Ljava/lang/String;)V
   #5 = Methodref          #6.#28         // book_jvm/P8/StaticResolution.say:()V
   #6 = Class              #29            // book_jvm/P8/StaticResolution
   #7 = Class              #30            // java/lang/Object
   #8 = Utf8               <init>
   #9 = Utf8               ()V
  #10 = Utf8               Code
  #11 = Utf8               LineNumberTable
  #12 = Utf8               LocalVariableTable
  #13 = Utf8               this
  #14 = Utf8               Lbook_jvm/P8/StaticResolution;
  #15 = Utf8               say
  #16 = Utf8               main
  #17 = Utf8               ([Ljava/lang/String;)V
  #18 = Utf8               args
  #19 = Utf8               [Ljava/lang/String;
  #20 = Utf8               SourceFile
  #21 = Utf8               StaticResolution.java
  #22 = NameAndType        #8:#9          // "<init>":()V
  #23 = Class              #31            // java/lang/System
  #24 = NameAndType        #32:#33        // out:Ljava/io/PrintStream;
  #25 = Utf8               hello world
  #26 = Class              #34            // java/io/PrintStream
  #27 = NameAndType        #35:#36        // println:(Ljava/lang/String;)V
  #28 = NameAndType        #15:#9         // say:()V
  #29 = Utf8               book_jvm/P8/StaticResolution
  #30 = Utf8               java/lang/Object
  #31 = Utf8               java/lang/System
  #32 = Utf8               out
  #33 = Utf8               Ljava/io/PrintStream;
  #34 = Utf8               java/io/PrintStream
  #35 = Utf8               println
  #36 = Utf8               (Ljava/lang/String;)V
{
  public book_jvm.P8.StaticResolution();
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
            0       5     0  this   Lbook_jvm/P8/StaticResolution;

  public static void say();
    descriptor: ()V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #3                  // String hello world
         5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 15: 0
        line 16: 8

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=0, locals=1, args_size=1

      //  通过 invokestatic 命令来调用 say方法的


         0: invokestatic  #5                  // Method say:()V
         3: return
      LineNumberTable:
        line 20: 0
        line 22: 3
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  args   [Ljava/lang/String;
}
SourceFile: "StaticResolution.java"

E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\P8>



 */