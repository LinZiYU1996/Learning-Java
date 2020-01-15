package C_1.c_1_9;

import java.util.Collection;
import java.util.HashSet;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/15
 * \* Time: 22:36
 * \* Description:
 * \
 */
public class ForeachTest {

    public static void main(String[] args) {

        // 创建集合、添加元素的代码与前一个程序相同
        Collection books = new HashSet();
        books.add(new String("1"));
        books.add(new String("2"));
        books.add(new String("3"));
        for (Object obj : books)
        {
            // 此处的book变量也不是集合元素本身
            String book = (String)obj;
            System.out.println(book);
            if (book.equals("3"))
            {
                // 下面代码会引发ConcurrentModificationException异常
                books.remove(book);     //①
            }
        }
        System.out.println(books);

    }
}
