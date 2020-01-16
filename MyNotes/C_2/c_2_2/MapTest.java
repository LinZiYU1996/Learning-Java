package C_2.c_2_2;

import java.util.HashMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 11:11
 * \* Description:
 * \
 */
public class MapTest {

    public static void main(String[] args)
    {
        Map map = new HashMap();
        // 成对放入多个key-value对
        map.put("Java" , 109);
        map.put("iOS" , 10);
        map.put("Ajax" , 79);
        // 多次放入的key-value对中value可以重复
        map.put("Java EE" , 99);


        // 放入重复的key时，新的value会覆盖原有的value
        // 如果新的value覆盖了原有的value，该方法返回被覆盖的value

        System.out.println(map.put("iOS" , 99)); // 输出10

        System.out.println(map); // 输出的Map集合包含4个key-value对


        // 判断是否包含指定key
        System.out.println("是否包含值为 iOS key："
                + map.containsKey("iOS")); // 输出true


        // 判断是否包含指定value
        System.out.println("是否包含值为 99 value："
                + map.containsValue(99)); // 输出true
        // 获取Map集合的所有key组成的集合，通过遍历key来实现遍历所有key-value对

        for (Object key : map.keySet() )
        {
            // map.get(key)方法获取指定key对应的value
            System.out.println(key + "-->" + map.get(key));
        }

        map.remove("Ajax"); // 根据key来删除key-value对。
        System.out.println(map);
    }
}
