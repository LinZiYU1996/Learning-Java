package chapter_14.c_14_2.c_14_2_2;

import chapter_14.c_14_2.c1.FancyToy;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:01 2020/1/4
 */
public class GenericToyTest {

    public static void main(String[] args) throws Exception {
        Class<FancyToy> ftClass = FancyToy.class;
// Produces exact type:
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
// This won’t compile:
// Class<Toy> up2 = ftClass.getSuperclass();
// Only produces Object:
        Object obj = up.newInstance();
    }

}
