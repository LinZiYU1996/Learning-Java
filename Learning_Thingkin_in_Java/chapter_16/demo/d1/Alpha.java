package chapter_16.demo.d1;

import java.util.Arrays;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 15:40
 * \* Description:
 * \
 */
public class Alpha {

    private static Random random = new Random(50);

    static final String[] alphas = {
            "A","B","C","D","E","F","G","H","I","J","K"
    };

    public static String[] flavorSet(int n){

        if (n > alphas.length){
            throw new IllegalArgumentException("Too big");
        }

        String[] res = new String[n];

        boolean[] pick = new boolean[alphas.length];

        for (int i = 0; i < n; i++) {
            int t;
            do {
                t = random.nextInt(alphas.length);
            } while (pick[t]);

            res[i] = alphas[t];

            pick[t] = true;
        }
        return res;

    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.println(Arrays.toString(flavorSet(3)));

        }


    }

}
