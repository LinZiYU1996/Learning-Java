package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Collectors_Examples;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:09
 * \* Description:
 * \
 */
public class ToSetExample {

//Collectors.toSet
//Collectors.toSet collects the element as set for the given data type.


    public static void main(String[] args) {

        Set<String> set = Stream.of("AA","AA","BB").collect(Collectors.toSet());
        set.forEach(s->System.out.println(s));

    }
}
