package C_1.c_1_9;

import java.util.Collection;
import java.util.HashSet;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/15
 * \* Time: 22:46
 * \* Description:
 * \
 */
public class PredicateTest {

    public static void main(String[] args) {

        // 创建一个集合
        Collection books = new HashSet();
        books.add(new String("1"));
        books.add(new String("2dnkjadjadjadhjka"));
        books.add(new String("3"));
        books.add(new String("4fflsjfksjdfksjfidsjfisj"));
        books.add(new String("5"));
        // 使用Lambda表达式（目标类型是Predicate）过滤集合
        books.removeIf(ele -> ((String)ele).length() < 10);
        System.out.println(books);

    }
}
