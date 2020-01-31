package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_filter_Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 22:11
 * \* Description:
 * \
 */
public class FilterListOfInteger {


    //Here we have a list of integers. We will filter the list into even and odd number of lists.

    public static void main(String[] args) {

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
