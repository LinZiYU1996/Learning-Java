package chapter_17.demo.d1;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/10
 * \* Time: 9:49
 * \* Description:
 * \
 */
public class CollectionDaraTest {

    public static void main(String[] args) {

        Set<String> strings = new LinkedHashSet<>(
                new CollectionData<>(new Goverment(),15)
        );

        strings.addAll(CollectionData.list(new Goverment(),15));

        System.out.println(strings);

    }
}
