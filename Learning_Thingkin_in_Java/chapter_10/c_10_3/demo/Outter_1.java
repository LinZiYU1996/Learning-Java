package chapter_10.c_10_3.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:46 2020/1/1
 */
public class Outter_1 {

    public class Inner{

        void f(){
            System.out.println("Inner Class");
        }

    }

    public static void main(String[] args) {

        Outter_1 outter_1 = new Outter_1();

        Outter_1.Inner inner = outter_1.new Inner();

        inner.f();

    }

}
