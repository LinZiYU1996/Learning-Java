package JDK_8.myNotes.J_Stream.D_Map;

import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 10:46
 * \* Description:
 * \
 */
public class M2 {

    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("ass,","jdjjfjf","145445");

        Stream<Integer> stream2 = Stream.of(1,2556,4556,4556,4559,55);

        // 打印每个字符串的长度
        stream1.mapToInt(String::length).forEach(System.out::println);

        System.out.println("-----------------------------------");

        // 计算总和
        int sum = stream2.mapToInt(Integer::intValue).sum();

        System.out.println(sum);

    }


}
