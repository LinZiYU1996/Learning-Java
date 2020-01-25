package JDK_8.chapter_3.c_3_6.c_3_6_2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 16:07
 * \* Description:
 * \
 */
public class Method_3 {


    static Map<String, Function<String,Fruit>> map = new HashMap<>();

    static {

        map.put("apple1",Apple::new);
        map.put("orange",Orange::new);
        map.put("watermelon",WaterMelon::new);

    }

    public static Fruit get(String fruit,Integer weight){
        return map.get(fruit).apply(fruit);
    }


    public static void main(String[] args) {



    }
}
