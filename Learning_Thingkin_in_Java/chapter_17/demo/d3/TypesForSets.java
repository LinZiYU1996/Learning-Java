package chapter_17.demo.d3;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/10
 * \* Time: 21:47
 * \* Description:
 * \
 */
public class TypesForSets {

    static <T> Set<T> fill(Set<T>  set,Class<T> type){
        for (int i = 0; i < 10; i++) {
            try {
                set.add(
                        type.getConstructor(int.class).newInstance(i));
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }

        }
        return set;
    }

    static <T> void test(Set<T> set,Class<T> type){
        fill(set,type);

        fill(set,type);

        fill(set,type);

        System.out.println(set);
    }

    public static void main(String[] args) {

        test(new HashSet<HashType>(),HashType.class);

        System.out.println("___________________________________");

        test(new LinkedHashSet<HashType>(),HashType.class);

        System.out.println("___________________________________");

        test(new TreeSet<TreeType>(),TreeType.class);


    }
}
