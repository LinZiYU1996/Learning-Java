package jvm.D1;

import java.util.Random;

public interface Customer {


    boolean isVIP();
}


class BusinessMen {

    public double get_Account(double orgin_price,Customer customer) {
        return orgin_price * 0.9d;
    }
}


class Bad_BusinessMen extends BusinessMen {

    @Override
    public double get_Account(double orgin_price, Customer customer) {

        if ( customer.isVIP()) {
            return orgin_price * price_disjuice();
        } else {
            return super.get_Account(orgin_price,customer);
        }

    }


    public static double price_disjuice() {

        return new Random()
                .nextDouble()
                + 0.9d;
    }
}


//Bad_BusinessMen 字节码:

//E:\learn-java\Learning-Java\output\production\Learning-Java\jvm\D1>javap -v Bad_BusinessMen
//        警告: 二进制文件Bad_BusinessMen包含jvm.D1.Bad_BusinessMen
//        Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/jvm/D1/Bad_BusinessMen.class
//Last modified 2020-3-18; size 705 bytes
//        MD5 checksum bd7f113efe377747e71b5eee187e7e6b
//        Compiled from "Customer.java"
//class jvm.D1.Bad_BusinessMen extends jvm.D1.BusinessMen
//        minor version: 0
//        major version: 52
//        flags: ACC_SUPER
//        Constant pool:
//        #1 = Methodref          #11.#30        // jvm/D1/BusinessMen."<init>":()V
//        #2 = InterfaceMethodref #31.#32        // jvm/D1/Customer.isVIP:()Z
//        #3 = Methodref          #10.#33        // jvm/D1/Bad_BusinessMen.price_disjuice:()D
//        #4 = Methodref          #11.#34        // jvm/D1/BusinessMen.get_Account:(DLjvm/D1/Customer;)D
//        #5 = Class              #35            // java/util/Random
//        #6 = Methodref          #5.#30         // java/util/Random."<init>":()V
//        #7 = Methodref          #5.#36         // java/util/Random.nextDouble:()D
//        #8 = Double             0.9d
//        #10 = Class              #37            // jvm/D1/Bad_BusinessMen
//        #11 = Class              #38            // jvm/D1/BusinessMen
//        #12 = Utf8               <init>
//  #13 = Utf8               ()V
//          #14 = Utf8               Code
//          #15 = Utf8               LineNumberTable
//          #16 = Utf8               LocalVariableTable
//          #17 = Utf8               this
//          #18 = Utf8               Ljvm/D1/Bad_BusinessMen;
//          #19 = Utf8               get_Account
//          #20 = Utf8               (DLjvm/D1/Customer;)D
//          #21 = Utf8               orgin_price
//          #22 = Utf8               D
//          #23 = Utf8               customer
//          #24 = Utf8               Ljvm/D1/Customer;
//          #25 = Utf8               StackMapTable
//          #26 = Utf8               price_disjuice
//          #27 = Utf8               ()D
//          #28 = Utf8               SourceFile
//          #29 = Utf8               Customer.java
//          #30 = NameAndType        #12:#13        // "<init>":()V
//          #31 = Class              #39            // jvm/D1/Customer
//          #32 = NameAndType        #40:#41        // isVIP:()Z
//          #33 = NameAndType        #26:#27        // price_disjuice:()D
//          #34 = NameAndType        #19:#20        // get_Account:(DLjvm/D1/Customer;)D
//          #35 = Utf8               java/util/Random
//          #36 = NameAndType        #42:#27        // nextDouble:()D
//          #37 = Utf8               jvm/D1/Bad_BusinessMen
//          #38 = Utf8               jvm/D1/BusinessMen
//          #39 = Utf8               jvm/D1/Customer
//          #40 = Utf8               isVIP
//          #41 = Utf8               ()Z
//          #42 = Utf8               nextDouble
//          {
//          jvm.D1.Bad_BusinessMen();
//          descriptor: ()V
//          flags:
//          Code:
//          stack=1, locals=1, args_size=1
//          0: aload_0
//          1: invokespecial #1                  // Method jvm/D1/BusinessMen."<init>":()V
//          4: return
//          LineNumberTable:
//          line 20: 0
//          LocalVariableTable:
//          Start  Length  Slot  Name   Signature
//          0       5     0  this   Ljvm/D1/Bad_BusinessMen;
//
//public double get_Account(double, jvm.D1.Customer);
//        descriptor: (DLjvm/D1/Customer;)D
//        flags: ACC_PUBLIC
//        Code:
//        stack=4, locals=4, args_size=3
//        0: aload_3
//        1: invokeinterface #2,  1            // InterfaceMethod jvm/D1/Customer.isVIP:()Z
//        6: ifeq          15
//        9: dload_1
//        10: invokestatic  #3                  // Method price_disjuice:()D
//        13: dmul
//        14: dreturn
//        15: aload_0
//        16: dload_1
//        17: aload_3
//        18: invokespecial #4                  // Method jvm/D1/BusinessMen.get_Account:(DLjvm/D1/Customer;)D
//        21: dreturn
//        LineNumberTable:
//        line 25: 0
//        line 26: 9
//        line 28: 15
//        LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//        0      22     0  this   Ljvm/D1/Bad_BusinessMen;
//        0      22     1 orgin_price   D
//        0      22     3 customer   Ljvm/D1/Customer;
//        StackMapTable: number_of_entries = 1
//        frame_type = 15 /* same */
//
//public static double price_disjuice();
//        descriptor: ()D
//        flags: ACC_PUBLIC, ACC_STATIC
//        Code:
//        stack=4, locals=0, args_size=0
//        0: new           #5                  // class java/util/Random
//        3: dup
//        4: invokespecial #6                  // Method java/util/Random."<init>":()V
//        7: invokevirtual #7                  // Method java/util/Random.nextDouble:()D
//        10: ldc2_w        #8                  // double 0.9d
//        13: dadd
//        14: dreturn
//        LineNumberTable:
//        line 36: 0
//        line 37: 7
//        line 36: 14
//        }
//        SourceFile: "Customer.java"