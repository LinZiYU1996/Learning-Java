package chapter_5.c_5_4.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:13 2019/12/25
 */
public class A {

    public void f(){
        System.out.println("Hello");
    }

    public void g(){
//        f();
        this.f();
    }

    public static void main(String[] args) {
        A a = new A();
        a.g();
    }

}
