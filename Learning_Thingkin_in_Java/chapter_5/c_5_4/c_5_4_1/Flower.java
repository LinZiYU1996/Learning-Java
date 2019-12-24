package chapter_5.c_5_4.c_5_4_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:35 2019/12/24
 */
public class Flower {

    private int petalCount = 0;

    private String s = new String("null");

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount= "
                + petalCount);
    }


    Flower(String ss) {
        System.out.println(
                "Constructor w/ String arg only, s=" + ss);
        s = ss;
    }


    Flower(String s, int petals) {
        this(petals);


//        细节问题
//! this(s); // Can't call two!


        this.s = s; // Another use of "this"
        System.out.println("String & int args");
    }


    Flower() {
        this("hi", 47);
        System.out.println(
                "default constructor (no args)");
    }


    void print() {


//        细节问题
//! this(11); // Not inside non-constructor!


        System.out.println(
                "petalCount = " + petalCount + " s = "+ s);
    }

//    其中，构建器Flower(String s,int petals)向我们揭示出这样一个问题：尽管可用this 调用一个构建器，
//    但不可调用两个。除此以外，构建器调用必须是我们做的第一件事情，否则会收到编译程序的报错信息。
//    这个例子也向大家展示了this 的另一项用途。由于自变量s 的名字以及成员数据s 的名字是相同的，所以会
//    出现混淆。为解决这个问题，可用 this.s来引用成员数据。经常都会在 Java 代码里看到这种形式的应用，
//    本书的大量地方也采用了这种做法。
//    在print()中，我们发现编译器不让我们从除了一个构建器之外的其他任何方法内部调用一个构建器。
    public static void main(String[] args) {
        Flower x = new Flower();
        x.print();
    }

}
