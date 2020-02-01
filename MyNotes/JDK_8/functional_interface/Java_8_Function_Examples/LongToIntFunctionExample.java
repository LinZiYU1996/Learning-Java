package JDK_8.functional_interface.Java_8_Function_Examples;

import java.util.function.LongToIntFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:06
 * \* Description:
 * \
 */
public class LongToIntFunctionExample {

    //LongToIntFunction
    //Accepts long data type value and produces integer data type value.

    public static void main(String[] args) {

        LongToIntFunction function = f-> (int) (f*f);

        System.out.println(function.applyAsInt(454));

    }
}
