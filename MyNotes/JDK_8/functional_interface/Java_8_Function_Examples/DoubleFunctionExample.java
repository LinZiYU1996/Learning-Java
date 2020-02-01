package JDK_8.functional_interface.Java_8_Function_Examples;

import java.util.function.DoubleFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:59
 * \* Description:
 * \
 */
public class DoubleFunctionExample {


    //DoubleFunction<R>
    //Accepts only double data type value and returns the result as given data type.


    public static void main(String[] args) {


        DoubleFunction<String> doubleFunction = d ->
                String.valueOf(d*5.3);

        System.out.println(doubleFunction.apply(45.6));

    }
}
