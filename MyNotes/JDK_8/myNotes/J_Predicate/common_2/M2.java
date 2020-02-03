package JDK_8.myNotes.J_Predicate.common_2;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;
import JDK_8.myNotes.J_Predicate.common_1.Person;

import java.util.List;
import java.util.function.BiPredicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 11:40
 * \* Description:
 * \
 */
public class M2 {


    public static void main(String[] args) {

        // 找出 来自上海 并且 年纪在30岁以上的人
        BiPredicate<Integer,String> biPredicate = (i,s)->
                i > 30 && s.equals("Shanghai");

        List<Person> personList = Create_Data.supply_Persons();

        for (Person person : personList){
            if (biPredicate.test(person.getAge(),person.getOrigin())){
                System.out.println(person);
            }
        }
    }
}
