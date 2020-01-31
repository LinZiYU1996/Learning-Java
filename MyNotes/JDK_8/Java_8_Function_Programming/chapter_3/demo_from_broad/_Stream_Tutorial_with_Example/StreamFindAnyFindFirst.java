package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad._Stream_Tutorial_with_Example;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:47
 * \* Description:
 * \
 */
public class StreamFindAnyFindFirst {


    //findAny(): It can return any element of the stream.
    //findFirst(): It returns first element of the stream and if stream has defined no encounter order, then it may return any element.


    public static void main(String[] args) {

        List<String> list = Arrays.asList("G","B","F","E");
        String any = list.stream().findAny().get();
        System.out.println("FindAny: "+ any);
        String first = list.stream().findFirst().get();
        System.out.println("FindFirst: "+ first);

    }
}
