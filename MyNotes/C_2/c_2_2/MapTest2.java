package C_2.c_2_2;

import java.util.HashMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 11:13
 * \* Description:
 * \
 */
public class MapTest2 {

    public static void main(String[] args)
    {
        Map map = new HashMap();
        // 成对放入多个key-value对
        map.put("Java" , 109);
        map.put("iOS" , 99);
        map.put("Ajax" , 79);
        // 尝试替换key为"XML"的value，由于原Map中没有对应的key，
        // 因此对Map没有改变，不会添加新的key-value对
        map.replace("XML" , 66);
        System.out.println(map);
        // 使用原value与参数计算出来的结果覆盖原有的value
        map.merge("iOS" , 10 ,
                (oldVal , param) -> (Integer)oldVal + (Integer)param);


        System.out.println(map);

        // 当key为"Java"对应的value为null（或不存在时），使用计算的结果作为新value
        map.computeIfAbsent("Java" , (key)->((String)key).length());

        System.out.println(map); // map中添加了 Java=4 这组key-value对

        // 当key为"Java"对应的value存在时，使用计算的结果作为新value
        map.computeIfPresent("Java",
                (key , value) -> (Integer)value * (Integer)value);

        System.out.println(map);
    }


}
