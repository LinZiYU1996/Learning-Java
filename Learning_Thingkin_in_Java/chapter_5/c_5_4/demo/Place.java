package chapter_5.c_5_4.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:02 2019/12/25
 */
public class Place {

    String name;

//    public Place(String name) {
//        name = name;
//    }


    public Place(String n) {
        name = n;
    }

    public void f(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Place p1 = new Place("a");
        p1.f();
    }
}
