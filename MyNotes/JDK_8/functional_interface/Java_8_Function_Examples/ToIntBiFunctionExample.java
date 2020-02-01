package JDK_8.functional_interface.Java_8_Function_Examples;

import java.util.function.ToIntBiFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:08
 * \* Description:
 * \
 */
public class ToIntBiFunctionExample {

//ToIntBiFunction<T,U>
//Accepts two arguments of given data type and produces result of integer data type.


    public static void main(String[] args) {
        ToIntBiFunction<Integer,Integer> function = (f1,f2) ->
                f1 + f2;

        System.out.println(function.applyAsInt(454,545));
    }


}
