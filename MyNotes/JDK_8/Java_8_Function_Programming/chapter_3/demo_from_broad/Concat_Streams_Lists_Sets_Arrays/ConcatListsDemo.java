package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Concat_Streams_Lists_Sets_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:33
 * \* Description:
 * \
 */
public class ConcatListsDemo {


    //In this example we have two lists. These lists will be converted into streams then they will be concatenated using concat() method. The output stream will be converted into List using Collectors.toList(). To get distinct element, we need to use Stream.distinct() .
    public static void main(String[] args) {

        List<Book> list1 = new ArrayList<>();
        List<Book> list2 = new ArrayList<>();
        {
            list1.add(new Book("Core Java", 200));
            list1.add(new Book("Spring MVC", 300));
            list1.add(new Book("Learning Freemarker", 150));

            list2.add(new Book("Core Java", 200));
            list2.add(new Book("Spring MVC", 300));
            list2.add(new Book("Learning Hibernate", 400));
        }

        List<Book> list = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        list.forEach(b->System.out.println(b.getName()+", "+ b.getPrice()));


        System.out.println("------------------------------------------------");
        //Remove duplicates using distinct()
        System.out.println("--Remove duplicates using distinct()--");
        list = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
        list.forEach(b->System.out.println(b.getName()+", "+ b.getPrice()));

    }
}