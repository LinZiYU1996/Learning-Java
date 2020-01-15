package C_1.c_1_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/15
 * \* Time: 18:06
 * \* Description:
 * \
 */
public class DiamondTest {

    public static void main(String[] args)
    {
        // Java自动推断出ArrayList的<>里应该是String
        List<String> books = new ArrayList<>();
        books.add("Java");
        books.add("Android");
        // 遍历books集合，集合元素就是String类型
        books.forEach(ele -> System.out.println(ele.length()));
        // Java自动推断出HashMap的<>里应该是String , List<String>
        Map<String , List<String>> schoolsInfo = new HashMap<>();
        // Java自动推断出ArrayList的<>里应该是String
        List<String> schools = new ArrayList<>();
        schools.add("斜月三星洞");
        schools.add("西天取经路");
        schoolsInfo.put("孙悟空" , schools);
        // 遍历Map时，Map的key是String类型，value是List<String>类型
        schoolsInfo.forEach((key , value) -> System.out.println(key + "-->" + value));
    }
}
