package chapter_10.c_10_1.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:14 2020/1/1
 */
public class Outer {

    class Inner_1{

        private int i = 1;

        public int value(){
            return i;
        }
    }

    class Inner_2{

        private String string;

        Inner_2(String s){
            string = s;
        }

        String getString(){
            return string;
        }
    }

    public void get(String s){

        Inner_1 inner_1 = new Inner_1();

        Inner_2 inner_2 = new Inner_2(s);

        System.out.println(inner_2.getString());

    }

    public static void main(String[] args) {

        Outer outer = new Outer();

        outer.get("Hello");

    }

}
