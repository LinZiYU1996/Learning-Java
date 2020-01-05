package chapter_14.c_14_2.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:49 2020/1/5
 */
public class Test_1 {

    public static void main(String[] args) {

        Man m1 = new Man();

        if (Man.class.isInstance(m1)) {
            System.out.println("+++++++++++");
        }

        if (People.class.isInstance(m1)) {
            System.out.println("+++++++++++");
        }

        if (Object.class.isInstance(m1)) {
            System.out.println("+++++++++++");
        }


        if (WoMan.class.isInstance(m1)) {
            System.out.println("+++++++++++");
        }
    }
}
