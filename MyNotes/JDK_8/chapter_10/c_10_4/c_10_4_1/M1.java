package JDK_8.chapter_10.c_10_4.c_10_4_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 22:14
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"one");

        String s = map.get(3);

//        null
        System.out.println(s);

        Optional<Object> o = Optional.ofNullable(map.get(3));

        System.out.println(o);


    }
}
