package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_forEach_forEachOrdered_peek_skip_and_toArray_Example;

import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:13
 * \* Description:
 * \
 */
public class ForEachDemo {


    //Stream.forEach and Stream.forEachOrdered
    //forEach() method accepts Consumer as an argument and that consumer is applied to each element of the stream. For example we can create a consumer to print the stream element and use it with forEach() method. forEachOrdered() method does the same thing but in the encounter order of the stream.




    public static void main(String[] args) {

        System.out.println("forEach Demo");
        Stream.of("AAA","BBB","CCC").forEach(s->System.out.println("Output:"+s));
        System.out.println("forEachOrdered Demo");
        Stream.of("AAA","BBB","CCC").forEachOrdered(s->System.out.println("Output:"+s));


    }
}
