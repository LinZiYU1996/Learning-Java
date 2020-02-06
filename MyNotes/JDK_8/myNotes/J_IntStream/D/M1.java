package JDK_8.myNotes.J_IntStream.D;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/5
 * \* Time: 15:26
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {


//        IntStream.range(1,100).forEach(System.out::println);

        System.out.println("----------------------------------");

//        IntStream.rangeClosed(1,100).forEach(System.out::println);

        /***************************************/

         int[] a1 = IntStream.rangeClosed(1,10)
                .map(i -> i + i)
                .toArray();

        System.out.println(Arrays.toString(a1));

    }
}
