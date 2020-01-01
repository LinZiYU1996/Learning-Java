package chapter_10.c_10_3.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:42 2020/1/1
 */
public class Outter {

    void f(){

        System.out.println("Outter.f()");

    }

    public class Inner{

        public Outter get_Out(){

            return Outter.this;

        }
    }

    public Inner get_Inner(){

        return new Inner();
    }

    public static void main(String[] args) {

        Outter outter = new Outter();

        Outter.Inner inner = outter.get_Inner();

        inner.get_Out().f();

    }

}
