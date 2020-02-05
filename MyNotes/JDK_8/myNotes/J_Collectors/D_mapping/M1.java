package JDK_8.myNotes.J_Collectors.D_mapping;

import JDK_8.myNotes.J_Collectors.D_toMap.pojo.Person;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/4
 * \* Time: 14:14
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<Person> people = Person.supply_P();

//        people.stream()
//                .collect(Collectors.mapping(
//                        person ->
//                        {if (person.getAddress().equals("北京")){
//                            person.setName(person.getName() + "来自北京");
//                           }
//                        }
//                ));





    }
}
