package JDK_8.myNotes.J_Stream.D_toArray;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;

import java.util.List;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 14:38
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of(
                "a","dkkdk","1241","kdkdi","lpp"
        );

        Object[] objects1 = stream1.toArray();

        for(Object o:objects1){
            System.out.println(o);
        }

        System.out.println("--------------------");

        List<Integer> integers = Create_Data.supply_Integers();

        Object[] objects2 = integers.stream()
                .toArray();


        for(Object o:objects2){
            System.out.println(o);
        }

        System.out.println("--------------------");

        Object[] ob = Stream.of("A","B","C","D").toArray();
        for (Object o : ob) {
            System.out.println(o.toString());
        }


    }
}
