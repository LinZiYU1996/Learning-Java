package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_forEach_forEachOrdered_peek_skip_and_toArray_Example;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:14
 * \* Description:
 * \
 */
public class SkipDemo {


    //Stream.skip
    //skip() is a method that skips given number of element from the stream object from start.



    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA","BB","CC","DD");
        list.stream().skip(2).forEach(s->System.out.println(s));
    }
}
