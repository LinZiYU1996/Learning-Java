package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Convert_Map_to_List_using_Collectors_toList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 10:52
 * \* Description:
 * \
 */
public class SimpleMapToList {

//A Map has key and value and we can get all keys and values as List. If we want to set key and value in a class attribute and then add the object into List, we can achieve it in single line of code of java 8 using Collectors.toList().


    //Map to List with Lambda Expression
    //To convert Map to List with lambda expression using Collectors.toList() is as follows.


    //List<String> valueList = map.values().stream().collect(Collectors.toList());

    //If we want to sort the values before putting into List, we do it as follows.

    //List<String> sortedValueList = map.values().stream()
    //			.sorted().collect(Collectors.toList());


    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(23, "Mahesh");
        map.put(10, "Suresh");
        map.put(26, "Dinesh");
        map.put(11, "Kamlesh");


        System.out.println("--Convert Map Values to List--");
        List<String> valueList = map.values().stream().collect(Collectors.toList());
        valueList.forEach(n -> System.out.println(n));



        System.out.println("--Convert Map Values to List using sort--");
        List<String> sortedValueList = map.values().stream()
                .sorted().collect(Collectors.toList());
        sortedValueList.forEach(n -> System.out.println(n));



        System.out.println("--Convert Map keys to List--");
        List<Integer> keyList = map.keySet().stream().collect(Collectors.toList());
        keyList.forEach(n -> System.out.println(n));


        System.out.println("--Convert Map keys to List using sort--");
        List<Integer> sortedKeyList = map.keySet().stream()
                .sorted().collect(Collectors.toList());
        sortedKeyList.forEach(n -> System.out.println(n));



    }
}
