package better_write.Java_performance_tuning.A3.Demo1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/26
 * \* Time: 11:06
 * \* Description:
 * \
 */
public class T1 {


    public static void main(String[] args) {

        String s1 = "hello world";
        String s2 = new String("hello world");
        String s3 = "hello world";
        String s4 = new String("hello world");
        String s5 = "hello " + "world";
        String s6 = "hel" + "lo world";
        String s7 = "hello";
        String s8 = s7 + " world";

        System.out.println("s1 == s2: " + String.valueOf(s1 == s2) );
        System.out.println("s1.equals(s2): " + String.valueOf(s1.equals(s2)));
        System.out.println("");
        System.out.println("s1 == s3: " + String.valueOf(s1 == s3));
        System.out.println("s1.equals(s3): " + String.valueOf(s1.equals(s3)));
        System.out.println("");
        System.out.println("s2 == s4: " + String.valueOf(s2 == s4));
        System.out.println("s2.equals(s4): " + String.valueOf(s2.equals(s4)));
        System.out.println("");
        System.out.println("s5 == s6: " + String.valueOf(s5 == s6));
        System.out.println("");
        System.out.println("s1 == s8: " + String.valueOf(s1 == s8));

        /*
        s1 == s2: false
        s1.equals(s2): true

        s1 == s3: true
        s1.equals(s3): true

        s2 == s4: false
        s2.equals(s4): true

        s5 == s6: true

        s1 == s8: false
         */


//s5 == s6 实际上和 s1 == s3 在 JVM 眼里是一样的情况，因为早在编译阶段，这种常量的简单运算就已经完成了。我们可以使用 javap 反编译一下 class 文件去查看 编译后的情况。

        //s1 == s8 的情况就略复杂，s8 是通过变量的运算而得，所以无法在编译时直接算出其值。而 Java 又不能重载运算符，所以我们在 JDK 的源码里也 找不到相关的线索。万事不绝反编译，我们再通过反编译看看实际上编译器对此是否有影响。

//通过反编译的结果可以发现，String 的变量运算实际上在编译后是由 StringBuilder 实现的，s8 = s7 + " world" 的代码等价于
//(new StringBuilder(s7)).append(" world").toString()。Stringbuilder 是可变的类，通过 append 方法 和 toString 将两个 String 对象聚合
//成一个新的 String 对象，所以到这里就不难理解为什么 s1 == s8 : false 了。




    }

}

//E:\learn-java\Learning-Java\output\production\Learning-Java\better_write\Java_performance_tuning\A3\Demo1>javap -v T1
//警告: 二进制文件T1包含better_write.Java_performance_tuning.A3.Demo1.T1
//Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/better_write/Java_performance_tuning/A3/Demo1/T1.class
//  Last modified 2020-3-26; size 2066 bytes
//  MD5 checksum 550b2611cdabb831feb0b76ef96978d1
//  Compiled from "T1.java"
//public class better_write.Java_performance_tuning.A3.Demo1.T1
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Methodref          #25.#53        // java/lang/Object."<init>":()V
//   #2 = String             #54            // hello world
//   #3 = Class              #55            // java/lang/String
//   #4 = Methodref          #3.#56         // java/lang/String."<init>":(Ljava/lang/String;)V
//   #5 = String             #57            // hello
//   #6 = Class              #58            // java/lang/StringBuilder
//   #7 = Methodref          #6.#53         // java/lang/StringBuilder."<init>":()V
//   #8 = Methodref          #6.#59         // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//   #9 = String             #60            //  world
//  #10 = Methodref          #6.#61         // java/lang/StringBuilder.toString:()Ljava/lang/String;
//  #11 = Fieldref           #62.#63        // java/lang/System.out:Ljava/io/PrintStream;
//  #12 = String             #64            // s1 == s2:
//  #13 = Methodref          #3.#65         // java/lang/String.valueOf:(Z)Ljava/lang/String;
//  #14 = Methodref          #66.#67        // java/io/PrintStream.println:(Ljava/lang/String;)V
//  #15 = String             #68            // s1.equals(s2):
//  #16 = Methodref          #3.#69         // java/lang/String.equals:(Ljava/lang/Object;)Z
//  #17 = String             #70            //
//  #18 = String             #71            // s1 == s3:
//  #19 = String             #72            // s1.equals(s3):
//  #20 = String             #73            // s2 == s4:
//  #21 = String             #74            // s2.equals(s4):
//  #22 = String             #75            // s5 == s6:
//  #23 = String             #76            // s1 == s8:
//  #24 = Class              #77            // better_write/Java_performance_tuning/A3/Demo1/T1
//  #25 = Class              #78            // java/lang/Object
//  #26 = Utf8               <init>
//  #27 = Utf8               ()V
//  #28 = Utf8               Code
//  #29 = Utf8               LineNumberTable
//  #30 = Utf8               LocalVariableTable
//  #31 = Utf8               this
//  #32 = Utf8               Lbetter_write/Java_performance_tuning/A3/Demo1/T1;
//  #33 = Utf8               main
//  #34 = Utf8               ([Ljava/lang/String;)V
//  #35 = Utf8               args
//  #36 = Utf8               [Ljava/lang/String;
//  #37 = Utf8               s1
//  #38 = Utf8               Ljava/lang/String;
//  #39 = Utf8               s2
//  #40 = Utf8               s3
//  #41 = Utf8               s4
//  #42 = Utf8               s5
//  #43 = Utf8               s6
//  #44 = Utf8               s7
//  #45 = Utf8               s8
//  #46 = Utf8               StackMapTable
//  #47 = Class              #36            // "[Ljava/lang/String;"
//  #48 = Class              #55            // java/lang/String
//  #49 = Class              #79            // java/io/PrintStream
//  #50 = Class              #58            // java/lang/StringBuilder
//  #51 = Utf8               SourceFile
//  #52 = Utf8               T1.java
//  #53 = NameAndType        #26:#27        // "<init>":()V
//  #54 = Utf8               hello world
//  #55 = Utf8               java/lang/String
//  #56 = NameAndType        #26:#80        // "<init>":(Ljava/lang/String;)V
//  #57 = Utf8               hello
//  #58 = Utf8               java/lang/StringBuilder
//  #59 = NameAndType        #81:#82        // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//  #60 = Utf8                world
//  #61 = NameAndType        #83:#84        // toString:()Ljava/lang/String;
//  #62 = Class              #85            // java/lang/System
//  #63 = NameAndType        #86:#87        // out:Ljava/io/PrintStream;
//  #64 = Utf8               s1 == s2:
//  #65 = NameAndType        #88:#89        // valueOf:(Z)Ljava/lang/String;
//  #66 = Class              #79            // java/io/PrintStream
//  #67 = NameAndType        #90:#80        // println:(Ljava/lang/String;)V
//  #68 = Utf8               s1.equals(s2):
//  #69 = NameAndType        #91:#92        // equals:(Ljava/lang/Object;)Z
//  #70 = Utf8
//  #71 = Utf8               s1 == s3:
//  #72 = Utf8               s1.equals(s3):
//  #73 = Utf8               s2 == s4:
//  #74 = Utf8               s2.equals(s4):
//  #75 = Utf8               s5 == s6:
//  #76 = Utf8               s1 == s8:
//  #77 = Utf8               better_write/Java_performance_tuning/A3/Demo1/T1
//  #78 = Utf8               java/lang/Object
//  #79 = Utf8               java/io/PrintStream
//  #80 = Utf8               (Ljava/lang/String;)V
//  #81 = Utf8               append
//  #82 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
//  #83 = Utf8               toString
//  #84 = Utf8               ()Ljava/lang/String;
//  #85 = Utf8               java/lang/System
//  #86 = Utf8               out
//  #87 = Utf8               Ljava/io/PrintStream;
//  #88 = Utf8               valueOf
//  #89 = Utf8               (Z)Ljava/lang/String;
//  #90 = Utf8               println
//  #91 = Utf8               equals
//  #92 = Utf8               (Ljava/lang/Object;)Z
//{
//  public better_write.Java_performance_tuning.A3.Demo1.T1();
//    descriptor: ()V
//    flags: ACC_PUBLIC
//    Code:
//      stack=1, locals=1, args_size=1
//         0: aload_0
//         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//         4: return
//      LineNumberTable:
//        line 11: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       5     0  this   Lbetter_write/Java_performance_tuning/A3/Demo1/T1;
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=4, locals=9, args_size=1
//         0: ldc           #2                  // String hello world
//         2: astore_1
//         3: new           #3                  // class java/lang/String
//         6: dup
//         7: ldc           #2                  // String hello world
//         9: invokespecial #4                  // Method java/lang/String."<init>":(Ljava/lang/String;)V
//        12: astore_2
//        13: ldc           #2                  // String hello world
//        15: astore_3
//        16: new           #3                  // class java/lang/String
//        19: dup
//        20: ldc           #2                  // String hello world
//        22: invokespecial #4                  // Method java/lang/String."<init>":(Ljava/lang/String;)V
//        25: astore        4
//        27: ldc           #2                  // String hello world
//        29: astore        5
//        31: ldc           #2                  // String hello world
//        33: astore        6
//        35: ldc           #5                  // String hello
//        37: astore        7
//        39: new           #6                  // class java/lang/StringBuilder
//        42: dup
//        43: invokespecial #7                  // Method java/lang/StringBuilder."<init>":()V
//        46: aload         7
//        48: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//        51: ldc           #9                  // String  world
//        53: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//        56: invokevirtual #10                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
//        59: astore        8
//        61: getstatic     #11                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        64: new           #6                  // class java/lang/StringBuilder
//        67: dup
//        68: invokespecial #7                  // Method java/lang/StringBuilder."<init>":()V
//        71: ldc           #12                 // String s1 == s2:
//        73: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//        76: aload_1
//        77: aload_2
//        78: if_acmpne     85
//        81: iconst_1
//        82: goto          86
//        85: iconst_0
//        86: invokestatic  #13                 // Method java/lang/String.valueOf:(Z)Ljava/lang/String;
//        89: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//        92: invokevirtual #10                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
//        95: invokevirtual #14                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        98: getstatic     #11                 // Field java/lang/System.out:Ljava/io/PrintStream;
//       101: new           #6                  // class java/lang/StringBuilder
//       104: dup
//       105: invokespecial #7                  // Method java/lang/StringBuilder."<init>":()V
//       108: ldc           #15                 // String s1.equals(s2):
//       110: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//       113: aload_1
//       114: aload_2
//       115: invokevirtual #16                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
//       118: invokestatic  #13                 // Method java/lang/String.valueOf:(Z)Ljava/lang/String;
//       121: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//       124: invokevirtual #10                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
//       127: invokevirtual #14                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//       130: getstatic     #11                 // Field java/lang/System.out:Ljava/io/PrintStream;
//       133: ldc           #17                 // String
//       135: invokevirtual #14                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//       138: getstatic     #11                 // Field java/lang/System.out:Ljava/io/PrintStream;
//       141: new           #6                  // class java/lang/StringBuilder
//       144: dup
//       145: invokespecial #7                  // Method java/lang/StringBuilder."<init>":()V
//       148: ldc           #18                 // String s1 == s3:
//       150: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//       153: aload_1
//       154: aload_3
//       155: if_acmpne     162
//       158: iconst_1
//       159: goto          163
//       162: iconst_0
//       163: invokestatic  #13                 // Method java/lang/String.valueOf:(Z)Ljava/lang/String;
//       166: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//       169: invokevirtual #10                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
//       172: invokevirtual #14                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//       175: getstatic     #11                 // Field java/lang/System.out:Ljava/io/PrintStream;
//       178: new           #6                  // class java/lang/StringBuilder
//       181: dup
//       182: invokespecial #7                  // Method java/lang/StringBuilder."<init>":()V
//       185: ldc           #19                 // String s1.equals(s3):
//       187: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//       190: aload_1
//       191: aload_3
//       192: invokevirtual #16                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
//       195: invokestatic  #13                 // Method java/lang/String.valueOf:(Z)Ljava/lang/String;
//       198: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//       201: invokevirtual #10                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
//       204: invokevirtual #14                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//       207: getstatic     #11                 // Field java/lang/System.out:Ljava/io/PrintStream;
//       210: ldc           #17                 // String
//       212: invokevirtual #14                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//       215: getstatic     #11                 // Field java/lang/System.out:Ljava/io/PrintStream;
//       218: new           #6                  // class java/lang/StringBuilder
//       221: dup
//       222: invokespecial #7                  // Method java/lang/StringBuilder."<init>":()V
//       225: ldc           #20                 // String s2 == s4:
//       227: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//       230: aload_2
//       231: aload         4
//       233: if_acmpne     240
//       236: iconst_1
//       237: goto          241
//       240: iconst_0
//       241: invokestatic  #13                 // Method java/lang/String.valueOf:(Z)Ljava/lang/String;
//       244: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//       247: invokevirtual #10                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
//       250: invokevirtual #14                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//       253: getstatic     #11                 // Field java/lang/System.out:Ljava/io/PrintStream;
//       256: new           #6                  // class java/lang/StringBuilder
//       259: dup
//       260: invokespecial #7                  // Method java/lang/StringBuilder."<init>":()V
//       263: ldc           #21                 // String s2.equals(s4):
//       265: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//       268: aload_2
//       269: aload         4
//       271: invokevirtual #16                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
//       274: invokestatic  #13                 // Method java/lang/String.valueOf:(Z)Ljava/lang/String;
//       277: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//       280: invokevirtual #10                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
//       283: invokevirtual #14                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//       286: getstatic     #11                 // Field java/lang/System.out:Ljava/io/PrintStream;
//       289: ldc           #17                 // String
//       291: invokevirtual #14                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//       294: getstatic     #11                 // Field java/lang/System.out:Ljava/io/PrintStream;
//       297: new           #6                  // class java/lang/StringBuilder
//       300: dup
//       301: invokespecial #7                  // Method java/lang/StringBuilder."<init>":()V
//       304: ldc           #22                 // String s5 == s6:
//       306: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//       309: aload         5
//       311: aload         6
//       313: if_acmpne     320
//       316: iconst_1
//       317: goto          321
//       320: iconst_0
//       321: invokestatic  #13                 // Method java/lang/String.valueOf:(Z)Ljava/lang/String;
//       324: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//       327: invokevirtual #10                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
//       330: invokevirtual #14                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//       333: getstatic     #11                 // Field java/lang/System.out:Ljava/io/PrintStream;
//       336: ldc           #17                 // String
//       338: invokevirtual #14                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//       341: getstatic     #11                 // Field java/lang/System.out:Ljava/io/PrintStream;
//       344: new           #6                  // class java/lang/StringBuilder
//       347: dup
//       348: invokespecial #7                  // Method java/lang/StringBuilder."<init>":()V
//       351: ldc           #23                 // String s1 == s8:
//       353: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//       356: aload_1
//       357: aload         8
//       359: if_acmpne     366
//       362: iconst_1
//       363: goto          367
//       366: iconst_0
//       367: invokestatic  #13                 // Method java/lang/String.valueOf:(Z)Ljava/lang/String;
//       370: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//       373: invokevirtual #10                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
//       376: invokevirtual #14                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//       379: return
//      LineNumberTable:
//        line 16: 0
//        line 17: 3
//        line 18: 13
//        line 19: 16
//        line 20: 27
//        line 21: 31
//        line 22: 35
//        line 23: 39
//        line 25: 61
//        line 26: 98
//        line 27: 130
//        line 28: 138
//        line 29: 175
//        line 30: 207
//        line 31: 215
//        line 32: 253
//        line 33: 286
//        line 34: 294
//        line 35: 333
//        line 36: 341
//        line 55: 379
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0     380     0  args   [Ljava/lang/String;
//            3     377     1    s1   Ljava/lang/String;
//           13     367     2    s2   Ljava/lang/String;
//           16     364     3    s3   Ljava/lang/String;
//           27     353     4    s4   Ljava/lang/String;
//           31     349     5    s5   Ljava/lang/String;
//           35     345     6    s6   Ljava/lang/String;
//           39     341     7    s7   Ljava/lang/String;
//           61     319     8    s8   Ljava/lang/String;
//      StackMapTable: number_of_entries = 10
//        frame_type = 255 /* full_frame */
//          offset_delta = 85
//          locals = [ class "[Ljava/lang/String;", class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String ]
//          stack = [ class java/io/PrintStream, class java/lang/StringBuilder ]
//        frame_type = 255 /* full_frame */
//          offset_delta = 0
//          locals = [ class "[Ljava/lang/String;", class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String ]
//          stack = [ class java/io/PrintStream, class java/lang/StringBuilder, int ]
//        frame_type = 255 /* full_frame */
//          offset_delta = 75
//          locals = [ class "[Ljava/lang/String;", class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String ]
//          stack = [ class java/io/PrintStream, class java/lang/StringBuilder ]
//        frame_type = 255 /* full_frame */
//          offset_delta = 0
//          locals = [ class "[Ljava/lang/String;", class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String ]
//          stack = [ class java/io/PrintStream, class java/lang/StringBuilder, int ]
//        frame_type = 255 /* full_frame */
//          offset_delta = 76
//          locals = [ class "[Ljava/lang/String;", class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String ]
//          stack = [ class java/io/PrintStream, class java/lang/StringBuilder ]
//        frame_type = 255 /* full_frame */
//          offset_delta = 0
//          locals = [ class "[Ljava/lang/String;", class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String ]
//          stack = [ class java/io/PrintStream, class java/lang/StringBuilder, int ]
//        frame_type = 255 /* full_frame */
//          offset_delta = 78
//          locals = [ class "[Ljava/lang/String;", class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String ]
//          stack = [ class java/io/PrintStream, class java/lang/StringBuilder ]
//        frame_type = 255 /* full_frame */
//          offset_delta = 0
//          locals = [ class "[Ljava/lang/String;", class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String ]
//          stack = [ class java/io/PrintStream, class java/lang/StringBuilder, int ]
//        frame_type = 255 /* full_frame */
//          offset_delta = 44
//          locals = [ class "[Ljava/lang/String;", class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String ]
//          stack = [ class java/io/PrintStream, class java/lang/StringBuilder ]
//        frame_type = 255 /* full_frame */
//          offset_delta = 0
//          locals = [ class "[Ljava/lang/String;", class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String ]
//          stack = [ class java/io/PrintStream, class java/lang/StringBuilder, int ]
//}
//SourceFile: "T1.java"



