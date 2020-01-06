package chapter_15.c_15_8.c_15_8_1.d;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:28 2020/1/6
 */
public class FactoryConstraint {

    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Factory());
    }
}
