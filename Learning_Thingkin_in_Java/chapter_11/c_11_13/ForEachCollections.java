package chapter_11.c_11_13;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:48 2020/1/2
 */
public class ForEachCollections {

    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<String>();
        Collections.addAll(cs,
                "Take the long way home".split(" "));
        for(String s : cs)
            System.out.print("‘" + s + "‘ ");
    }


}
