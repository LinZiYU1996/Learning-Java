package chapter_11.chapter_11_1;

import java.util.ArrayList;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:16 2020/1/2
 */
public class ApplesAndOrangesWithGenerics {

    public static void main(String[] args) {

        ArrayList<Apple> apples = new ArrayList<Apple>();

        for(int i = 0; i < 3; i++)
            apples.add(new Apple());


// Compile-time error:
// apples.add(new Orange());


        for(int i = 0; i < apples.size(); i++)
            System.out.println(apples.get(i).id());

// Using foreach:
        for(Apple c : apples)
            System.out.println(c.id());

    }
}
