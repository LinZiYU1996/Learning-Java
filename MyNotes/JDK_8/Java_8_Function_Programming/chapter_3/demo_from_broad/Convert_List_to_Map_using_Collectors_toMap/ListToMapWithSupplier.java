package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Convert_List_to_Map_using_Collectors_toMap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 10:45
 * \* Description:
 * \
 */
public class ListToMapWithSupplier {


    //List to Map with Key Mapper, Value Mapper, Merge Function and Map Supplier
    //Here we will pass map supplier in the toMap() method. If we want to return LinkedHashMap, we need to pass supplier as LinkedHashMap::new.
    //toMap(Function keyMapper, Function valueMapper, BinaryOperator mergeFunction, Supplier mapSupplier)


    public static void main(String[] args) {


        List<Person> list = new ArrayList<>();
        list.add(new Person(100, "Mohan"));
        list.add(new Person(100, "Sohan"));
        list.add(new Person(300, "Mahesh"));
        LinkedHashMap<Integer, String> map = list.stream()
                .collect(Collectors.toMap(
                        Person::getId,
                        Person::getName,
                        (x, y) -> x+", "+ y,
                        LinkedHashMap::new));
        map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));


    }
}
