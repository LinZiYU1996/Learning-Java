package C_2.c_2_1;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 10:40
 * \* Description:
 * \
 */


class A
{
    public boolean equals(Object obj)
    {
        return true;
    }
}
public class ListTest2
{
    public static void main(String[] args)
    {
        List books = new ArrayList();
        books.add(new String("Java"));
        books.add(new String("C++"));
        books.add(new String("Android"));
        System.out.println(books);
        // 删除集合中A对象，将导致第一个元素被删除
        books.remove(new A());     // ①
        System.out.println(books);
        // 删除集合中A对象，再次删除集合中第一个元素
        books.remove(new A());     // ②
        System.out.println(books);
    }
}