package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Collectors_Examples;

import java.util.List;
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
public class ToListExample {

//Collectors.toList
//Collectors.toList collects the stream data as List for the given data type.
    public static void main(String[] args) {

        List<String> list = Stream.of("AA","BB","CC").collect(Collectors.toList());
        list.forEach(s->System.out.println(s));
    }
}
