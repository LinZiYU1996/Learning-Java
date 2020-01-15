package C_1.c_1_8;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/15
 * \* Time: 18:00
 * \* Description:
 * \
 */
public class GenericList {

    public static void main(String[] args)
    {
        // 创建一个只想保存字符串的List集合
        List<String> strList = new ArrayList<String>();  // ①
        strList.add("Java");
        strList.add("Android");
        // 下面代码将引起编译错误
//		strList.add(5);    // ②
        strList.forEach(str -> System.out.println(str.length())); // ③
    }
}
