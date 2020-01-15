package C_1.c_1_8.c_1_8_2;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/15
 * \* Time: 21:34
 * \* Description:
 * \
 */
public class GenericAndArray {

    public static void main(String[] args)
    {
//		// 下面代码编译时有“[unchecked] 未经检查的转换”警告
//		List<String>[] lsa = new ArrayList[10];
//		// 将lsa向上转型为Object[]类型的变量
//		Object[] oa = lsa;
//		List<Integer> li = new ArrayList<>();
//		li.add(3);
//		oa[1] = li;
//		// 下面代码引起ClassCastException异常
//		String s = lsa[1].get(0);              // ①

        List<?>[] lsa = new ArrayList<?>[10];
        Object[] oa = lsa;
        List<Integer> li = new ArrayList<>();
        li.add(3);
        oa[1] = li;
        Object target = lsa[1].get(0);
        if (target instanceof String)
        {
            // 下面代码安全了
            String s = (String) target;
        }
    }

}
