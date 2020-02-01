package JDK_8.functional_interface.Java_8_Function_Examples;

import java.util.function.IntToDoubleFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:03
 * \* Description:
 * \
 */
public class IntToDoubleFunctionExample {

    ///IntToDoubleFunction
    //Accepts integer value and produces double data type value.

    public static void main(String[] args) {

        IntToDoubleFunction function = f->f*f;

        System.out.println(function.applyAsDouble(454));


    }
}
