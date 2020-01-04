package chapter_14.c_14_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:43 2020/1/4
 */
abstract class Shape {

    void draw() { System.out.println(this + ".draw()"); }

//    强制继承者覆写该方法
//    如果某个对象出现在字符串表达式中（涉及"+"和字符串对象的表 达式），
//    toStringO方法就会被自动调用，以生成表示该对象的String。
//    每个派生类都要覆盖（从 Objec啡承来的）toString()方法，
//    这样draw()在不同情况下就打印出不同的消息（多态）。
    abstract public String toString();


}
