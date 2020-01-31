package JDK_8.Java_8_Function_Programming.chapter_3.A5.a3;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 16:36
 * \* Description:
 * \
 */
public class M6 {


        public static void main(String[] args) {
            List<Integer> numbers1 = Arrays.asList(1, 2, 3);
            List<Integer> numbers2 = Arrays.asList(3, 4);
            // flatMap升维度
            List<int[]> pairs = numbers1.stream().flatMap(x -> numbers2.stream().map(y -> new int[] { x, y }))
                    .collect(Collectors.toList());
            for (int[] pair : pairs) {
                System.out.println(Arrays.toString(pair));
            }

            System.out.println("---------------");

            List<String> first= Arrays.asList("one", "two", "three", "four");
            List<String> second= Arrays.asList("A", "B", "C", "D");

            Stream.of(first,second).flatMap(Collection::stream).forEach(System.out::print);
        }




}
