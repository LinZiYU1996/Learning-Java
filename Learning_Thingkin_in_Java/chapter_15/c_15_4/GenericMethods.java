package chapter_15.c_15_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:56 2020/1/5
 */
public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }


}
