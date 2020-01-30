package JDK_8.Java_8_Function_Programming.chapter_3.A2;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 20:36
 * \* Description:
 * \
 */
public class M3 {


    public static void main(String[] args) {

        Map<String,String> map = Stream.of("a","b","c")
                .collect(Collectors.toMap(
                        x -> x,
                        x -> x+x,
                        (old,newval) -> newval
                ));


        map.forEach(
                (k,v) ->
                        System.out.println(k + "---" + v)
        );


    }
}
