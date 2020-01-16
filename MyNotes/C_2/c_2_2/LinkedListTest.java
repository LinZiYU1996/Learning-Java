package C_2.c_2_2;

import java.util.LinkedList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 11:08
 * \* Description:
 * \
 */
public class LinkedListTest {

    public static void main(String[] args)
    {
        LinkedList books = new LinkedList();
        // 将字符串元素加入队列的尾部
        books.offer("Java");
        // 将一个字符串元素加入栈的顶部
        books.push("Java EE");
        // 将字符串元素添加到队列的头部（相当于栈的顶部）
        books.offerFirst("Android");
        // 以List的方式（按索引访问的方式）来遍历集合元素
        for (int i = 0; i < books.size() ; i++ )
        {
            System.out.println("遍历中：" + books.get(i));
        }

        System.out.println("___________________________________");
        // 访问、并不删除栈顶的元素
        System.out.println(books.peekFirst());
        // 访问、并不删除队列的最后一个元素
        System.out.println(books.peekLast());
        // 将栈顶的元素弹出“栈”
        System.out.println(books.pop());
        // 下面输出将看到队列中第一个元素被删除
        System.out.println(books);
        // 访问、并删除队列的最后一个元素
        System.out.println(books.pollLast());


        System.out.println(books);
    }


}
