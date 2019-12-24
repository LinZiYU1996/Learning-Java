package chapter_5.c_5_7.c_5_7_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:55 2019/12/24
 */
public class Card {

//    在Card 中，Tag 对象的定义故意到处散布，以证明它们全都会在构建器进入或者发生其他任何事情之前得到
//    初始化。除此之外，t3 在构建器内部得到了重新初始化。

    Tag t1 = new Tag(1); // Before constructor


    Card() {
// Indicate we're in the constructor:
        System.out.println("Card()");
        t3 = new Tag(33); // Re-initialize t3
    }


    Tag t2 = new Tag(2); // After constructor


    void f() {
        System.out.println("f()");
    }


    Tag t3 = new Tag(3); // At end


}
