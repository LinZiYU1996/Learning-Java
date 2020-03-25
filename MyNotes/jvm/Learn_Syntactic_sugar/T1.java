package jvm.Learn_Syntactic_sugar;

import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/24
 * \* Time: 19:41
 * \* Description:
 * \
 */
public class T1 {


    public int foo() {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(0);

        arrayList.add(1000);

        return arrayList.get(0);

    }

}

//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\Learn_Syntactic_sugar>javap -v T1
//警告: 二进制文件T1包含jvm.Learn_Syntactic_sugar.T1
//Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/jvm/Learn_Syntactic_sugar/T1.class
//  Last modified 2020-3-24; size 736 bytes
//  MD5 checksum fbbf3283bc5ea7214758a2238c868489
//  Compiled from "T1.java"
//public class jvm.Learn_Syntactic_sugar.T1
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Methodref          #10.#26        // java/lang/Object."<init>":()V
//   #2 = Class              #27            // java/util/ArrayList
//   #3 = Methodref          #2.#26         // java/util/ArrayList."<init>":()V
//   #4 = Methodref          #7.#28         // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
//   #5 = Methodref          #2.#29         // java/util/ArrayList.add:(Ljava/lang/Object;)Z
//   #6 = Methodref          #2.#30         // java/util/ArrayList.get:(I)Ljava/lang/Object;
//   #7 = Class              #31            // java/lang/Integer
//   #8 = Methodref          #7.#32         // java/lang/Integer.intValue:()I
//   #9 = Class              #33            // jvm/Learn_Syntactic_sugar/T1
//  #10 = Class              #34            // java/lang/Object
//  #11 = Utf8               <init>
//  #12 = Utf8               ()V
//  #13 = Utf8               Code
//  #14 = Utf8               LineNumberTable
//  #15 = Utf8               LocalVariableTable
//  #16 = Utf8               this
//  #17 = Utf8               Ljvm/Learn_Syntactic_sugar/T1;
//  #18 = Utf8               foo
//  #19 = Utf8               ()I
//  #20 = Utf8               arrayList
//  #21 = Utf8               Ljava/util/ArrayList;
//  #22 = Utf8               LocalVariableTypeTable
//  #23 = Utf8               Ljava/util/ArrayList<Ljava/lang/Integer;>;
//  #24 = Utf8               SourceFile
//  #25 = Utf8               T1.java
//  #26 = NameAndType        #11:#12        // "<init>":()V
//  #27 = Utf8               java/util/ArrayList
//  #28 = NameAndType        #35:#36        // valueOf:(I)Ljava/lang/Integer;
//  #29 = NameAndType        #37:#38        // add:(Ljava/lang/Object;)Z
//  #30 = NameAndType        #39:#40        // get:(I)Ljava/lang/Object;
//  #31 = Utf8               java/lang/Integer
//  #32 = NameAndType        #41:#19        // intValue:()I
//  #33 = Utf8               jvm/Learn_Syntactic_sugar/T1
//  #34 = Utf8               java/lang/Object
//  #35 = Utf8               valueOf
//  #36 = Utf8               (I)Ljava/lang/Integer;
//  #37 = Utf8               add
//  #38 = Utf8               (Ljava/lang/Object;)Z
//  #39 = Utf8               get
//  #40 = Utf8               (I)Ljava/lang/Object;
//  #41 = Utf8               intValue
//{
//  public jvm.Learn_Syntactic_sugar.T1();
//    descriptor: ()V
//    flags: ACC_PUBLIC
//    Code:
//      stack=1, locals=1, args_size=1
//         0: aload_0
//         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//         4: return
//      LineNumberTable:
//        line 13: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       5     0  this   Ljvm/Learn_Syntactic_sugar/T1;
//


//  public int foo();
//    descriptor: ()I
//    flags: ACC_PUBLIC
//    Code:
//      stack=2, locals=2, args_size=1
//         0: new           #2                  // class java/util/ArrayList
//         3: dup
//         4: invokespecial #3                  // Method java/util/ArrayList."<init>":()V
//         7: astore_1
//         8: aload_1
//         9: iconst_0

/*
Integer.valueOf方法
 */
//        10: invokestatic  #4                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;

/*
Object
泛型擦除

 */
//        13: invokevirtual #5                  // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
//        16: pop
//        17: aload_1
//        18: sipush        1000
//        21: invokestatic  #4                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
//        24: invokevirtual #5                  // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
//        27: pop
//        28: aload_1
//        29: iconst_0
//        30: invokevirtual #6                  // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
//        33: checkcast     #7                  // class java/lang/Integer


/*

intValue方法
这是一个实例方法，直接返回 Integer 对象所存储的 int 值。
 */
//        36: invokevirtual #8                  // Method java/lang/Integer.intValue:()I
//        39: ireturn



//      LineNumberTable:
//        line 18: 0
//        line 20: 8
//        line 22: 17
//        line 24: 28
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      40     0  this   Ljvm/Learn_Syntactic_sugar/T1;
//            8      32     1 arrayList   Ljava/util/ArrayList;
//      LocalVariableTypeTable:
//        Start  Length  Slot  Name   Signature
//            8      32     1 arrayList   Ljava/util/ArrayList<Ljava/lang/Integer;>;
//}
//SourceFile: "T1.java"



