package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Distinct_Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:40
 * \* Description:
 * \
 */
public class DistinctByProperty {


    //distinct() does not provide distinct elements by property or key. It works on the basis of hashCode() and equals(). If we want distinct element by a property or key, we can achieve it by a work around code. Find the code snippet.


    public static void main(String[] args) {



        List<Book> list = new ArrayList<>();
        {
            list.add(new Book("Core Java", 200));
            list.add(new Book("Core Java", 300));
            list.add(new Book("Learning Freemarker", 150));
            list.add(new Book("Spring MVC", 200));
            list.add(new Book("Hibernate", 300));
        }
        list.stream().filter(distinctByKey(b -> b.getName()))
                .forEach(b -> System.out.println(b.getName()+ "," + b.getPrice()));
    }
    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object,Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

}
