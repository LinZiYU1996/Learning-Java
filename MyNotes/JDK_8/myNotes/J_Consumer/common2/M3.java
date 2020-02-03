package JDK_8.myNotes.J_Consumer.common2;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;
import JDK_8.myNotes.J_Predicate.common_1.Person;

import java.util.List;
import java.util.function.BiConsumer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 17:08
 * \* Description:
 * \
 */
public class M3 {


    public static void main(String[] args) {

        BiConsumer<String,Integer> biConsumer = (s,i) ->
        {

            if (s.length() > 2 && i > 60){
                System.out.println("OK");
            }

        };

        List<Person> personList = Create_Data.supply_Persons();

        for (Person person : personList){
            biConsumer.accept(person.getName(),person.getAge());
        }

        System.out.println("-----------------------");

        BiConsumer<Person,String> biConsumer2 = (p,s) ->
        {

            if (p.getOrigin().equals("Shanghai")){
                System.out.println(s);
            }
        };

        for (Person person : personList) {
            biConsumer2.accept(person,"来自上海的群众");
        }



    }
}
