package chapter_15.c_15_2.demo.d4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:17 2020/1/7
 */
public class GenericMethods {

    public <T> void f(T x){
        System.out.println(x.getClass().getSimpleName());
        System.out.println("___________________________");
    }

    public static void main(String[] args) {
        GenericMethods genericMethods =
                new GenericMethods();

        genericMethods.f("s");

        genericMethods.f(1);

        genericMethods.f(1.0);

        genericMethods.f(false);

        genericMethods.f('c');

        genericMethods.f(genericMethods);
    }


}
