package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Distinct_Example;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:39
 * \* Description:
 * \
 */
public class DistinctWithUserObjects {


    public static void main(String[] args) {


        //In this example we have a list of user object. The class will override hashCode() and equals() in order to get distinct elements.
        List<Book> list = new ArrayList<>();
        {
            list.add(new Book("Core Java", 200));
            list.add(new Book("Core Java", 200));
            list.add(new Book("Learning Freemarker", 150));
            list.add(new Book("Spring MVC", 300));
            list.add(new Book("Spring MVC", 300));
        }
        long l = list.stream().distinct().count();
        System.out.println("No. of distinct books:"+l);
        list.stream().distinct().forEach(b -> System.out.println(b.getName()+ "," + b.getPrice()));
    }
}
