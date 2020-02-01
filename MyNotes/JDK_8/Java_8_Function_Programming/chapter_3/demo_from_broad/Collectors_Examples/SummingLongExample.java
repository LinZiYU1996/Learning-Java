package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Collectors_Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:07
 * \* Description:
 * \
 */
public class SummingLongExample {

//Collectors.summingLong
//Collectors.summingLong adds all element of stream for long data type.


    public static void main(String[] args) {

        List<Long> list = new ArrayList<>();
        list.add((long)340);
        list.add((long)240);
        list.add((long)360);

        long res = list.stream()
                .collect(Collectors.summingLong(Long::longValue));

        System.out.println(res);

    }
}
