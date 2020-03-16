package book_jvm.A4;

import sun.misc.BASE64Encoder;

import java.util.logging.Logger;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/15
 * \* Time: 21:08
 * \* Description:
 * \
 */
public class BASE64Util {


    /*

    演示

    方法区 堆  栈 之间的联系


     */
    private static Logger logger = Logger.getLogger(BASE64Util.class.getName());

    public String encodeBase64(String message) {

        BASE64Encoder encoder = new BASE64Encoder();

        String res = encoder.encodeBuffer(message.getBytes());

        logger.info(message);

        logger.info(res);

        return res;

    }

    /*


E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\A4>javap -verbose BASE64Util
警告: 二进制文件BASE64Util包含book_jvm.A4.BASE64Util
Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/book_jvm/A4/BASE64Util.class
  Last modified 2020-3-15; size 1000 bytes
  MD5 checksum a4de2d4c885f0cc2f4ba2c585bd9a9bb
  Compiled from "BASE64Util.java"
public class book_jvm.A4.BASE64Util
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #11.#31        // java/lang/Object."<init>":()V
   #2 = Class              #32            // sun/misc/BASE64Encoder
   #3 = Methodref          #2.#31         // sun/misc/BASE64Encoder."<init>":()V
   #4 = Methodref          #33.#34        // java/lang/String.getBytes:()[B
   #5 = Methodref          #2.#35         // sun/misc/BASE64Encoder.encodeBuffer:([B)Ljava/lang/String;
   #6 = Fieldref           #8.#36         // book_jvm/A4/BASE64Util.logger:Ljava/util/logging/Logger;
   #7 = Methodref          #37.#38        // java/util/logging/Logger.info:(Ljava/lang/String;)V
   #8 = Class              #39            // book_jvm/A4/BASE64Util
   #9 = Methodref          #40.#41        // java/lang/Class.getName:()Ljava/lang/String;
  #10 = Methodref          #37.#42        // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #11 = Class              #43            // java/lang/Object
  #12 = Utf8               logger
  #13 = Utf8               Ljava/util/logging/Logger;
  #14 = Utf8               <init>
  #15 = Utf8               ()V
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Lbook_jvm/A4/BASE64Util;
  #21 = Utf8               encodeBase64
  #22 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #23 = Utf8               message
  #24 = Utf8               Ljava/lang/String;
  #25 = Utf8               encoder
  #26 = Utf8               Lsun/misc/BASE64Encoder;
  #27 = Utf8               res
  #28 = Utf8               <clinit>
  #29 = Utf8               SourceFile
  #30 = Utf8               BASE64Util.java
  #31 = NameAndType        #14:#15        // "<init>":()V
  #32 = Utf8               sun/misc/BASE64Encoder
  #33 = Class              #44            // java/lang/String
  #34 = NameAndType        #45:#46        // getBytes:()[B
  #35 = NameAndType        #47:#48        // encodeBuffer:([B)Ljava/lang/String;
  #36 = NameAndType        #12:#13        // logger:Ljava/util/logging/Logger;
  #37 = Class              #49            // java/util/logging/Logger
  #38 = NameAndType        #50:#51        // info:(Ljava/lang/String;)V
  #39 = Utf8               book_jvm/A4/BASE64Util
  #40 = Class              #52            // java/lang/Class
  #41 = NameAndType        #53:#54        // getName:()Ljava/lang/String;
  #42 = NameAndType        #55:#56        // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #43 = Utf8               java/lang/Object
  #44 = Utf8               java/lang/String
  #45 = Utf8               getBytes
  #46 = Utf8               ()[B
  #47 = Utf8               encodeBuffer
  #48 = Utf8               ([B)Ljava/lang/String;
  #49 = Utf8               java/util/logging/Logger
  #50 = Utf8               info
  #51 = Utf8               (Ljava/lang/String;)V
  #52 = Utf8               java/lang/Class
  #53 = Utf8               getName
  #54 = Utf8               ()Ljava/lang/String;
  #55 = Utf8               getLogger
  #56 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
{
  public book_jvm.A4.BASE64Util();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 15: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lbook_jvm/A4/BASE64Util;

  public java.lang.String encodeBase64(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/String;
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: new           #2                  // class sun/misc/BASE64Encoder
         3: dup
         4: invokespecial #3                  // Method sun/misc/BASE64Encoder."<init>":()V
         7: astore_2
         8: aload_2
         9: aload_1
        10: invokevirtual #4                  // Method java/lang/String.getBytes:()[B


        当Java程序调用 BASE64Encoder类的encodeBuffer方法时 实际上 字节码层面只运用下面
        这条 invokevirtual 指令

        invokevirtual  是调用Java方法的指令  该指令后面只跟了一个

         操作数 #5

         JVM是如何仅仅通过几个字节的指令就能够定位到目标方法  BASE64Encoder.encodeBuffer?

         事实上  在每个Java类文件中   都定义了一组数据结构用来表示类中出现的
         符号信息   这种数据结构就是 常量池

         常量池中每一项都能表示一个符号    每个符号都拥有一个在Class文件中唯一的索引号

         字节码指令就是通过常量池索引来定位方法或者字段的权限定名的

         常量池项间允许相互引用

         本代码中

         Class文件中定义的常量池 索引为 #5 的项为:

          #5 = Methodref          #2.#35         // sun/misc/BASE64Encoder.encodeBuffer:([B)Ljava/lang/String;

         #5 是 MethodType类型的常量池项 它表示一个Java方法

         方法的全限定名字由一个Class类型的常量池项 #2 和一个表示 NameAndType类型常量池项#32联合表示的

         #2:
         #2 = Class              #32            // sun/misc/BASE64Encoder

         #32:

         #32 = Utf8               sun/misc/BASE64Encoder

         #35 = NameAndType        #47:#48        // encodeBuffer:([B)Ljava/lang/String;

          #47 = Utf8               encodeBuffer
          #48 = Utf8               ([B)Ljava/lang/String;

         #5实际描述的是

         sun/misc/BASE64Encoder.encodeBuffer:([B)Ljava/lang/String;


        13: invokevirtual #5                  // Method sun/misc/BASE64Encoder.encodeBuffer:([B)Ljava/lang/String;
        16: astore_3
        17: getstatic     #6                  // Field logger:Ljava/util/logging/Logger;
        20: aload_1
        21: invokevirtual #7                  // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
        24: getstatic     #6                  // Field logger:Ljava/util/logging/Logger;
        27: aload_3
        28: invokevirtual #7                  // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
        31: aload_3
        32: areturn
      LineNumberTable:
        line 30: 0
        line 32: 8
        line 34: 17
        line 36: 24
        line 38: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lbook_jvm/A4/BASE64Util;
            0      33     1 message   Ljava/lang/String;
            8      25     2 encoder   Lsun/misc/BASE64Encoder;
           17      16     3   res   Ljava/lang/String;

  static {};
    descriptor: ()V
    flags: ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: ldc           #8                  // class book_jvm/A4/BASE64Util
         2: invokevirtual #9                  // Method java/lang/Class.getName:()Ljava/lang/String;
         5: invokestatic  #10                 // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         8: putstatic     #6                  // Field logger:Ljava/util/logging/Logger;
        11: return
      LineNumberTable:
        line 26: 0
}
SourceFile: "BASE64Util.java"

E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\A4>




     */
}
