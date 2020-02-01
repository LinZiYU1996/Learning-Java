package JDK_8.functional_interface.Java_8_Function_Examples;

import java.util.function.LongFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:04
 * \* Description:
 * \
 */
public class LongFunctionExample {

    //LongFunction<R>
    //Accepts only long data type value and produces result of given data type.

    public static void main(String[] args) {

        LongFunction<String> function = f -> String.valueOf(f*f);

        System.out.println(function.apply(45));


    }
}
