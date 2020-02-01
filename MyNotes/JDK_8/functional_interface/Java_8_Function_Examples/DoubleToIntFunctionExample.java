package JDK_8.functional_interface.Java_8_Function_Examples;

import java.util.function.DoubleToIntFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:00
 * \* Description:
 * \
 */
public class DoubleToIntFunctionExample {

//DoubleToIntFunction
//Accepts double data type value and returns integer value.
    public static void main(String[] args) {

        DoubleToIntFunction function = f ->

                new Double(f*4.8).intValue();

        System.out.println(function.applyAsInt(45.36));

    }
}
