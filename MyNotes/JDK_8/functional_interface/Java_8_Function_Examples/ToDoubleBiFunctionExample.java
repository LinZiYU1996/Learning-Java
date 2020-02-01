package JDK_8.functional_interface.Java_8_Function_Examples;

import java.util.function.ToDoubleBiFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:06
 * \* Description:
 * \
 */
public class ToDoubleBiFunctionExample {

//ToDoubleBiFunction<T,U>
//Accepts two arguments of the given data type and produces result of double data type.


    public static void main(String[] args) {

        ToDoubleBiFunction<Integer,Integer> function = (f1,f2)
        ->f1 + f2;

        System.out.println(function.applyAsDouble(100,100));

    }
}
