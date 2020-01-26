package JDK_8.chapter_5.c_5_7.c_5_7_4;

import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/26
 * \* Time: 20:04
 * \* Description:
 * \
 */
public class Test_5_4 {


//    斐波纳契元组序列与此类似，是数列中数字和其后续数字组成的元组构成的序列：(0, 1),
//(1, 1), (1, 2), (2, 3), (3, 5), (5, 8), (8, 13), (13, 21) …



//    用 iterate 方法生成斐波纳契元组序列中的前20个元素。

    public static void main(String[] args) {

        Stream.iterate(new int[]{0, 1},
                t -> new int[]{t[1], t[0]+t[1]})
                .limit(20)
                .forEach(t -> System.out.println("(" + t[0] + "," + t[1] +")"));

    }
}
