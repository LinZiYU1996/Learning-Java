package JDK_8.myNotes.J_Stream.D_collect;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 16:09
 * \* Description:
 * \
 */
public class M2 {


    public static void main(String[] args) {

        List<Integer> l1 = Create_Data.supply_Integers();

        List<Integer> res1 = l1.stream()
                .filter(integer -> integer>55)
                .collect(Collectors.toList());

        System.out.println(res1);

        /*输出*/
//        [79, 89, 65, 98, 74, 90, 75, 61]


    }
}
