package JDK_8.Java_8_Function_Programming.chapter_3.A5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 13:35
 * \* Description:
 * \
 */
public class NumData {

    static Random random = new Random(55);

    public static List<Integer> create(){

        List<Integer> data = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            data.add(random.nextInt(232));
        }

        return data;
    }
}
