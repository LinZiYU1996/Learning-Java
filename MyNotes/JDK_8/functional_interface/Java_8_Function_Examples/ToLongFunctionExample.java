package JDK_8.functional_interface.Java_8_Function_Examples;

import java.util.function.ToLongFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:09
 * \* Description:
 * \
 */
public class ToLongFunctionExample {

//ToLongFunction<T>
//Accepts an argument of given data type and produces result of long data type.
    public static void main(String[] args) {
        ToLongFunction<Integer> ob = f1 -> f1+50;
        System.out.println(ob.applyAsLong(306));
    }
}
