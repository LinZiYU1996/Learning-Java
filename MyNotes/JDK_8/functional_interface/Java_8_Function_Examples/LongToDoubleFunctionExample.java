package JDK_8.functional_interface.Java_8_Function_Examples;

import java.util.function.LongToDoubleFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:05
 * \* Description:
 * \
 */
public class LongToDoubleFunctionExample {

//LongToDoubleFunction
//Accepts long data type value and produces double data type value.


    public static void main(String[] args) {


        LongToDoubleFunction function = f->f*f;

        System.out.println(function.applyAsDouble(43));
    }
}
