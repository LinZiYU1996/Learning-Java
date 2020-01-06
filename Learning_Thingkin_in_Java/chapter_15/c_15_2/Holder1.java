package chapter_15.c_15_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:02 2020/1/5
 */
public class Holder1 {

//    只能持有单个对象的类
    private Automobile a;
    public Holder1(Automobile a) { this.a = a; }
    Automobile get() { return a; }



}
