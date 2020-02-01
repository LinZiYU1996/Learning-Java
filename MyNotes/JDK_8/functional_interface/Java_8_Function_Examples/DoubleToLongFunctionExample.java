package JDK_8.functional_interface.Java_8_Function_Examples;

import java.util.function.DoubleToLongFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:01
 * \* Description:
 * \
 */
public class DoubleToLongFunctionExample {

//DoubleToLongFunction
//Accepts double data type value and returns long data type value.

    public static void main(String[] args) {


        DoubleToLongFunction functionExample = f ->

                new Double(f*7.1).longValue();

        System.out.println(functionExample.applyAsLong(4.7));
    }
}
