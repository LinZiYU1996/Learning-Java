package JDK_8.chapter_5.c_5_2.c_5_2_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 20:06
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        String[] Words = {"Goodbye", "World","kdffj"};
        Arrays.stream(Words)
                .map(word -> word.split(""))
                .distinct()
                .collect(Collectors.toList());




    }
}
