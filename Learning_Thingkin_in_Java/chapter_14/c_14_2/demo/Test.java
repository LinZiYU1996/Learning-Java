package chapter_14.c_14_2.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:45 2020/1/5
 */
public class Test {


    public static void main(String[] args) {

        Man m1 = new Man();

        if (m1 instanceof Man) {
            System.out.println("---");
        }

        if (m1 instanceof People) {
            System.out.println("---");
        }

        if (m1 instanceof Object) {
            System.out.println("---");
        }

//        报错
//        if (m1 instanceof WoMan) {
//            System.out.println("---");
//        }

    }
}
