package JDK_8.myNotes.J_Stream.D_match;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 16:38
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<Integer> l1 = Create_Data.supply_Integers();

        // 是否有大于55的数字
        System.out.println(
                l1.stream()
                .anyMatch(integer -> integer> 55)
        );

// 是否全部都是大于33的数字
        System.out.println(
                l1.stream()
                .allMatch(integer -> integer>33)
        );

// 是否全部数字都不大于200
        System.out.println(
                l1.stream()
                .noneMatch(integer -> integer>200)
        );


    }
}
