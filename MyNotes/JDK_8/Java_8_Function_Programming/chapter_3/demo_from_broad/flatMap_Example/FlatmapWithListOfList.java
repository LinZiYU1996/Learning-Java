package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.flatMap_Example;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:38
 * \* Description:
 * \
 */
public class FlatmapWithListOfList {

//Stream flatMap with List of Lists
//Here we will use flatMap with list of lists. We are creating two lists and each list is containing the objects of Book. Finally I am adding these two lists in a third list. We will find out the book with minimum price.
    public static void main(String[] args) {

        List<Book> list1 = Arrays.asList(new Book(10, "AAA"), new Book(20, "BBB"));
        List<Book> list2 = Arrays.asList(new Book(30, "XXX"), new Book(15, "ZZZ"));
        List<List<Book>> finalList = Arrays.asList(list1, list2);


        Book book = finalList.stream()
                .flatMap(list -> list.stream())
                .min(new BookComparator())
                .get();

        System.out.println("Name:"+book.getName()+", Price:"+ book.getPrice() );

    }
}
