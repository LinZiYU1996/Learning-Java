package chapter_6.demo.d2;


import chapter_6.demo.d1.A;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:24 2019/12/26
 */
public class Use_A {

    public static void main(String[] args) {

        A a = new A();

//        无法访问
//        a.f1();

        a.f2();
    }

}
