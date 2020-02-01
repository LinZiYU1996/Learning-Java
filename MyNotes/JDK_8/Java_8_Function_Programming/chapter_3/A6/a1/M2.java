package JDK_8.Java_8_Function_Programming.chapter_3.A6.a1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 19:38
 * \* Description:
 * \
 */
public class M2 {

    public static <T> Predicate<T> distinctByKey(Function<? super T,Object> keyExtractor){

        Map<Object,Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t),Boolean.TRUE) == null;
    }


    public static void main(String[] args) {

        Person lokesh = new Person(1, "Lokesh", "Gupta");
        Person brian = new Person(2, "Brian", "Clooney");
        Person alex = new Person(3, "Alex", "Kolen");

        Collection<Person> list = Arrays.asList(
                lokesh,brian,alex,lokesh,brian,lokesh);


//        List<Person> distinctElements = list.stream()
//                .filter( distinctByKey()
//                .collect( Collectors.toList() );
    }
}
