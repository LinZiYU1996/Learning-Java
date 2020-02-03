package JDK_8.myNotes.J_Function.common_1;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;
import JDK_8.myNotes.J_Predicate.common_1.Person;

import java.util.List;
import java.util.function.Function;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 18:09
 * \* Description:
 * \
 */
public class M4 {


    public static void main(String[] args) {

        Function<Person,Shanghai_People> function = person ->

        {
            if (person.getOrigin().equals("Shanghai")){
                return new Shanghai_People(person.getName(),person.getAge());
            } else {
                return null;
            }

        };


        List<Person> personList = Create_Data.supply_Persons();

        for (Person person : personList){
            if (function.apply(person) != null) {
                System.out.println(person);
            }
        }



    }
}
