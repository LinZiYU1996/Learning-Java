package C_1.c_1_9;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/15
 * \* Time: 22:28
 * \* Description:
 * \
 */
public class IteratorTest {

    public static void main(String[] args)
    {
        // 创建集合、添加元素的代码与前一个程序相同
        Collection books = new HashSet();
        books.add("1");
        books.add("2");
        books.add("3");
        // 获取books集合对应的迭代器
        Iterator it = books.iterator();
        while(it.hasNext())
        {
            // it.next()方法返回的数据类型是Object类型，因此需要强制类型转换
            String book = (String)it.next();
            System.out.println(book);
            if (book.equals("2"))
            {
                // 从集合中删除上一次next方法返回的元素
                it.remove();
            }
            // 对book变量赋值，不会改变集合元素本身
            book = "测试字符串";   //①
        }
        System.out.println(books);
    }
}
