package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Concat_Streams_Lists_Sets_Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:36
 * \* Description:
 * \
 */
public class ConcatSetsDemo {


    //In this example we have two sets. These sets will be converted into streams then they will be concatenated using concat() method. The output stream will be converted into Set using Collectors.toSet().
    public static void main(String[] args) {


        Set<Book> set1 = new HashSet<>();
        Set<Book> set2 = new HashSet<>();
        {
            set1.add(new Book("Core Java", 200));
            set1.add(new Book("Spring MVC", 300));
            set1.add(new Book("Learning Freemarker", 150));

            set2.add(new Book("Core Java", 200));
            set2.add(new Book("Spring MVC", 300));
            set2.add(new Book("Learning Hibernate", 400));
        }
        Set<Book> set = Stream.concat(set1.stream(), set2.stream()).collect(Collectors.toSet());

        set.forEach(b->System.out.println(b.getName()+", "+ b.getPrice()));
    }
}
