package JDK_8.myNotes.J_Collectors.D_Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 21:56
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<String> l1 = Stream.of(
                "kdkkd","kdkdkkd","lokfkf"
        ).collect(Collectors.toCollection(ArrayList::new));

        System.out.println(l1);

        System.out.println("-------------");


        Set<String> set1 = Stream.of("a","a","bb")
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(set1);

    }
}
