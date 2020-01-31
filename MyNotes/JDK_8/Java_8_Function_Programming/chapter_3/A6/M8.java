package JDK_8.Java_8_Function_Programming.chapter_3.A6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 20:02
 * \* Description:
 * \
 */
public class M8 {

    private static List<Integer> getEvenNumbers(int offset, int limit) {
        return Stream.iterate(0, i -> i + 1)
                .filter(i -> i % 2 == 0)
                .skip(offset)
                .limit(limit)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {

        System.out.println(getEvenNumbers(1,10));
        System.out.println(getEvenNumbers(2,10));

    }
}
