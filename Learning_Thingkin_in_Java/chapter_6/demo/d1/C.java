package chapter_6.demo.d1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:38 2019/12/26
 */
public class C {


    private String s1 = "S1";

    String s2 = "S2";

//    C() {
//
//        System.out.println("C构造器");
//
//    }


//如果将用private修饰类构造函数，则其它类无法进行访问
//    private C(){
//        System.out.println("C构造器");
//    }



    public static void main(String[] args) {

        C c = new C();

        System.out.println(c.s1);

        System.out.println(c.s2);

    }


}
