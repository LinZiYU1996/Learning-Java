package JDK_8.chapter_9.c_9_1.c_9_1_1;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 20:15
 * \* Description:
 * \
 */
public class Game {

    public static void main(String[] args) {

//        可以调整大小//的形状列表
        List<Resizable> resizableShapes =
                Arrays.asList(new Ellipse());
        Utils.paint(resizableShapes);

    }
}
