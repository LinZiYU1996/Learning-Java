package JDK_8.Java_8_Function_Programming.chapter_3.A1;

import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 19:19
 * \* Description:
 * \
 */
public class M5 {


    public static void main(String[] args) {


//        iterate 跟 reduce 操作很像，接受一个种子值，和一个 UnaryOperator（例如 f）。然后种子值成为 Stream 的第一个元素，f(seed) 为第二个，f(f(seed)) 第三个，以此类推。在 iterate 时候管道必须有 limit 这样的操作来限制 Stream 大小。

        Stream.iterate(0,n -> n+3).limit(10).forEach(x ->
                System.out.println(x + "  "));

    }
}
