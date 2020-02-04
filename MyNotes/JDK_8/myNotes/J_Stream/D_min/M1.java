package JDK_8.myNotes.J_Stream.D_min;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;
import JDK_8.myNotes.J_Stream.D_min.pojo.Person;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 16:12
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<Integer> l1 = Create_Data.supply_Integers();

        System.out.println(l1);

        System.out.println("------------------------------");

        System.out.println(
                l1.stream()
                .min(Integer::compareTo).get()
        );

        System.out.println("------------------------------");


        System.out.println(
                l1.stream()
                .min(Comparator.comparing(Function.identity())).get()
        );

        List<String> strings1 = Create_Data.supply_Strings(10,5);

        System.out.println("------------------------------");

        System.out.println(strings1);

        System.out.println("------------------------------");


        System.out.println(
                strings1.stream()
                .min(Comparator.comparing(Function.identity())).get()
        );

        System.out.println("------------------------------");

        List<Person> personList = Person.supply_S();

        System.out.println(personList);

        System.out.println("------------------------------");


        System.out.println(
                personList.stream()
                .min(Comparator.comparing(Person::getAge)).get()
        );

    }
}
