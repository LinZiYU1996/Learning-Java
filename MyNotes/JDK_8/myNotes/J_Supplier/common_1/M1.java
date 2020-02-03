package JDK_8.myNotes.J_Supplier.common_1;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;
import JDK_8.myNotes.J_Predicate.common_1.Person;

import java.util.List;
import java.util.function.Supplier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 17:22
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        Supplier<String> supplier1 = String::new;

        System.out.println(supplier1.get());

        System.out.println("---------------");

        Supplier<List<Integer>> supplier2 = ()->
                Create_Data.supply_Integers();

        System.out.println(
                supplier2.get()
        );

        System.out.println("---------------");

        Supplier<List<Person>> supplier3 = ()->
                Create_Data.supply_Persons();

        System.out.println(
                supplier3.get()
        );


    }
}
