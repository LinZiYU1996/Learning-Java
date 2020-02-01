package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_collect_Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 10:32
 * \* Description:
 * \
 */
public class ToListExample{


    //Stream.collect() with Collectors.toList()

    public static void main(String[] args) {

        String[] strArray = {"AA", "BB", "CC"};
        List<String> list = Arrays.stream(strArray).collect(Collectors.toList());
        list.forEach(s->System.out.println(s));

    }
}
