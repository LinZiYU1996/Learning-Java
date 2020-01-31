package JDK_8.Java_8_Function_Programming.chapter_3.A6;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 17:25
 * \* Description:
 * \
 */
public class M {


    public static void main(String[] args) {


        //代码实现了对numList中的元素累加。lambada表达式的a参数是表达式的执行结果的缓存，也就是表达式这一次的执行结果会被作为下一次执行的参数，而第二个参数b则是依次为stream中每个元素。如果表达式是第一次被执行，a则是stream中的第一个元素

        List<Integer> numList = Arrays.asList(1,2,3,4,5);

        int res = numList.stream().reduce((a,b) -> a + b).get();

        System.out.println(res);

        System.out.println("----------------------------");

        //查看整个过程
        int res_2 = numList.stream()
                .reduce((x,y) ->
                {
                    System.out.println("x =  "+
                            x +
                            ", y = " + y);

                    return x+y;
                }).get();

        //表达式被调用了4次， 第一次a和b分别为stream的第一和第二个元素，因为第一次没有中间结果可以传递， 所以 reduce方法实现为直接将第一个元素作为中间结果传递。
        System.out.println(res_2);

    }
}
