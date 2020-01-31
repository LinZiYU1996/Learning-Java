package JDK_8.Java_8_Function_Programming.chapter_3.A6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 17:31
 * \* Description:
 * \
 */
public class M2 {

    public static void main(String[] args) {


        List<Integer> numList = Arrays.asList(Integer.MAX_VALUE,Integer.MAX_VALUE);

        long res = numList.stream()
                .reduce(0L,(x,y) -> x+y,(x,y) -> 0L);

        //第三种签名的用法相较前两种稍显复杂，犹豫前两种实现有一个缺陷，它们的计算结果必须和stream中的元素类型相同，如上面的代码示例，stream中的类型为int，那么计算结果也必须为int，这导致了灵活性的不足，甚至无法完成某些任务， 比入我们咬对一个一系列int值求和，但是求和的结果用一个int类型已经放不下，必须升级为long类型，此实第三签名就能发挥价值了，它不将执行结果与stream中元素的类型绑死。

        System.out.println(res);


        List<Integer> numList_1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        ArrayList<String> result = numList_1.stream().reduce(new ArrayList<String>(), (a, b) -> {
            a.add("element-" + Integer.toString(b));
            return a;
        }, (a, b) -> null);
        System.out.println(result);
    }
}
