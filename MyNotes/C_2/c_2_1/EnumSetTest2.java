package C_2.c_2_1;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 10:36
 * \* Description:
 * \
 */
public class EnumSetTest2 {

    public static void main(String[] args)
    {
        Collection c = new HashSet();
        c.clear();
        c.add(Season.FALL);
        c.add(Season.SPRING);
        // 复制Collection集合中所有元素来创建EnumSet集合
        EnumSet enumSet = EnumSet.copyOf(c);   // ①
        System.out.println(enumSet); // 输出[SPRING,FALL]
        c.add("Java");
        c.add("C++");
        // 下面代码出现异常：因为c集合里的元素不是全部都为枚举值
        enumSet = EnumSet.copyOf(c);  // ②
    }
}
