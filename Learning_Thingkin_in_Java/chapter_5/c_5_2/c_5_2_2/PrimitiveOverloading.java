package chapter_5.c_5_2.c_5_2_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:15 2019/12/24
 */
public class PrimitiveOverloading {

//    基本数据类型能从一个“较小”的类型自动转变成一个“较大”的类型。涉及过载问题时，这会稍微造成
//    一些混乱。下面这个例子揭示了将基本数据类型传递给过载的方法时发生的情况：

    static void prt(String s) {
        System.out.println(s);
    }
    void f1(char x) { prt("f1(char)"); }
    void f1(byte x) { prt("f1(byte)"); }
    void f1(short x) { prt("f1(short)"); }
    void f1(int x) { prt("f1(int)"); }
    void f1(long x) { prt("f1(long)"); }
    void f1(float x) { prt("f1(float)"); }
    void f1(double x) { prt("f1(double)"); }
    void f2(byte x) { prt("f2(byte)"); }
    void f2(short x) { prt("f2(short)"); }
    void f2(int x) { prt("f2(int)"); }
    void f2(long x) { prt("f2(long)"); }
    void f2(float x) { prt("f2(float)"); }
    void f2(double x) { prt("f2(double)"); }

    void f3(short x) { prt("f3(short)"); }
    void f3(int x) { prt("f3(int)"); }
    void f3(long x) { prt("f3(long)"); }
    void f3(float x) { prt("f3(float)"); }
    void f3(double x) { prt("f3(double)"); }
    void f4(int x) { prt("f4(int)"); }
    void f4(long x) { prt("f4(long)"); }
    void f4(float x) { prt("f4(float)"); }
    void f4(double x) { prt("f4(double)"); }
    void f5(long x) { prt("f5(long)"); }
    void f5(float x) { prt("f5(float)"); }
    void f5(double x) { prt("f5(double)"); }
    void f6(float x) { prt("f6(float)"); }
    void f6(double x) { prt("f6(double)"); }
    void f7(double x) { prt("f7(double)"); }
    void testConstVal() {
        prt("Testing with 5");
        f1(5);f2(5);f3(5);f4(5);f5(5);f6(5);f7(5);
    }
    void testChar() {
        char x = 'x';
        prt("char argument:");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
    void testByte() {
        byte x = 0;
        prt("byte argument:");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
    void testShort() {
        short x = 0;
        prt("short argument:");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
    void testInt() {
        int x = 0;
        prt("int argument:");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
    void testLong() {
        long x = 0;
        prt("long argument:");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
    void testFloat() {
        float x = 0;
        prt("float argument:");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }


    void testDouble() {
        double x = 0;
        prt("double argument:");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
//
//    若观察这个程序的输出，就会发现常数值5 被当作一个 int值处理。所以假若可以使用一个过载的方法，就
//    能获取它使用的int值。在其他所有情况下，若我们的数据类型“小于”方法中使用的自变量，就会对那种
//    数据类型进行“转型”处理。char 获得的效果稍有些不同，这是由于假期它没有发现一个准确的char 匹
//    配，就会转型为int。
    public static void main(String[] args) {
        PrimitiveOverloading p =
                new PrimitiveOverloading();
        p.testConstVal();
        p.testChar();
        p.testByte();
        p.testShort();
        p.testInt();
        p.testLong();
        p.testFloat();
        p.testDouble();
    }

}
