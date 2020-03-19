package jvm.D;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/18
 * \* Time: 20:38
 * \* Description:
 * \
 */
public class T3 {


    interface Fruit{};

    static class Apple implements Fruit {

    }

    static class WaterMelom implements Fruit {

    }

    public void sell(Fruit fruit) {
        System.out.println("sell fruit");
    }

    public void sell(Apple apple) {
        System.out.println("sell apple");
    }

    public void sell(WaterMelom waterMelom) {
        System.out.println("sell watermelom");
    }


    public static void main(String[] args) {

        Fruit apple = new Apple();

        Fruit waterMelom = new WaterMelom();

        T3 t3 = new T3();

        t3.sell(apple);

        t3.sell(waterMelom);


        //sell fruit
        //sell fruit
    }



}



//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\D>javap -v T3
//        警告: 二进制文件T3包含jvm.D.T3
//        Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/jvm/D/T3.class
//Last modified 2020-3-18; size 1206 bytes
//        MD5 checksum 6e6af4d546f92356cb10b412beaf837c
//        Compiled from "T3.java"
//public class jvm.D.T3
//        minor version: 0
//        major version: 52
//        flags: ACC_PUBLIC, ACC_SUPER
//        Constant pool:
//        #1 = Methodref          #14.#44        // java/lang/Object."<init>":()V
//        #2 = Fieldref           #45.#46        // java/lang/System.out:Ljava/io/PrintStream;
//        #3 = String             #47            // sell fruit
//        #4 = Methodref          #48.#49        // java/io/PrintStream.println:(Ljava/lang/String;)V
//        #5 = String             #50            // sell apple
//        #6 = String             #51            // sell watermelom
//        #7 = Class              #52            // jvm/D/T3$Apple
//        #8 = Methodref          #7.#44         // jvm/D/T3$Apple."<init>":()V
//        #9 = Class              #53            // jvm/D/T3$WaterMelom
//        #10 = Methodref          #9.#44         // jvm/D/T3$WaterMelom."<init>":()V
//        #11 = Class              #54            // jvm/D/T3
//        #12 = Methodref          #11.#44        // jvm/D/T3."<init>":()V
//        #13 = Methodref          #11.#55        // jvm/D/T3.sell:(Ljvm/D/T3$Fruit;)V
//        #14 = Class              #56            // java/lang/Object
//        #15 = Utf8               WaterMelom
//        #16 = Utf8               InnerClasses
//        #17 = Utf8               Apple
//        #18 = Class              #57            // jvm/D/T3$Fruit
//        #19 = Utf8               Fruit
//        #20 = Utf8               <init>
//  #21 = Utf8               ()V
//          #22 = Utf8               Code
//          #23 = Utf8               LineNumberTable
//          #24 = Utf8               LocalVariableTable
//          #25 = Utf8               this
//          #26 = Utf8               Ljvm/D/T3;
//          #27 = Utf8               sell
//          #28 = Utf8               (Ljvm/D/T3$Fruit;)V
//          #29 = Utf8               fruit
//          #30 = Utf8               Ljvm/D/T3$Fruit;
//          #31 = Utf8               (Ljvm/D/T3$Apple;)V
//          #32 = Utf8               apple
//          #33 = Utf8               Ljvm/D/T3$Apple;
//          #34 = Utf8               (Ljvm/D/T3$WaterMelom;)V
//          #35 = Utf8               waterMelom
//          #36 = Utf8               Ljvm/D/T3$WaterMelom;
//          #37 = Utf8               main
//          #38 = Utf8               ([Ljava/lang/String;)V
//          #39 = Utf8               args
//          #40 = Utf8               [Ljava/lang/String;
//          #41 = Utf8               t3
//          #42 = Utf8               SourceFile
//          #43 = Utf8               T3.java
//          #44 = NameAndType        #20:#21        // "<init>":()V
//          #45 = Class              #58            // java/lang/System
//          #46 = NameAndType        #59:#60        // out:Ljava/io/PrintStream;
//          #47 = Utf8               sell fruit
//          #48 = Class              #61            // java/io/PrintStream
//          #49 = NameAndType        #62:#63        // println:(Ljava/lang/String;)V
//          #50 = Utf8               sell apple
//          #51 = Utf8               sell watermelom
//          #52 = Utf8               jvm/D/T3$Apple
//          #53 = Utf8               jvm/D/T3$WaterMelom
//          #54 = Utf8               jvm/D/T3
//          #55 = NameAndType        #27:#28        // sell:(Ljvm/D/T3$Fruit;)V
//          #56 = Utf8               java/lang/Object
//          #57 = Utf8               jvm/D/T3$Fruit
//          #58 = Utf8               java/lang/System
//          #59 = Utf8               out
//          #60 = Utf8               Ljava/io/PrintStream;
//          #61 = Utf8               java/io/PrintStream
//          #62 = Utf8               println
//          #63 = Utf8               (Ljava/lang/String;)V
//          {
//public jvm.D.T3();
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
//        0       5     0  this   Ljvm/D/T3;
//
//public void sell(jvm.D.T3$Fruit);
//        descriptor: (Ljvm/D/T3$Fruit;)V
//        flags: ACC_PUBLIC
//        Code:
//        stack=2, locals=2, args_size=2
//        0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        3: ldc           #3                  // String sell fruit
//        5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        8: return
//        LineNumberTable:
//        line 25: 0
//        line 26: 8
//        LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//        0       9     0  this   Ljvm/D/T3;
//        0       9     1 fruit   Ljvm/D/T3$Fruit;
//
//public void sell(jvm.D.T3$Apple);
//        descriptor: (Ljvm/D/T3$Apple;)V
//        flags: ACC_PUBLIC
//        Code:
//        stack=2, locals=2, args_size=2
//        0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        3: ldc           #5                  // String sell apple
//        5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        8: return
//        LineNumberTable:
//        line 29: 0
//        line 30: 8
//        LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//        0       9     0  this   Ljvm/D/T3;
//        0       9     1 apple   Ljvm/D/T3$Apple;
//
//public void sell(jvm.D.T3$WaterMelom);
//        descriptor: (Ljvm/D/T3$WaterMelom;)V
//        flags: ACC_PUBLIC
//        Code:
//        stack=2, locals=2, args_size=2
//        0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        3: ldc           #6                  // String sell watermelom
//        5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        8: return
//        LineNumberTable:
//        line 33: 0
//        line 34: 8
//        LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//        0       9     0  this   Ljvm/D/T3;
//        0       9     1 waterMelom   Ljvm/D/T3$WaterMelom;
//
//public static void main(java.lang.String[]);
//        descriptor: ([Ljava/lang/String;)V
//        flags: ACC_PUBLIC, ACC_STATIC
//        Code:
//        stack=2, locals=4, args_size=1
//        0: new           #7                  // class jvm/D/T3$Apple
//        3: dup
//        4: invokespecial #8                  // Method jvm/D/T3$Apple."<init>":()V
//        7: astore_1
//        8: new           #9                  // class jvm/D/T3$WaterMelom
//        11: dup
//        12: invokespecial #10                 // Method jvm/D/T3$WaterMelom."<init>":()V
//        15: astore_2
//        16: new           #11                 // class jvm/D/T3
//        19: dup
//        20: invokespecial #12                 // Method "<init>":()V
//        23: astore_3
//        24: aload_3
//        25: aload_1
//        26: invokevirtual #13                 // Method sell:(Ljvm/D/T3$Fruit;)V
//        29: aload_3
//        30: aload_2
//        31: invokevirtual #13                 // Method sell:(Ljvm/D/T3$Fruit;)V
//        34: return


//        LineNumberTable:
//        line 39: 0
//        line 41: 8
//        line 43: 16
//        line 45: 24
//        line 47: 29
//        line 52: 34
//        LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//        0      35     0  args   [Ljava/lang/String;
//        8      27     1 apple   Ljvm/D/T3$Fruit;
//        16      19     2 waterMelom   Ljvm/D/T3$Fruit;
//        24      11     3    t3   Ljvm/D/T3;
//        }
//        SourceFile: "T3.java"
//        InnerClasses:
//static #15= #9 of #11; //WaterMelom=class jvm/D/T3$WaterMelom of class jvm/D/T3
//static #17= #7 of #11; //Apple=class jvm/D/T3$Apple of class jvm/D/T3
//static #19= #18 of #11; //Fruit=class jvm/D/T3$Fruit of class jvm/D/T3
//
//        E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\D>
