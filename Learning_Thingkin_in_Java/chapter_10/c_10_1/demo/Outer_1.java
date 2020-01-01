package chapter_10.c_10_1.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:23 2020/1/1
 */
public class Outer_1 {

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

    public Inner_2 get_Inner_2(String s){

        return new Inner_2(s);
    }

    public Inner_1 get_Inner_1(){

        return new Inner_1();
    }


    public void get(String s){

        Inner_1 inner_1 = new Inner_1();

        Inner_2 inner_2 = new Inner_2(s);

        System.out.println(inner_2.getString());

    }


    public static void main(String[] args) {

        Outer_1 outer_1 = new Outer_1();

        outer_1.get("World");

        Outer_1 outer_1_2 = new Outer_1();

        Outer_1.Inner_1 inner_1 = outer_1_2.get_Inner_1();

        Outer_1.Inner_2 inner_2 = outer_1_2.get_Inner_2("Log");

    }

}
