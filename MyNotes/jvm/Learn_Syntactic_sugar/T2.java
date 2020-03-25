package jvm.Learn_Syntactic_sugar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/24
 * \* Time: 19:51
 * \* Description:
 * \
 */
public class T2<T extends Number> {

    T foo(T t) {
        return t;
    }

}
//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\Learn_Syntactic_sugar>javap -v T2
//警告: 二进制文件T2包含jvm.Learn_Syntactic_sugar.T2
//Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/jvm/Learn_Syntactic_sugar/T2.class
//  Last modified 2020-3-24; size 620 bytes
//  MD5 checksum 96037f55def6dcc87adbc407a1cdedf0
//  Compiled from "T2.java"
//public class jvm.Learn_Syntactic_sugar.T2<T extends java.lang.Number> extends java.lang.Object
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Methodref          #3.#23         // java/lang/Object."<init>":()V
//   #2 = Class              #24            // jvm/Learn_Syntactic_sugar/T2
//   #3 = Class              #25            // java/lang/Object
//   #4 = Utf8               <init>
//   #5 = Utf8               ()V
//   #6 = Utf8               Code
//   #7 = Utf8               LineNumberTable
//   #8 = Utf8               LocalVariableTable
//   #9 = Utf8               this
//  #10 = Utf8               Ljvm/Learn_Syntactic_sugar/T2;
//  #11 = Utf8               LocalVariableTypeTable
//  #12 = Utf8               Ljvm/Learn_Syntactic_sugar/T2<TT;>;
//  #13 = Utf8               foo
//  #14 = Utf8               (Ljava/lang/Number;)Ljava/lang/Number;
//  #15 = Utf8               t
//  #16 = Utf8               Ljava/lang/Number;
//  #17 = Utf8               TT;
//  #18 = Utf8               Signature
//  #19 = Utf8               (TT;)TT;
//  #20 = Utf8               <T:Ljava/lang/Number;>Ljava/lang/Object;
//  #21 = Utf8               SourceFile
//  #22 = Utf8               T2.java
//  #23 = NameAndType        #4:#5          // "<init>":()V
//  #24 = Utf8               jvm/Learn_Syntactic_sugar/T2
//  #25 = Utf8               java/lang/Object
//{
//  public jvm.Learn_Syntactic_sugar.T2();
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
//            0       5     0  this   Ljvm/Learn_Syntactic_sugar/T2;
//      LocalVariableTypeTable:
//        Start  Length  Slot  Name   Signature
//            0       5     0  this   Ljvm/Learn_Syntactic_sugar/T2<TT;>;
//

/*
定义了一个 T extends Number 的泛型参数。它所对应的字节码如下所示。可以看到，foo 方法的方法描述符所接收参数的类型以及返回类型都为 Number。方法描述符是 Java 虚拟机识别方法调用的目标方法的关键。
 */
//  T foo(T);
//    descriptor: (Ljava/lang/Number;)Ljava/lang/Number;
//    flags:
//    Code:
//      stack=1, locals=2, args_size=2
//         0: aload_1
//         1: areturn
//      LineNumberTable:
//        line 14: 0

/*
字节码中仍存在泛型参数的信息，如方法声明里的 T foo(T)
，以及方法签名（Signature）中的“(TT;)TT;”。
这类信息主要由 Java 编译器在编译他类时使用。
 */
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       2     0  this   Ljvm/Learn_Syntactic_sugar/T2;
//            0       2     1     t   Ljava/lang/Number;
//      LocalVariableTypeTable:
//        Start  Length  Slot  Name   Signature
//            0       2     0  this   Ljvm/Learn_Syntactic_sugar/T2<TT;>;
//            0       2     1     t   TT;
//    Signature: #19                          // (TT;)TT;
//}
//Signature: #20                          // <T:Ljava/lang/Number;>Ljava/lang/Object;
//SourceFile: "T2.java"
//
//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\Learn_Syntactic_sugar>

