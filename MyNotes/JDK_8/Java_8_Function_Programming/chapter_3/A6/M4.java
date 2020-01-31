package JDK_8.Java_8_Function_Programming.chapter_3.A6;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 17:50
 * \* Description:
 * \
 */
public class M4 {


    public static void main(String[] args) {

        System.out.println(

                Stream.of(
                        "a","b","c","d"
                ).reduce(String::concat).get()

        );

        System.out.println(

                Stream.of(
                        "a","b","c","d"
                ).reduce("F---",String::concat)

        );

    }
}
