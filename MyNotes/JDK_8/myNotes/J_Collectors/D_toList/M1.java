package JDK_8.myNotes.J_Collectors.D_toList;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 21:46
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<String> list = Stream.of("AA","BB","CC").collect(Collectors.toList());
        list.forEach(s->System.out.println(s));

        System.out.println("----------");

        List<Integer> l1 = Create_Data.supply_Integers();


        // 收集偶数到集合里面
        List<Integer> even = l1.stream()
                .filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(even);

    }
}
