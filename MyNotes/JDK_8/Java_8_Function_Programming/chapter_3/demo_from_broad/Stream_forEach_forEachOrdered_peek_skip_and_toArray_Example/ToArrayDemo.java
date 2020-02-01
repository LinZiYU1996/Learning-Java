package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_forEach_forEachOrdered_peek_skip_and_toArray_Example;

import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:15
 * \* Description:
 * \
 */
public class ToArrayDemo {

//Stream.toArray
//toArray() method converts a stream into an array.

    public static void main(String[] args) {
        Object[] ob = Stream.of("A","B","C","D").toArray();
        for (Object o : ob) {
            System.out.println(o.toString());
        }
    }
}
