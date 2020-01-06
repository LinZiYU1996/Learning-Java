package chapter_15.c_15_7.c_15_7_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 23:24 2020/1/5
 */
public class ErasureAndInheritance {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        Object obj = d2.get();
        d2.set(obj); // Warning here!
    }


}
