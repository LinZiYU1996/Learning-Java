package chapter_17.demo.d6;

import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/11
 * \* Time: 15:53
 * \* Description:
 * \
 */
public class Prediction {

    private static Random random = new Random(47);

    private boolean shadow = random.nextDouble() > 0.5;

    @Override
    public String toString() {

        if (shadow) {
            return "Six more weeks of Winter";
        }

        else {

            return "Early Spring";
        }
    }


}
