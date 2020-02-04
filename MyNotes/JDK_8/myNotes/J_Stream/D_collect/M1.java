package JDK_8.myNotes.J_Stream.D_collect;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 15:31
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("asas","kdkkd","pp[p[","12121","O");

//        List<String> l1 = stream1.collect(ArrayList::new,ArrayList::add,ArrayList::addAll);

//        System.out.println(l1);

        System.out.println("--------------------");



        String concat1 = stream1.collect(StringBuilder::new, StringBuilder::append,
                 StringBuilder::append)
                    .toString();

        System.out.println(concat1);

        System.out.println("--------------------------------");

        List<Integer> l2 = Create_Data.supply_Integers();

        System.out.println(l2);

        System.out.println("--------------------------------");

        // 找出偶数 放入新的集合
        List<Integer> res1 = l2.stream()
                .filter(integer ->  integer % 2 == 0)
                .collect(
                        ()->new ArrayList<>(),
                        (list,item)->list.add(item),
                        (x,y)->x.addAll(y)
                );

        System.out.println(res1);

        System.out.println("--------------------------------");

        /* 或者使用方法引用 */

        List<Integer> res2 =l2.stream()
                .filter(integer ->  integer % 2 == 0)
                .collect(
                        ArrayList::new, List::add, List::addAll
                );

        System.out.println(res2);

    }
}
