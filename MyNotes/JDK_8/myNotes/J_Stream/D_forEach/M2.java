package JDK_8.myNotes.J_Stream.D_forEach;

import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 14:37
 * \* Description:
 * \
 */
public class M2 {


    public static void main(String[] args) {

        Stream.of("AAA,","BBB,","CCC,","DDD,").parallel().forEach(System.out::print);
        System.out.println("\n______________________________________________");
        Stream.of("AAA,","BBB,","CCC,","DDD").parallel().forEachOrdered(System.out::print);
        System.out.println("\n______________________________________________");
        Stream.of("DDD,","AAA,","BBB,","CCC").parallel().forEachOrdered(System.out::print);


    }
}
