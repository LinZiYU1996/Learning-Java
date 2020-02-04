package JDK_8.myNotes.J_Stream.D_reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 15:00
 * \* Description:
 * \
 */
public class M1 {


//      * <pre>{@code
//     *     U result = identity;
//     *     for (T element : this stream)
//     *         result = accumulator.apply(result, element)
//                *     return result;
//     * }</pre>

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(1,2,3,4,5);

        //计算1,2,3,4,5 的和,并且初始值为3
        //也就是计算3+1+2+3+4+5
        System.out.println(
                l1.stream().reduce(
                        3,(i1,i2)->i1+i2
                )
        );

        System.out.println("------------------------");

        // 拆开分解

        BinaryOperator<Integer> f1 = (x,y)->x+y;

        Integer identity = 3;

        Integer result = identity;

        for (Integer integer:l1){

            result = f1.apply(result,integer);
        }

        System.out.println(result);

        //其实两种方式背后的思维方式是一样的
        //那就是
        //结果重新作为一个参数,不断地参与到运算之中,直到最后结束

        //只要能够理解了累计运算的概念
        //就可以完全理解Stream 中reduce方法
        //他就是一个不断累计运算的过程

        System.out.println("------------------------");
//计算 1*1*2*3*4*5 = 120
        System.out.println(
                l1.stream()
                .reduce(1,(x,y)->x*y)
        );

    }
}
