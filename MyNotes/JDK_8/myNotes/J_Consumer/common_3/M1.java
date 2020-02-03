package JDK_8.myNotes.J_Consumer.common_3;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;
import JDK_8.myNotes.J_Predicate.common_1.Person;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 17:17
 * \* Description:
 * \
 */
public class M1{


    public static void main(String[] args) {

        MyConsumer<Person,Integer,String> myConsumer = (person,integer,string) ->
        {
            if (person.getAge() > integer) {
                System.out.println(string);
                System.out.println(person);
                System.out.println("");
            }
        };

        List<Person> personList = Create_Data.supply_Persons();

        for (Person person : personList) {
            myConsumer.accept(person,50,"年纪大于50的人");
        }

    }
}
