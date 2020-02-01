package JDK_8.functional_interface.Java_8_Function_Examples;

import java.util.function.IntToLongFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:04
 * \* Description:
 * \
 */
public class IntToLongFunctionExample {


    //IntToLongFunction
    //Accepts integer and produces long data type value.


    public static void main(String[] args) {

        IntToLongFunction function = f -> f*f;

        System.out.println(function.applyAsLong(45));
    }
}
