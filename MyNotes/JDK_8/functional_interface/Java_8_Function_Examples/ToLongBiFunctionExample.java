package JDK_8.functional_interface.Java_8_Function_Examples;

import java.util.function.ToLongBiFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:09
 * \* Description:
 * \
 */
public class ToLongBiFunctionExample {

//ToLongBiFunction<T,U>
//Accepts two arguments of given data type and produces long data type value.
    public static void main(String[] args) {
        ToLongBiFunction<Integer,Integer> ob = (f1, f2) -> f1-f2;
        System.out.println(ob.applyAsLong(306,405));
    }
}
