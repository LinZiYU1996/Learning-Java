package chapter_10.c_10_7.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:28 2020/1/1
 */
public class Outter_1 {


    private void f(){
        System.out.println("Outter f");
    }

    class A{

        private void  g(){
            System.out.println("A g");
        }

        public class  B{

            void h(){

                g();

                f();

            }

        }

    }

    public static void main(String[] args) {
        Outter_1 outter_1 = new Outter_1();

        Outter_1.A a = outter_1.new A();

        Outter_1.A.B b = a.new B();

        b.h();
    }

}
