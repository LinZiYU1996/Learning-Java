package jvm.D;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/18
 * \* Time: 20:55
 * \* Description:
 * \
 */
public class T4 {

    interface Car {
        void run();
    }

    static class Audi implements Car {
        @Override
        public void run() {
            System.out.println("奥迪");
        }
    }

    static class BMW implements Car {

        @Override
        public void run() {
            System.out.println("宝马");
        }
    }

    public static void main(String[] args) {

        Car audi = new Audi();

        Car bmw = new BMW();

        audi.run();

        bmw.run();

        //奥迪
        //宝马
    }
}


//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\D>javap -v T4
//        警告: 二进制文件T4包含jvm.D.T4
//        Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/jvm/D/T4.class
//Last modified 2020-3-18; size 602 bytes
//        MD5 checksum 1906f899c35ab821a670316e57c55ad8
//        Compiled from "T4.java"
//public class jvm.D.T4
//        minor version: 0
//        major version: 52
//        flags: ACC_PUBLIC, ACC_SUPER
//        Constant pool:
//        #1 = Methodref          #8.#30         // java/lang/Object."<init>":()V
//        #2 = Class              #31            // jvm/D/T4$Audi
//        #3 = Methodref          #2.#30         // jvm/D/T4$Audi."<init>":()V
//        #4 = Class              #32            // jvm/D/T4$BMW
//        #5 = Methodref          #4.#30         // jvm/D/T4$BMW."<init>":()V
//        #6 = InterfaceMethodref #12.#33        // jvm/D/T4$Car.run:()V
//        #7 = Class              #34            // jvm/D/T4
//        #8 = Class              #35            // java/lang/Object
//        #9 = Utf8               BMW
//        #10 = Utf8               InnerClasses
//        #11 = Utf8               Audi
//        #12 = Class              #36            // jvm/D/T4$Car
//        #13 = Utf8               Car
//        #14 = Utf8               <init>
//  #15 = Utf8               ()V
//          #16 = Utf8               Code
//          #17 = Utf8               LineNumberTable
//          #18 = Utf8               LocalVariableTable
//          #19 = Utf8               this
//          #20 = Utf8               Ljvm/D/T4;
//          #21 = Utf8               main
//          #22 = Utf8               ([Ljava/lang/String;)V
//          #23 = Utf8               args
//          #24 = Utf8               [Ljava/lang/String;
//          #25 = Utf8               audi
//          #26 = Utf8               Ljvm/D/T4$Car;
//          #27 = Utf8               bmw
//          #28 = Utf8               SourceFile
//          #29 = Utf8               T4.java
//          #30 = NameAndType        #14:#15        // "<init>":()V
//          #31 = Utf8               jvm/D/T4$Audi
//          #32 = Utf8               jvm/D/T4$BMW
//          #33 = NameAndType        #37:#15        // run:()V
//          #34 = Utf8               jvm/D/T4
//          #35 = Utf8               java/lang/Object
//          #36 = Utf8               jvm/D/T4$Car
//          #37 = Utf8               run
//          {
//public jvm.D.T4();
//        descriptor: ()V
//        flags: ACC_PUBLIC
//        Code:
//        stack=1, locals=1, args_size=1
//        0: aload_0
//        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        4: return
//        LineNumberTable:
//        line 11: 0
//        LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//        0       5     0  this   Ljvm/D/T4;
//
//public static void main(java.lang.String[]);
//        descriptor: ([Ljava/lang/String;)V
//        flags: ACC_PUBLIC, ACC_STATIC
//        Code:
//        stack=2, locals=3, args_size=1
//        0: new           #2                  // class jvm/D/T4$Audi
//        3: dup
//        4: invokespecial #3                  // Method jvm/D/T4$Audi."<init>":()V
//        7: astore_1
//        8: new           #4                  // class jvm/D/T4$BMW
//        11: dup
//        12: invokespecial #5                  // Method jvm/D/T4$BMW."<init>":()V
//        15: astore_2
//        16: aload_1
//        17: invokeinterface #6,  1            // InterfaceMethod jvm/D/T4$Car.run:()V
//        22: aload_2
//        23: invokeinterface #6,  1            // InterfaceMethod jvm/D/T4$Car.run:()V
//        28: return
//        LineNumberTable:
//        line 34: 0
//        line 36: 8
//        line 38: 16
//        line 40: 22
//        line 42: 28
//        LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//        0      29     0  args   [Ljava/lang/String;
//        8      21     1  audi   Ljvm/D/T4$Car;
//        16      13     2   bmw   Ljvm/D/T4$Car;
//        }
//        SourceFile: "T4.java"
//        InnerClasses:
//static #9= #4 of #7; //BMW=class jvm/D/T4$BMW of class jvm/D/T4
//static #11= #2 of #7; //Audi=class jvm/D/T4$Audi of class jvm/D/T4
//static #13= #12 of #7; //Car=class jvm/D/T4$Car of class jvm/D/T4
//
//        E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\D>