package JDK_8.myNotes.J_Stream.D_count;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 16:29
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<Integer> l1 = Create_Data.supply_Integers();

        System.out.println(
                l1.stream()
                .count()
        );

    }
}
