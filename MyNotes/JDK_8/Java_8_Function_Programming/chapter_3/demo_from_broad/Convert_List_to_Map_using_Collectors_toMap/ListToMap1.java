package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Convert_List_to_Map_using_Collectors_toMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 10:39
 * \* Description:
 * \
 */
public class ListToMap1 {

// Java 8 provides Collectors.toMap() that is useful to convert List to Map. We need to pass mapping function for key and value. To avoid conflict of duplicate keys, we pass merge function otherwise it will throw IllegalStateException. By default Collectors.toMap() returns HashMap and if we want to change it we need to pass required supplier instance. Now find the toMap() method syntax.


    //toMap(Function keyMapper, Function valueMapper, BinaryOperator mergeFunction, Supplier mapSupplier)

    //The arguments are as follows.
    //
    //Function keyMapper: It generates key for Map.
    //
    //Function valueMapper: It generates value for Map.
    //
    //BinaryOperator mergeFunction: This is optional. The usability of merge function is to handle the situation of duplicate Map keys. Using BinaryOperator we can merge the values of duplicate keys. If we do not pass this argument, then by default it throws IllegalStateException in case of duplicate keys.
    //
    //Supplier mapSupplier: This is optional. It returns a Map in which data is filled as key/value. If we do not pass map supplier then the default supplier will return HashMap. If we want to get any other instance such as LinkedHashMap, we need to pass supplier as LinkedHashMap::new.
    public static void main(String[] args) {


//List to Map with Key Mapper and Value Mapper
//Here we will pass mapping function of key mapper and value mapper. The syntax of method is as follows. toMap(Function keyMapper, Function valueMapper) Now find a simple example.
        List<String> list = new ArrayList<>();
        list.add("Mohan");
        list.add("Sohan");
        list.add("Mahesh");

        Map<String,Object> map = list.stream()
                .collect(Collectors.toMap(Function.identity(),s->s));

        map.forEach((x,y) -> System.out.println(x + "---" + y));



    }
}
