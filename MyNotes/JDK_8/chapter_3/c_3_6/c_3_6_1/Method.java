package JDK_8.chapter_3.c_3_6.c_3_6_1;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 13:37
 * \* Description:
 * \
 */
public class Method {

    public static void main(String[] args) {

        List<String> str = Arrays.asList("a","b","A","B");

        str.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

        System.out.println(str);

//        这个例子可
//以用方法引用改写成下面的样子：

        List<String> str_1 = Arrays.asList("a","b","A","B");
        str_1.sort(String::compareToIgnoreCase);

        System.out.println(str_1);


    }
}
