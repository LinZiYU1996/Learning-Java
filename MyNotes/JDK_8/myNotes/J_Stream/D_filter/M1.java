package JDK_8.myNotes.J_Stream.D_filter;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 22:44
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        //filter 对原Stream按照指定条件过滤，过滤出满足条件的元素。

        List<Integer> integers = Create_Data.supply_Integers();

        Predicate<Integer> predicate = integer ->
                integer > 15;

        // 通过传递predicate

        integers.stream()
                .filter(predicate)
                .forEach(System.out::println);


        System.out.println("---------------------------");
        // 直接使用Lambda

        integers.stream()
                .filter(integer -> integer > 75 && integer < 85)
                .forEach(System.out::println);



        System.out.println("---------------------------");


        List<Integer> list  = Arrays.asList(3, 12, 23, 44, 20, 10, 17, 8);

        System.out.println("---List with even Numbers---");

        List<Integer> evenList = list.stream()
                .filter(integer -> integer % 2 ==0)
                .collect(Collectors.toList());


        evenList.forEach(System.out::println);

        System.out.println("\n---List with odd Numbers---");
        List<Integer> oddList = list.stream().filter(i -> i%2 == 1)
                .collect(Collectors.toList());
        oddList.forEach(s -> System.out.print(s+" "));


    }
}
