package JDK_8.myNotes.J_Function.common_1;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 18:06
 * \* Description:
 * \
 */
public class M3 {

    public static void main(String[] args) {

        Function<String,String> function = Function.identity();

        String s = function.apply("lol");

        System.out.println(s);

        System.out.println("--------------");

        Stream<String> stream = Stream.of("I", "love", "you", "too");

        Map<String, Integer> map = stream.collect(Collectors.toMap(Function.identity(), String::length));

        System.out.println(map);

    }
}
