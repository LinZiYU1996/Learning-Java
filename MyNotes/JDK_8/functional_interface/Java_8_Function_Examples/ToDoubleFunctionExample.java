package JDK_8.functional_interface.Java_8_Function_Examples;

import java.util.function.ToDoubleFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:07
 * \* Description:
 * \
 */
public class ToDoubleFunctionExample {

//ToDoubleFunction<T>
//Accepts the value of given data type and produces double value.


    public static void main(String[] args) {

        ToDoubleFunction<Integer> function = f -> f*300;

        System.out.println(function.applyAsDouble(45));
    }
}
