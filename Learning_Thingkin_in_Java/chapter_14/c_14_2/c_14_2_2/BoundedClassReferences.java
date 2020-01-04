package chapter_14.c_14_2.c_14_2_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:58 2020/1/4
 */
public class BoundedClassReferences {

    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
// Or anything else derived from Number.
    }


}
