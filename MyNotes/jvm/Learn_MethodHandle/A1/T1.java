package jvm.Learn_MethodHandle.A1;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/23
 * \* Time: 14:31
 * \* Description:
 * \
 */
public class T1 {

    static class classA
    {
        public void println(String s)
        {
            System.out.println(s);
        }
    }
    private static MethodHandle getPrintMH(Object reciever) throws Throwable
    {
        MethodType mt= MethodType.methodType(void.class,String.class);
        //方法的参数类型 返回值类型
        return MethodHandles.lookup().findVirtual(reciever.getClass(),"println",mt).bindTo(reciever);
        //找到Object中的该方法


    }

    public static void main(String[] args) throws Throwable{
        Object obj=System.currentTimeMillis()%2==0 ? System.out : new classA();//随机选定一个接收者
        getPrintMH(obj).invokeExact("test");

    }
}

//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\Learn_MethodHandle\A1>javap -v T1
//警告: 二进制文件T1包含jvm.Learn_MethodHandle.A1.T1
//Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/jvm/Learn_MethodHandle/A1/T1.class
//  Last modified 2020-3-23; size 1640 bytes
//  MD5 checksum d29101ceb84212ff27af434165397849
//  Compiled from "T1.java"
//public class jvm.Learn_MethodHandle.A1.T1
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Methodref          #20.#47        // java/lang/Object."<init>":()V
//   #2 = Fieldref           #48.#49        // java/lang/Void.TYPE:Ljava/lang/Class;
//   #3 = Class              #50            // java/lang/String
//   #4 = Methodref          #51.#52        // java/lang/invoke/MethodType.methodType:(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;
//   #5 = Methodref          #53.#54        // java/lang/invoke/MethodHandles.lookup:()Ljava/lang/invoke/MethodHandles$Lookup;
//   #6 = Methodref          #20.#55        // java/lang/Object.getClass:()Ljava/lang/Class;
//   #7 = String             #56            // println
//   #8 = Methodref          #57.#58        // java/lang/invoke/MethodHandles$Lookup.findVirtual:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
//   #9 = Methodref          #59.#60        // java/lang/invoke/MethodHandle.bindTo:(Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
//  #10 = Methodref          #61.#62        // java/lang/System.currentTimeMillis:()J
//  #11 = Long               2l
//  #13 = Fieldref           #61.#63        // java/lang/System.out:Ljava/io/PrintStream;
//  #14 = Class              #64            // jvm/Learn_MethodHandle/A1/T1$classA
//  #15 = Methodref          #14.#47        // jvm/Learn_MethodHandle/A1/T1$classA."<init>":()V
//  #16 = Methodref          #19.#65        // jvm/Learn_MethodHandle/A1/T1.getPrintMH:(Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
//  #17 = String             #66            // test
//  #18 = Methodref          #59.#67        // java/lang/invoke/MethodHandle.invokeExact:(Ljava/lang/String;)V
//  #19 = Class              #68            // jvm/Learn_MethodHandle/A1/T1
//  #20 = Class              #69            // java/lang/Object
//  #21 = Utf8               classA
//  #22 = Utf8               InnerClasses
//  #23 = Utf8               <init>
//  #24 = Utf8               ()V
//  #25 = Utf8               Code
//  #26 = Utf8               LineNumberTable
//  #27 = Utf8               LocalVariableTable
//  #28 = Utf8               this
//  #29 = Utf8               Ljvm/Learn_MethodHandle/A1/T1;
//  #30 = Utf8               getPrintMH
//  #31 = Utf8               (Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
//  #32 = Utf8               reciever
//  #33 = Utf8               Ljava/lang/Object;
//  #34 = Utf8               mt
//  #35 = Utf8               Ljava/lang/invoke/MethodType;
//  #36 = Utf8               Exceptions
//  #37 = Class              #70            // java/lang/Throwable
//  #38 = Utf8               main
//  #39 = Utf8               ([Ljava/lang/String;)V
//  #40 = Utf8               args
//  #41 = Utf8               [Ljava/lang/String;
//  #42 = Utf8               obj
//  #43 = Utf8               StackMapTable
//  #44 = Class              #69            // java/lang/Object
//  #45 = Utf8               SourceFile
//  #46 = Utf8               T1.java
//  #47 = NameAndType        #23:#24        // "<init>":()V
//  #48 = Class              #71            // java/lang/Void
//  #49 = NameAndType        #72:#73        // TYPE:Ljava/lang/Class;
//  #50 = Utf8               java/lang/String
//  #51 = Class              #74            // java/lang/invoke/MethodType
//  #52 = NameAndType        #75:#76        // methodType:(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;
//  #53 = Class              #77            // java/lang/invoke/MethodHandles
//  #54 = NameAndType        #78:#80        // lookup:()Ljava/lang/invoke/MethodHandles$Lookup;
//  #55 = NameAndType        #81:#82        // getClass:()Ljava/lang/Class;
//  #56 = Utf8               println
//  #57 = Class              #83            // java/lang/invoke/MethodHandles$Lookup
//  #58 = NameAndType        #84:#85        // findVirtual:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
//  #59 = Class              #86            // java/lang/invoke/MethodHandle
//  #60 = NameAndType        #87:#31        // bindTo:(Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
//  #61 = Class              #88            // java/lang/System
//  #62 = NameAndType        #89:#90        // currentTimeMillis:()J
//  #63 = NameAndType        #91:#92        // out:Ljava/io/PrintStream;
//  #64 = Utf8               jvm/Learn_MethodHandle/A1/T1$classA
//  #65 = NameAndType        #30:#31        // getPrintMH:(Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
//  #66 = Utf8               test
//  #67 = NameAndType        #93:#94        // invokeExact:(Ljava/lang/String;)V
//  #68 = Utf8               jvm/Learn_MethodHandle/A1/T1
//  #69 = Utf8               java/lang/Object
//  #70 = Utf8               java/lang/Throwable
//  #71 = Utf8               java/lang/Void
//  #72 = Utf8               TYPE
//  #73 = Utf8               Ljava/lang/Class;
//  #74 = Utf8               java/lang/invoke/MethodType
//  #75 = Utf8               methodType
//  #76 = Utf8               (Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;
//  #77 = Utf8               java/lang/invoke/MethodHandles
//  #78 = Utf8               lookup
//  #79 = Utf8               Lookup
//  #80 = Utf8               ()Ljava/lang/invoke/MethodHandles$Lookup;
//  #81 = Utf8               getClass
//  #82 = Utf8               ()Ljava/lang/Class;
//  #83 = Utf8               java/lang/invoke/MethodHandles$Lookup
//  #84 = Utf8               findVirtual
//  #85 = Utf8               (Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
//  #86 = Utf8               java/lang/invoke/MethodHandle
//  #87 = Utf8               bindTo
//  #88 = Utf8               java/lang/System
//  #89 = Utf8               currentTimeMillis
//  #90 = Utf8               ()J
//  #91 = Utf8               out
//  #92 = Utf8               Ljava/io/PrintStream;
//  #93 = Utf8               invokeExact
//  #94 = Utf8               (Ljava/lang/String;)V
//{
//  public jvm.Learn_MethodHandle.A1.T1();
//    descriptor: ()V
//    flags: ACC_PUBLIC
//    Code:
//      stack=1, locals=1, args_size=1
//         0: aload_0
//         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//         4: return
//      LineNumberTable:
//        line 15: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       5     0  this   Ljvm/Learn_MethodHandle/A1/T1;
//
//  public static void main(java.lang.String[]) throws java.lang.Throwable;
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=4, locals=2, args_size=1
//         0: invokestatic  #10                 // Method java/lang/System.currentTimeMillis:()J
//         3: ldc2_w        #11                 // long 2l
//         6: lrem
//         7: lconst_0
//         8: lcmp
//         9: ifne          18
//        12: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        15: goto          25
//        18: new           #14                 // class jvm/Learn_MethodHandle/A1/T1$classA
//        21: dup
//        22: invokespecial #15                 // Method jvm/Learn_MethodHandle/A1/T1$classA."<init>":()V
//        25: astore_1
//        26: aload_1
//        27: invokestatic  #16                 // Method getPrintMH:(Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
//        30: ldc           #17                 // String test
//        32: invokevirtual #18                 // Method java/lang/invoke/MethodHandle.invokeExact:(Ljava/lang/String;)V
//        35: return
//      LineNumberTable:
//        line 35: 0
//        line 36: 26
//        line 38: 35
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      36     0  args   [Ljava/lang/String;
//           26      10     1   obj   Ljava/lang/Object;
//      StackMapTable: number_of_entries = 2
//        frame_type = 18 /* same */
//        frame_type = 70 /* same_locals_1_stack_item */
//          stack = [ class java/lang/Object ]
//    Exceptions:
//      throws java.lang.Throwable
//}
//SourceFile: "T1.java"
//InnerClasses:
//     static #21= #14 of #19; //classA=class jvm/Learn_MethodHandle/A1/T1$classA of class jvm/Learn_MethodHandle/A1/T1
//     public static final #79= #57 of #53; //Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
//
//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\Learn_MethodHandle\A1>

