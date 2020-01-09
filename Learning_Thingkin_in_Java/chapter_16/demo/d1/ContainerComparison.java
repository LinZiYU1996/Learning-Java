package chapter_16.demo.d1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 15:24
 * \* Description:
 * \
 */
public class ContainerComparison {

    public static void main(String[] args) {

        Matter[] matters = new Matter[20];

        for (int i = 0; i < 5; i++) {
            matters[i] = new Matter();
        }

        System.out.println(Arrays.toString(matters));

        System.out.println("________________________________");

        System.out.println(matters[4]);

        System.out.println("________________________________");

        List<Matter> matterList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            matterList.add(new Matter());

        }

        System.out.println("________________________________");


        System.out.println(matterList);

        System.out.println("________________________________");

        System.out.println(matterList.get(4));

        System.out.println("________________________________");

        int[] integers = {0,1,2,3,4,5};

        System.out.println(Arrays.toString(integers));

        System.out.println("________________________________");

        System.out.println(integers[4]);

        System.out.println("________________________________");

        List<Integer> integerList = new ArrayList<>(Arrays.asList(0,1,2,3,4,5));

        System.out.println(integerList);

        System.out.println("________________________________");

        System.out.println(integerList.get(4));
    }
}
