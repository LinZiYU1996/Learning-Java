package JDK_8.functional_interface.Java_8_Function_Examples;

import java.util.function.IntFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:02
 * \* Description:
 * \
 */
public class IntFunctionExample {

//IntFunction<R>
//Accepts only integer value and produces result of given data type.


    public static void main(String[] args) {

        IntFunction function = f->f*f;

        System.out.println(function.apply(454));
    }
}
