package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Collectors_Examples;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:09
 * \* Description:
 * \
 */
public class ToMapExample {

//Collectors.toMap
//Collectors.toMap collects the stream element as Map. We need to define function to generate key and value for stream input value.


    public static void main(String[] args) {

        Map<String,String> map = Stream.of("AA","BB","CC").collect(Collectors.toMap(k->k, v->v+v));
        map.forEach((k,v)->System.out.println("key:"+k +"  value:"+v));


    }
}
