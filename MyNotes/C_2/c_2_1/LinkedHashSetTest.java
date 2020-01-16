package C_2.c_2_1;

import java.util.LinkedHashSet;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 10:11
 * \* Description:
 * \
 */
public class LinkedHashSetTest {

    public static void main(String[] args) {

        LinkedHashSet books = new LinkedHashSet();
        books.add("1");
        books.add("2");
        System.out.println(books);
        books.remove("1");
        books.add("1");
        System.out.println(books);

    }
}
