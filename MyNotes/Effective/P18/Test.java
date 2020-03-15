package Effective.P18;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/14
 * \* Time: 21:11
 * \* Description:
 * \
 */
public class Test {


    public static void main(String[] args) {

        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();


        s.addAll(Arrays.asList(
                "a",
                "b",
                "c"
        ));

        System.out.println(s.getAddCount());
        /*

        预测 值 为 3
        
        实际 输出 6


         */


        /*

        在HashSet内部 addAll方法时基于它的add方法来实现的

        InstrumentedHashSet 中的addAll方法首先给addCount+3

        然后利用super().addAll来调用HashSet的addAll实现

        然后又依次调用被InstrumentedHashSet覆盖的add方法

        每个元素调用一次    三次调用又

        分别给addCount + 1

        最终变成了 6



         */





    }
}
