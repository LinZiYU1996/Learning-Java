package JDK_8.functional_interface.UnaryOperator_and_BinaryOperator_Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:23
 * \* Description:
 * \
 */
public class BinaryOperatorDemo {

    //BinaryOperator
    //java.util.function.BinaryOperator is a functional interface that can be assigned as lambda expression. BinaryOperator extends java.util.function.BiFunction. It accepts two operands of the same type and process it and then returns results of the same type as operands.



    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("X", "A");
        map.put("Y", "B");
        map.put("Z", "C");

        BinaryOperator<String> binaryOperator = (s1,s2)
        -> s1 + "---" + s2;

        binaryOperatorFun(binaryOperator,map)
                .forEach(System.out::println);
    }


    private static List<String> binaryOperatorFun(BinaryOperator<String> binaryOpt, Map<String,String> map){
        List<String> biList = new ArrayList<>();
        map.forEach((s1,s2)->biList.add(binaryOpt.apply(s1,s2)));
        return biList;
    }


}
