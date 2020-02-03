package JDK_8.myNotes.J_Consumer.common2;


import JDK_8.myNotes.J_Predicate.common_1.Create_Data;
import JDK_8.myNotes.J_Predicate.common_1.Person;

import java.util.List;
import java.util.function.ObjIntConsumer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 17:01
 * \* Description:
 * \
 */
public class M2 {


    public static void main(String[] args) {

        ObjIntConsumer<Person> personObjIntConsumer = (person,integer) ->
        {
            if (person.getAge() > integer){
                System.out.println(person);
            }
        };

        List<Person> personList = Create_Data.supply_Persons();

        for (Person person:personList){
            personObjIntConsumer.accept(person,55);
        }

    }
}
