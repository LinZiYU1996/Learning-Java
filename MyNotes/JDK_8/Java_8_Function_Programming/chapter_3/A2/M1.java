package JDK_8.Java_8_Function_Programming.chapter_3.A2;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 20:30
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<String> list = Stream.of("1","2","3")
                .collect(Collectors.toList());

        System.out.println(list);


        Set<Integer> set = Stream.of(1,2,3)
                .collect(Collectors.toSet());

        System.out.println(set);
    }
}
