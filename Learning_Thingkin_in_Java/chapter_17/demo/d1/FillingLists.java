package chapter_17.demo.d1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/10
 * \* Time: 9:40
 * \* Description:
 * \
 */
public class FillingLists {

    public static void main(String[] args) {

        List<StringAddress> list = new ArrayList<>(
                Collections.nCopies(4,new StringAddress("World"))
        );

        System.out.println(list);

        System.out.println("________________________________________");

        Collections.fill(list,new StringAddress("World"));

        System.out.println(list);


    }
}
