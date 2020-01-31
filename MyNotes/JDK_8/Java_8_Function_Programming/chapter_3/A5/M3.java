package JDK_8.Java_8_Function_Programming.chapter_3.A5;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 13:59
 * \* Description:
 * \
 */
public class M3 {


    public static void main(String[] args) {

        final String[] names = {"Zebe", "Hebe", "Mary", "July", "David"};
        Stream<String> stream1 = Stream.of(names);
        Stream<String> stream2 = Stream.of(names);
        Stream<String> stream3 = Stream.of(names);

        String r1 = stream1.collect(
                Collectors.joining(",","[","]")
        );

        System.out.println(r1);

        System.out.println("---------------------------");

        String r2 = stream2.collect(
                Collectors.joining(" |","","")
        );

        System.out.println(r2);

        System.out.println("---------------------------");

        String r3 = stream3.collect(
                Collectors.joining(" -> ","","")
        );

        System.out.println(r3);

        //[Zebe,Hebe,Mary,July,David]
        //---------------------------
        //Zebe |Hebe |Mary |July |David
        //---------------------------
        //Zebe -> Hebe -> Mary -> July -> Davi


        System.out.println(Stream.of("1", "3", "3", "2").collect(Collectors.joining(",")));


    }
}
