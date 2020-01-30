package JDK_8.Java_8_Function_Programming.chapter_3.A2;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 20:34
 * \* Description:
 * \
 */
public class M2 {


    public static void main(String[] args) {


        TreeSet<Integer> treeSet = Stream.of(1,2,3,4,5)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(treeSet);


        HashSet<Integer> hashSet = Stream.of(1,2,3,4,5)
                .collect(Collectors.toCollection(HashSet::new));


        System.out.println(hashSet);


    }
}
