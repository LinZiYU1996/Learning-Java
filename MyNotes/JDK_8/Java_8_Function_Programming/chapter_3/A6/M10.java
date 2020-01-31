package JDK_8.Java_8_Function_Programming.chapter_3.A6;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 20:09
 * \* Description:
 * \
 */
public class M10 {

    public static void main(String[] args) {


        List<String> strs = Arrays.asList("d", "b", "a", "c", "a");


        Optional<String> aa = strs.stream()
                .filter(s -> !s.equals("a")).findFirst();

        System.out.println(aa.get());

        System.out.println("------------------");

        Optional<String> bb = strs.stream()
                .filter(s -> !s.equals("a")).findAny();

        System.out.println(bb.get());

        System.out.println("------------------");

    }
}
