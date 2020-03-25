package jvm.Learn_invokedynamic;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/24
 * \* Time: 9:42
 * \* Description:
 * \
 */
public class T2 {


    public static void main(String[] args) {

        Runnable r = () -> System.out.println("hello world");

        r.run();

    }
}

// main方法:

////  public static void main(java.lang.String[]);
////    descriptor: ([Ljava/lang/String;)V
////    flags: ACC_PUBLIC, ACC_STATIC
////    Code:
////      stack=1, locals=2, args_size=1
////         0: invokedynamic #2,  0              // InvokeDynamic #0:run:()Ljava/lang/Runnable;
////         5: astore_1
////         6: aload_1
////         7: invokeinterface #3,  1            // InterfaceMethod java/lang/Runnable.run:()V
////        12: return


////         0: invokedynamic #2,  0              // InvokeDynamic #0:run:()Ljava/lang/Runnable;

/*
可以看到 inDy 指向一个类型为 CONSTANT_InvokeDynamic_info 的常量项 #2，
另外 0 是预留参数，暂时没有作用。
 */

//   #2 = InvokeDynamic      #0:#30         // #0:run:()Ljava/lang/Runnable;


/*
#0 表示在 Bootstrap methods 表中的索引：

 */


//BootstrapMethods:
//  0: #27 invokestatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
//    Method arguments:
//      #28 ()V
//      #29 invokestatic jvm/Learn_invokedynamic/T2.lambda$main$0:()V
//      #28 ()V

/*
#30 则是一个 CONSTANT_NameAndType_info，表示方法名和方法类型（返回值和参数列表），这个会作为参数传递给 BSM。
 */

//  #30 = NameAndType        #42:#43        // run:()Ljava/lang/Runnable;

/*
再看回表中的第 0 项，#27 是一个 CONSTANT_MethodHandle_info，
实际上是个 MethodHandle（方法句柄）对象，这个句柄指向的就是 BSM 方法。
在这里就是:java.lang.invoke.LambdaMetafactory.metafactory(MethodHandles.Lookup,String,MethodType,MethodType,MethodHandle,MethodType)


//  0: #27 invokestatic java/lang/invoke/LambdaMetafactory.metafactory:
(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)
Ljava/lang/invoke/CallSite;

 */

//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\Learn_invokedynamic>javap -v T2
//警告: 二进制文件T2包含jvm.Learn_invokedynamic.T2
//Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/jvm/Learn_invokedynamic/T2.class
//  Last modified 2020-3-24; size 1188 bytes
//  MD5 checksum 08edb915a35237351944b10692a7230b
//  Compiled from "T2.java"
//public class jvm.Learn_invokedynamic.T2
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Methodref          #8.#25         // java/lang/Object."<init>":()V
//   #2 = InvokeDynamic      #0:#30         // #0:run:()Ljava/lang/Runnable;
//   #3 = InterfaceMethodref #31.#32        // java/lang/Runnable.run:()V
//   #4 = Fieldref           #33.#34        // java/lang/System.out:Ljava/io/PrintStream;
//   #5 = String             #35            // hello world
//   #6 = Methodref          #36.#37        // java/io/PrintStream.println:(Ljava/lang/String;)V
//   #7 = Class              #38            // jvm/Learn_invokedynamic/T2
//   #8 = Class              #39            // java/lang/Object
//   #9 = Utf8               <init>
//  #10 = Utf8               ()V
//  #11 = Utf8               Code
//  #12 = Utf8               LineNumberTable
//  #13 = Utf8               LocalVariableTable
//  #14 = Utf8               this
//  #15 = Utf8               Ljvm/Learn_invokedynamic/T2;
//  #16 = Utf8               main
//  #17 = Utf8               ([Ljava/lang/String;)V
//  #18 = Utf8               args
//  #19 = Utf8               [Ljava/lang/String;
//  #20 = Utf8               r
//  #21 = Utf8               Ljava/lang/Runnable;
//  #22 = Utf8               lambda$main$0
//  #23 = Utf8               SourceFile
//  #24 = Utf8               T2.java
//  #25 = NameAndType        #9:#10         // "<init>":()V
//  #26 = Utf8               BootstrapMethods
//  #27 = MethodHandle       #6:#40         // invokestatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
//  #28 = MethodType         #10            //  ()V
//  #29 = MethodHandle       #6:#41         // invokestatic jvm/Learn_invokedynamic/T2.lambda$main$0:()V
//  #30 = NameAndType        #42:#43        // run:()Ljava/lang/Runnable;
//  #31 = Class              #44            // java/lang/Runnable
//  #32 = NameAndType        #42:#10        // run:()V
//  #33 = Class              #45            // java/lang/System
//  #34 = NameAndType        #46:#47        // out:Ljava/io/PrintStream;
//  #35 = Utf8               hello world
//  #36 = Class              #48            // java/io/PrintStream
//  #37 = NameAndType        #49:#50        // println:(Ljava/lang/String;)V
//  #38 = Utf8               jvm/Learn_invokedynamic/T2
//  #39 = Utf8               java/lang/Object
//  #40 = Methodref          #51.#52        // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
//  #41 = Methodref          #7.#53         // jvm/Learn_invokedynamic/T2.lambda$main$0:()V
//  #42 = Utf8               run
//  #43 = Utf8               ()Ljava/lang/Runnable;
//  #44 = Utf8               java/lang/Runnable
//  #45 = Utf8               java/lang/System
//  #46 = Utf8               out
//  #47 = Utf8               Ljava/io/PrintStream;
//  #48 = Utf8               java/io/PrintStream
//  #49 = Utf8               println
//  #50 = Utf8               (Ljava/lang/String;)V
//  #51 = Class              #54            // java/lang/invoke/LambdaMetafactory
//  #52 = NameAndType        #55:#59        // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
//  #53 = NameAndType        #22:#10        // lambda$main$0:()V
//  #54 = Utf8               java/lang/invoke/LambdaMetafactory
//  #55 = Utf8               metafactory
//  #56 = Class              #61            // java/lang/invoke/MethodHandles$Lookup
//  #57 = Utf8               Lookup
//  #58 = Utf8               InnerClasses
//  #59 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
//  #60 = Class              #62            // java/lang/invoke/MethodHandles
//  #61 = Utf8               java/lang/invoke/MethodHandles$Lookup
//  #62 = Utf8               java/lang/invoke/MethodHandles
//{
//  public jvm.Learn_invokedynamic.T2();
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
//            0       5     0  this   Ljvm/Learn_invokedynamic/T2;
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=1, locals=2, args_size=1
//         0: invokedynamic #2,  0              // InvokeDynamic #0:run:()Ljava/lang/Runnable;
//         5: astore_1
//         6: aload_1
//         7: invokeinterface #3,  1            // InterfaceMethod java/lang/Runnable.run:()V
//        12: return
//      LineNumberTable:
//        line 16: 0
//        line 18: 6
//        line 20: 12
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      13     0  args   [Ljava/lang/String;
//            6       7     1     r   Ljava/lang/Runnable;
//}
//SourceFile: "T2.java"
//InnerClasses:
//     public static final #57= #56 of #60; //Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
//BootstrapMethods:
//  0: #27 invokestatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
//    Method arguments:
//      #28 ()V
//      #29 invokestatic jvm/Learn_invokedynamic/T2.lambda$main$0:()V
//      #28 ()V

