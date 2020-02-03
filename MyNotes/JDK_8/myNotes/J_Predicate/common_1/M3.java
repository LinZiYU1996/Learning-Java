package JDK_8.myNotes.J_Predicate.common_1;

import java.util.List;
import java.util.function.Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 11:23
 * \* Description:
 * \
 */
public class M3 {


    public static void main(String[] args) {

        Predicate<Integer> p1 = integer -> integer > 30;

        Predicate<String> p2 = Predicate.isEqual("Shanghai");

        List<Person> people = Create_Data.supply_Persons();

//        people.stream()
//                .filter(p1)
//                .filter(p2)
//                .forEach(System.out::println);


    }




}
