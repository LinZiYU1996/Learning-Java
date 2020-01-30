package JDK_8.Java_8_Function_Programming.chapter_3.A3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 22:25
 * \* Description:
 * \
 */
public class M2 {

    public static void main(String[] args) {


        Map<Integer, List<Integer>> map = Stream.of(1, 3, 3, 2).collect(Collectors.groupingBy(Function.identity()));
        System.out.println(map);

        Map<Integer, Integer> map1 = Stream.of(1, 3, 3, 2).collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(x -> x)));
        System.out.println(map1);

        HashMap<Integer, List<Integer>> hashMap = Stream.of(1, 3, 3, 2).collect(Collectors.groupingBy(Function.identity(),
                HashMap::new, Collectors.mapping(x -> x + 1, Collectors.toList())));
        System.out.println(hashMap);



    }
}
