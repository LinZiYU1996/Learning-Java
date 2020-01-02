package chapter_11.chapter_11_1;

import java.util.ArrayList;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:14 2020/1/2
 */
public class ApplesAndOrangesWithoutGenerics {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ArrayList apples = new ArrayList();

        for(int i = 0; i < 3; i++)
            apples.add(new Apple());

// Not prevented from adding an Orange to apples:

        apples.add(new Orange());


        for(int i = 0; i < apples.size(); i++)
            ((Apple)apples.get(i)).id();
// Orange is detected only at run time


    }
}
