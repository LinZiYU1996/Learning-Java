package C_2.c_2_1;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 10:43
 * \* Description:
 * \
 */
public class ListTest3 {

    public static void main(String[] args) {

        List books = new ArrayList();
        // 向books集合中添加4个元素
        books.add(new String("Java"));
        books.add(new String("C++"));
        books.add(new String("Android"));
        books.add(new String("iOS"));
        // 使用目标类型为Comparator的Lambda表达式对List集合排序
        books.sort((o1, o2)->((String)o1).length() - ((String)o2).length());
        System.out.println(books);
        // 使用目标类型为UnaryOperator的Lambda表达式来替换集合中所有元素
        // 该Lambda表达式控制使用每个字符串的长度作为新的集合元素
        books.replaceAll(ele->((String)ele).length());
        System.out.println(books);


    }
}
