package JDK_8.myNotes.J_IntStream.D;

import JDK_8.myNotes.J_IntStream.D.pojo.Data;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/5
 * \* Time: 17:11
 * \* Description:
 * \
 */
public class M3 {

    public static void main(String[] args) {

        int[] d1 = Data.supply();

        IntStream i1 = IntStream.of(d1);

        Stream<Integer> integerStream = i1.boxed();

        integerStream.sorted(Integer::compareTo).forEach(System.out::println);



    }
}
