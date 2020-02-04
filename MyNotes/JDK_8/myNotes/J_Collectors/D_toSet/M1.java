package JDK_8.myNotes.J_Collectors.D_toSet;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 21:54
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        Set<String> set = Stream.of("AA","AA","BB").collect(Collectors.toSet());
        set.forEach(s->System.out.println(s));

    }
}
