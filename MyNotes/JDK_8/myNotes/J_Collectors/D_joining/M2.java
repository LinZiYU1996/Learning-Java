package JDK_8.myNotes.J_Collectors.D_joining;

import JDK_8.myNotes.J_Collectors.D_toMap.pojo.Person;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/4
 * \* Time: 13:52
 * \* Description:
 * \
 */
public class M2 {

    public static void main(String[] args) {


        List<Person> people = Person.supply_P();

        // 把地址连接起来
        String s1 = people.stream()
                .map(Person::getAddress)
                .collect(Collectors.joining(","));

        System.out.println(s1);
        /*
        北京,北京,深圳,广州,上海,广州

         */

    }
}
