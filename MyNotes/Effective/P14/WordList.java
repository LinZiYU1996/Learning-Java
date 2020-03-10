package Effective.P14;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/10
 * \* Time: 21:18
 * \* Description:
 * \
 */
public class WordList {


    public static void main(String[] args) {

        Set<String> s = new TreeSet<>();

        Collections.addAll(s,args);

        System.out.println(s);

        /*
        []
         */

    }
}
