package JDK_8.Java_8_Function_Programming.chapter_3.A5.a1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 14:13
 * \* Description:
 * \
 */
public class M2 {

    public static void main(String[] args) {

        //先执行collect操作后再执行第二个参数的表达式。这里是先塞到集合，再得出集合长度。
        Integer integer = Stream.of("1", "2", "3").collect(Collectors.collectingAndThen(Collectors.toList(), x -> x.size()));

        System.out.println(integer);

    }
}
