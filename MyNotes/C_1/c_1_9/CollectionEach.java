package C_1.c_1_9;

import java.util.Collection;
import java.util.HashSet;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/15
 * \* Time: 22:26
 * \* Description:
 * \
 */
public class CollectionEach {

    public static void main(String[] args)
    {
        // 创建一个集合
        Collection books = new HashSet();
        books.add("Java");
        books.add("Java9");
        books.add("Android");
        // 调用forEach()方法遍历集合
        books.forEach(obj -> System.out.println("迭代集合元素：" + obj));
    }
}
