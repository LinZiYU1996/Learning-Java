package C_1.c_1_9;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/15
 * \* Time: 22:31
 * \* Description:
 * \
 */
public class IteratorErrorTest {

    public static void main(String[] args) {

        // 创建集合、添加元素的代码与前一个程序相同
        Collection books = new HashSet();
        books.add("1");
        books.add("2");
        books.add("3");
        // 获取books集合对应的迭代器
        Iterator it = books.iterator();
        while(it.hasNext())
        {
            String book = (String)it.next();
            System.out.println(book);
            if (book.equals("2"))
            {
                // 使用Iterator迭代过程中，不可修改集合元素,下面代码引发异常
                books.remove(book);
            }
        }

    }
}
