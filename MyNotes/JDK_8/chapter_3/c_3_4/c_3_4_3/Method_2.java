package JDK_8.chapter_3.c_3_4.c_3_4_3;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 11:24
 * \* Description:
 * \
 */
public class Method_2 {


    public static void main(String[] args) {
//        Java 8为我们前面所说的函数式接口带来了一个专门的版本，以便在输入和输出都是原始类
//型时避免自动装箱的操作。比如，在下面的代码中，使用 IntPredicate 就避免了对值 1000 进行
//装箱操作，但要是用 Predicate<Integer> 就会把参数 1000 装箱到一个 Integer 对象中：

        IntPredicate evenNumbers = (int i) -> i % 2 == 0;
        boolean flag = evenNumbers.test(1000);//无装箱
        System.out.println(flag);

        System.out.println("==============================");

        Predicate<Integer> oddNumbers = (Integer i) -> i % 2 == 1;
        oddNumbers.test(1000);//装箱


    }

//    一般来说，针对专门的输入参数类型的函数式接口的名称都要加上对应的原始类型前缀，比
//如 DoublePredicate 、 IntConsumer 、 LongBinaryOperator 、 IntFunction 等。 Function
//接口还有针对输出参数类型的变种： ToIntFunction<T> 、 IntToDoubleFunction 等


}
