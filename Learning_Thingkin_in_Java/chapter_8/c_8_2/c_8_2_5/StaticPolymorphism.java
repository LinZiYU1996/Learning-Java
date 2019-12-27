package chapter_8.c_8_2.c_8_2_5;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:10 2019/12/27
 */
public class StaticPolymorphism {

    public static void main(String[] args) {
        StaticSuper sup = new StaticSub(); // Upcast
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }


}
