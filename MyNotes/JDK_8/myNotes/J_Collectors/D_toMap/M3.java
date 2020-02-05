package JDK_8.myNotes.J_Collectors.D_toMap;

import JDK_8.myNotes.J_Collectors.D_toMap.pojo.Person;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/4
 * \* Time: 11:17
 * \* Description:
 * \
 */
public class M3 {


    public static void main(String[] args) {

        List<Person> people = Person.supply_P();

        Map<String,String> phoneBook = people.stream()
                .collect(Collectors.toMap(Person::getName,
                        Person::getAddress,
                        (s,a) -> s + ",   " + a,
                        LinkedHashMap::new));

        phoneBook.forEach(
                (k,v) ->
                        System.out.println(k + "     "  + v)
        );
    }
}
