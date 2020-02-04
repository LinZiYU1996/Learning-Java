package JDK_8.myNotes.J_Stream.D_Map;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;
import JDK_8.myNotes.J_Predicate.common_1.Person;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 23:00
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        //map方法将对于Stream中包含的元素使用给定的转换函数进行转换操作，新生成的Stream只包含转换生成的元素。

        List<String> strings = Create_Data.supply_Strings(1,10);

        System.out.println(strings);

        System.out.println("");

        strings.stream()
                .map(s -> s.toLowerCase())
                .forEach(System.out::println);


        System.out.println("----------------");

        List<Person> personList = Create_Data.supply_Persons();

        List<Integer> ages = personList.stream()
                .map(Person::getAge)
                .collect(Collectors.toList());

        ages.forEach(System.out::println);

        System.out.println("---------------");

        Stream<Integer> stream = Stream.of(1,2,4,5,6,8);

        stream.map(integer -> integer * integer)
                .forEach(System.out::println);

    }
}
