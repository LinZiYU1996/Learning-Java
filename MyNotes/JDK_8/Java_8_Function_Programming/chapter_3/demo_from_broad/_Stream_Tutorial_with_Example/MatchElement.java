package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad._Stream_Tutorial_with_Example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:44
 * \* Description:
 * \
 */
public class MatchElement {

    //allMatch(): It returns true if all elements of stream matches the given Predicate.
    //anyMatch(): It returns true if any element of stream matches the given Predicate.
    //noneMatch(): It returns true if none of the elements of stream matches the given Predicate.


    public static void main(String[] args) {


        Predicate<Integer> p = num -> num % 2 == 0;
        List<Integer> list = Arrays.asList(3,5,6);
        System.out.println("allMatch:" + list.stream().allMatch(p));
        System.out.println("anyMatch:" + list.stream().anyMatch(p));
        System.out.println("noneMatch:" + list.stream().noneMatch(p));
    }
}
