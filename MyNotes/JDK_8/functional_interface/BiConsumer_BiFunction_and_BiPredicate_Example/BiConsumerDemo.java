package JDK_8.functional_interface.BiConsumer_BiFunction_and_BiPredicate_Example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:40
 * \* Description:
 * \
 */
public class BiConsumerDemo {

    //BiFunction and BiPredicate functional interface. All the three interface accepts two arguments. BiConsumer does not return any value but perform the defined operation. BiFunction returns a value. We define the data type for it while declaring BiFunction. BiPredicate performs the defined operation and returns boolean value. Find the example for how to use these functional interfaces in our code.
    //BiConsumer
    //java.util.function.BiConsumer is a java 8 functional interface. BiConsumer does not return value. It accepts two parameter as an argument. BiConsumer functional method is accept(Object, Object). This methods performs the operation defined by BiConsumer.
    //In our example we have declared a BiConsumer that will simply print the value of both parameter. To do this we have taken a map which has two parameter key and value. We will print the value of map with the help of BiConsumer.


    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        BiConsumer<Integer,String> integerStringBiConsumer = (k,v)->
                System.out.println(k + " *** " + v);

        map.forEach(integerStringBiConsumer);

    }
}
