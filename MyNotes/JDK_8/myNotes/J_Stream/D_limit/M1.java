package JDK_8.myNotes.J_Stream.D_limit;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 13:06
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<String> list = Arrays.asList("AA","BB","CC","DD","EE");
        list.stream().limit(3).forEach(s->System.out.println(s));

        System.out.println("-------------");

        List<Integer> l2 = Create_Data.supply_Integers();

        l2.stream()
                .limit(5)
                .forEach(System.out::println);

    }
}
