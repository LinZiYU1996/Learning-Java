package chapter_14.c_14_1;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:45 2020/1/4
 */
public class Shapes {

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );
        for(Shape shape : shapeList)
            shape.draw();
    }


}
