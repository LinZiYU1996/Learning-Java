package chapter_17.c_17_2.c_17_2_1;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:33 2020/1/6
 */
public class CollectionDataTest {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>(
                new CollectionData<String>(new Government(), 15));
// Using the convenience method:
        set.addAll(CollectionData.list(new Government(), 15));
        System.out.println(set);
    }
}
