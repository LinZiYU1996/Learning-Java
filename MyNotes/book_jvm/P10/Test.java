package book_jvm.P10;

import java.util.HashMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/16
 * \* Time: 10:57
 * \* Description:
 * \
 */
public class Test {


    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("1","1");

        map.put("2","1");

        map.put("3","1");

        System.out.println(map.get("1"));



    }
}
