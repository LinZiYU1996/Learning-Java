package chapter_8.c_8_2.c_8_2_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:52 2019/12/27
 */
public class Shapes {

    private static RandomShapeGenerator gen =
            new RandomShapeGenerator();


    public static void main(String[] args) {

        Shape[] s = new Shape[9];

// Fill up the array with shapes:

        for(int i = 0; i < s.length; i++)
            s[i] = gen.next();

// Make polymorphic method calls:


        for(Shape shp : s)
            shp.draw();
    }


}
