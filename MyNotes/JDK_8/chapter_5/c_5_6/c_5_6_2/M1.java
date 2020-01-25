package JDK_8.chapter_5.c_5_6.c_5_6_2;

import java.util.stream.IntStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 22:31
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        IntStream evenNumbers = IntStream.rangeClosed(1,100)
                .filter(n->n % 2 == 0);


//        从1到100有50个偶数
        System.out.println(evenNumbers.count());

    }
}
