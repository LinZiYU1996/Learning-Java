package JDK_8.Java_8_Function_Programming.chapter_3.A6.a1;

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
 * \* Time: 19:43
 * \* Description:
 * \
 */
public class M3 {

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
                .forEach(b -> System.out.println(b.getName() + "," + b.getPrice()));

    }
        //distinctByKey()方法返回一个使用ConcurrentHashMap 来维护先前所见状态的 Predicate 实例
    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;

    }
}
