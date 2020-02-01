package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Convert_List_to_Map_using_Collectors_toMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 10:42
 * \* Description:
 * \
 */
public class ListToMap2 {


    public static void main(String[] args) {


        List<Person> list = new ArrayList<>();
        list.add(new Person(100, "Mohan"));
        list.add(new Person(200, "Sohan"));
        list.add(new Person(300, "Mahesh"));

        Map<Integer,String> map = list.stream()

                .collect(Collectors.toMap(
                        Person::getId,
                        Person::getName
                ));

        map.forEach((x,y) -> System.out.println(x + "---" + y));

    }
}
