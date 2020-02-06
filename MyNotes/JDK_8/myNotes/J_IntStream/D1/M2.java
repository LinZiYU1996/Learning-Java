package JDK_8.myNotes.J_IntStream.D1;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/5
 * \* Time: 13:09
 * \* Description:
 * \
 */
public class M2 {

    public static void main(String[] args) {

        IntStream intStream1 = IntStream.of(1,2,3,4,5,6,7,8,9);

        LongStream longStream1 = intStream1.asLongStream();

        longStream1.forEach(System.out::println);

        System.out.println("***********************************************");

//        DoubleStream doubleStream1 = intStream1.asDoubleStream();
//
//        doubleStream1.forEach(System.out::println);

        System.out.println("***********************************************");

        int[] d = IntStream.of(1,2,3,4,5,6,7,8,9).toArray();

        for (int i : d){
            System.out.println(i);
        }

    }
}
