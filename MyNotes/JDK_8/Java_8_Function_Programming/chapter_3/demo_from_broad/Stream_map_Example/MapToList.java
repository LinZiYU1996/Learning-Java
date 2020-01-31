package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_map_Example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:56
 * \* Description:
 * \
 */
public class MapToList {


    //map(Function mapper)
    //
    //We need to pass Function instance as lambda expression. This method returns Stream instance that has the result processed by given Function. This is an intermediate operation.

    //Here we will convert a HashMap into a List of objects using Stream.map() as an intermediate operation.
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(111, "Lalkrishna");
        map.put(154, "Atal");
        map.put(30, "Narendra");
        map.put(200, "Amit");


        List<User> users = map.entrySet().stream()

                .sorted(Comparator.comparing(e->e.getKey()))
                .map(e->new User(e.getKey(),e.getValue()))
                .collect(Collectors.toList());

        users.forEach(System.out::println);




    }
}
