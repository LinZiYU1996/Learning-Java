package C_1.c_1_8.c_1_8_2;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/15
 * \* Time: 21:25
 * \* Description:
 * \
 */
public class ErasureTest2 {

    public static void main(String[] args)
    {
        List<Integer> li = new ArrayList<>();
        li.add(6);
        li.add(9);
        List list = li;
        // 下面代码引起“未经检查的转换”的警告，编译、运行时完全正常
        List<String> ls = list;     // ①

//        Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        // 但只要访问ls里的元素，如下面代码将引起运行时异常。
        System.out.println(ls.get(0));
    }


}
