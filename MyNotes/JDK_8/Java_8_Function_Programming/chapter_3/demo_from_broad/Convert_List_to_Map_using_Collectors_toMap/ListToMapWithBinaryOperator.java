package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Convert_List_to_Map_using_Collectors_toMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 10:43
 * \* Description:
 * \
 */
public class ListToMapWithBinaryOperator {

//Here if keys will be duplicate then, it will throw IllegalStateException. To solve it, we pass merge function as BinaryOperator.
//List to Map with Key Mapper, Value Mapper and Merge Function
//In this example we will pass BinaryOperator as merge function. When the toMap() method finds duplicate keys then the values are merged and it does not throw exception. Find the method syntax.
//toMap(Function keyMapper, Function valueMapper, BinaryOperator mergeFunction)


    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person(100, "Mohan"));
        list.add(new Person(100, "Sohan"));
        list.add(new Person(300, "Mahesh"));

        Map<Integer, String> map = list.stream()
                .collect(Collectors.toMap(Person::getId,
                        Person::getName,
                        (x, y) -> x+", "+ y));
        map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));



    }

}
