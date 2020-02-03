package JDK_8.myNotes.J_Stream.D_Map;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 23:00
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {


        List<String> strings = Create_Data.supply_Strings(1,10);

        System.out.println(strings);

        System.out.println("");

        strings.stream()
                .map(s -> s.toLowerCase())
                .forEach(System.out::println);




    }
}
