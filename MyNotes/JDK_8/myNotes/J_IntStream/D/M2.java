package JDK_8.myNotes.J_IntStream.D;

import JDK_8.myNotes.J_IntStream.D.pojo.Data;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/5
 * \* Time: 16:14
 * \* Description:
 * \
 */
public class M2 {

    public static void main(String[] args) {

        IntStream i1 = IntStream.of(1,1,1,2,5,8,9,55,5,5,5,8);

        i1.distinct().forEach(System.out::println);

        System.out.println("-----------------------------------");

        int[] a1 = Data.supply();

        System.out.println(Arrays.toString(a1));

        System.out.println("-----------------------------------");

        int[] sort =  IntStream.of(a1).sorted().toArray();

        System.out.println(Arrays.toString(sort));



    }
}
