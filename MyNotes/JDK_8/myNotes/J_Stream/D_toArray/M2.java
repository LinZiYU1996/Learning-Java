package JDK_8.myNotes.J_Stream.D_toArray;

import JDK_8.myNotes.J_Stream.D_toArray.pojo.Person;

import java.util.List;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 14:45
 * \* Description:
 * \
 */
public class M2 {


    public static void main(String[] args) {

        List<Person> people = Person.supply_S();

        Person[] peoplearray = people.stream()
                .filter(person -> person.getGender().equals("male"))
                .toArray(Person[]::new);

        for (Person person:peoplearray){
            System.out.println(person);
        }

        System.out.println("------------------");

        Integer[] integers = Stream.of(1, 2, 3, 4, 5).toArray(Integer[]::new);

    }
}
