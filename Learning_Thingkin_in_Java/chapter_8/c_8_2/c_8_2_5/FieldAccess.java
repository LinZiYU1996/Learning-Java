package chapter_8.c_8_2.c_8_2_5;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:08 2019/12/27
 */
public class FieldAccess {

    public static void main(String[] args) {
        Super sup = new Sub(); // Upcast
        System.out.println("sup.field = " + sup.field +
                ", sup.getField() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " +
                sub.field + ", sub.getField() = " +
                sub.getField() +
                ", sub.getSuperField() = " +
                sub.getSuperField());
    }


}
