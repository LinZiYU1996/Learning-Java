package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.flatMap_Example;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:36
 * \* Description:
 * \
 */
public class FlatmapWithList {


    public static void main(String[] args) {

        List<Book> books = Arrays.asList(new Book(10, "AAA"), new Book(20, "BBB"));
        Writer w1 = new Writer("Mohan", books);
        books = Arrays.asList(new Book(30, "XXX"), new Book(15, "ZZZ"));
        Writer w2 = new Writer("Sohan", books);
        List<Writer> writers = Arrays.asList(w1, w2);

        Book book = writers.stream()
                .flatMap(writer ->
                        writer.getBooks().stream())
                .max(new BookComparator())
                .get();

        System.out.println("Name:"+book.getName()+", Price:"+ book.getPrice() );


    }
}
