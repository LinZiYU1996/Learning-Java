package JDK_8.Java_8_Function_Programming.chapter_3.A1;

import chapter_11.c_11_8.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 19:26
 * \* Description:
 * \
 */
public class M6 {

    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("one", "two", "three", "four");

        String[] strings_1 = stringStream.toArray(String[]::new);

        System.out.println(Arrays.toString(strings_1));

        System.out.println("==================================");


        Stream<String> stringStream_1 = Stream.of("one", "two", "three", "four");

        List<String> list_1 = stringStream_1.collect(Collectors.toList());

        System.out.println(list_1);

        System.out.println("==================================");

        Stream<String> stringStream_2 = Stream.of("one", "two", "three", "four");


        List<String> list_2 = stringStream_2.collect(Collectors.toCollection(ArrayList::new));

        System.out.println(list_2);

        System.out.println("==================================");


        Stream<String> stringStream_3 = Stream.of("one", "two", "three", "four");


        Set<String> set_1 = stringStream_3.collect(Collectors.toSet());


        System.out.println(set_1);

        System.out.println("==================================");

//        Stack<String> stack1 = stringStream.collect(Collectors.toCollection(Stack::new));

//        System.out.println(stack1);

        System.out.println("==================================");


    }
}
