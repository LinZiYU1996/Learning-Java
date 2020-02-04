package JDK_8.myNotes.J_Stream.D_distinct;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 11:28
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {


        List<String> list = Arrays.asList("AA", "BB", "CC", "BB", "CC", "AA", "AA");

        list.stream()
                .distinct()
                .forEach(System.out::println);


    }
}
