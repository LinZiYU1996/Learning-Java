package JDK_8.Java_8_Function_Programming.chapter_3.data.a2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 17:25
 * \* Description:
 * \
 */
public class Number_Data {

    static Random random = new Random(55);

    public static List<Integer> createData(){

        List<Integer> data = new ArrayList<>();

        for (int i = 0; i < 30; i++) {

            data.add(random.nextInt(450));
        }

        return data;
    }



}
