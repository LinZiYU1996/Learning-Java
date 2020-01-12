package chapter_17.demo.d9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 10:34
 * \* Description:
 * \
 */
public class FailFast {

    public static void main(String[] args) {

        Collection<String> c = new ArrayList<>();

        Iterator<String> it = c.iterator();

        c.add("dad");

//        java.util.ConcurrentModificationException
//        String s = it.next();


    }
}
