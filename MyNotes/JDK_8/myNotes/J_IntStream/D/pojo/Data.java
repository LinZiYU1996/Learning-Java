package JDK_8.myNotes.J_IntStream.D.pojo;

import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/5
 * \* Time: 16:15
 * \* Description:
 * \
 */
public class Data {

    static Random random = new Random();

    static int[] data = new int[20];

    public static int[] supply(){

        for (int i = 0; i <data.length ; i++) {
            data[i] = random.nextInt(100);
        }

        return data;

    }
}
