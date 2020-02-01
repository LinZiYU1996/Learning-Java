package JDK_8.functional_interface.Java_8_Function_Examples;

import java.util.function.Function;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:59
 * \* Description:
 * \
 */
public class FunctionExample {

//Java 8 provides function API . These API are functional interface. We can assign it as lambda expression. Function accepts arguments, perform some processing and finally produces result. We need to define data type of arguments and result. Java 8 provides different in-built functions for different data type. In this page we will see many examples for different functions.
//Function<T,R>
//Function produces result of given data type and accepts one argument as given data type.


    public static void main(String[] args) {


        Function<Integer,String> function = f -> "age" + f;

        System.out.println(function.apply(55));
    }

}
