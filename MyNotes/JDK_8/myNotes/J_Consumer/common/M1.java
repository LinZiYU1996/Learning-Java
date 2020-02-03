package JDK_8.myNotes.J_Consumer.common;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;
import JDK_8.myNotes.J_Predicate.common_1.Person;

import java.util.List;
import java.util.function.Consumer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 16:45
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        Consumer<String> consumer1 = s -> System.out.println(s.length());

        consumer1.accept("abc");

        System.out.println("----------------------");

        Consumer<Integer> consumer2 = integer -> System.out.println(integer);

        consumer2.accept(4545);

        System.out.println("----------------------");

        Consumer<String> consumer3 = s -> System.out.println(s);

        Consumer<String> consumer4 = s -> System.out.println(s.toUpperCase());

        //先执行consumer3 再执行consumer4
        consumer3.andThen(consumer4).accept("jhdhhfdhuhhd");

        System.out.println("----------------------");


        Consumer<Integer> consumer5 = integer ->
        {
            if (integer > 50){
                System.out.println(integer);
            }
        };

        List<Integer> integers = Create_Data.supply_Integers();

        integers.stream()
                .forEach(consumer5);

        System.out.println("----------------------");

        List<Person> personList = Create_Data.supply_Persons();

        Consumer<Person> consumer6 = person ->
        {
            if (person.getAge() > 15) {
                System.out.println(person);
            }
        };

        personList.stream()
                .forEach(consumer6);


    }
}
