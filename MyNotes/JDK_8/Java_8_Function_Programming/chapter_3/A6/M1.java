package JDK_8.Java_8_Function_Programming.chapter_3.A6;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 17:29
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,2,3,4,5);

        int res = numList.stream()
                .reduce(0,(x,y) -> x+y);


        //第一种比第一种仅仅多了一个字定义初始值罢了。 此外，因为存在stream为空的情况，所以第一种实现并不直接方法计算的结果，而是将计算结果用Optional来包装，我们可以通过它的get方法获得一个Integer类型的结果，而Integer允许null。第二种实现因为允许指定初始值，因此即使stream为空，也不会出现返回结果为null的情况，当stream为空，reduce为直接把初始值返回。

        System.out.println(res);

        int res_2 = numList.stream()
                .reduce(10,(x,y) -> x+y);

        System.out.println(res_2);

    }
}
