package JDK_8.myNotes.J_IntStream.D1;

import java.util.stream.IntStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/5
 * \* Time: 11:52
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        IntStream intStream1 = IntStream.of(1,2,3,4,5,6,7,8,9);

        intStream1.forEach(System.out::println);

        System.out.println("***********************************************");
        int[] d = {1,2,3,4,5,6,7,8,9};

        IntStream intStream2 = IntStream.of(d);

        intStream2.forEach(System.out::println);

        System.out.println("***********************************************");

        IntStream intStream3 = IntStream.iterate(1,x->x+3).limit(10);

        intStream3.forEach(System.out::println);

        System.out.println("***********************************************");

        IntStream intStream4 = IntStream.generate(()->100).limit(10);

        intStream4.forEach(System.out::println);


    }
}
