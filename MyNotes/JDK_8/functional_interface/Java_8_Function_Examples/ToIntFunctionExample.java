package JDK_8.functional_interface.Java_8_Function_Examples;

import java.util.function.ToIntFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:09
 * \* Description:
 * \
 */
public class ToIntFunctionExample {

//ToIntFunction<T>
//Accepts an argument of given data type and produces integer value.


    public static void main(String[] args) {
        ToIntFunction<Integer> ob = f -> f*123;
        System.out.println(ob.applyAsInt(306));
    }
}
