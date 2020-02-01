package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Convert_Map_to_List_using_Collectors_toList;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 10:55
 * \* Description:
 * \
 */
public class MapToListOfUserObject {


    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(23, "Mahesh");
        map.put(10, "Suresh");
        map.put(26, "Dinesh");
        map.put(11, "Kamlesh");


        List<Person> list = map.entrySet()

                .stream()
                .sorted(Comparator.comparing(e->e.getKey()))
                .map(e -> new Person(e.getKey(),e.getValue()))
                .collect(Collectors.toList());


        list.forEach(l -> System.out.println("Id: "+ l.getId()+", Name: "+ l.getName()));
//Here the list has been sorted by Map key and if we want to sort it by value, we need to use
//Comparator.comparing(e -> e.getValue())



    }
}
