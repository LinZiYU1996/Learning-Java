package JDK_8.myNotes.J_Stream.D_peek;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 12:56
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());


        System.out.println("--------------------");

        List<Integer> l1 = Create_Data.supply_Integers();

        l1.stream()
                .peek(integer -> System.out.println(integer))
        .limit(5)
        .forEach(System.out::println);


        System.out.println("--------------------");

        List<Integer> list = Arrays.asList(10,11,12);
        list.stream().peek(i->System.out.println(i*i)).collect(Collectors.toList());

    }
}
