package JDK_8.myNotes.J_Stream.D_forEach;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 13:13
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<Integer> integers = Create_Data.supply_Integers();

        integers.stream()
                .forEach(integer -> System.out.println(integer + "'号"));

    }
}
