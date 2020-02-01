package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.flatMap_Example;

import java.util.Comparator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:36
 * \* Description:
 * \
 */
public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        if (b1.getPrice() > b2.getPrice()) {
            return 1;
        } else if (b1.getPrice() == b2.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }
}
