package chapter_15.folder.f1;

import java.util.*;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 18:52 2020/1/7
 */
public class LostInformation {


    public static void main(String[] args) {


        List<Apple> apples = new ArrayList<>();

        Map<Apple,Orange> map = new HashMap<>();

        Pear<Apple> pear = new Pear<>();

        Watermelon<Long,String> watermelon = new Watermelon<>();

        System.out.println(Arrays.toString(
                apples.getClass().getTypeParameters()
        ));

        System.out.println("______________________________________");

        System.out.println(Arrays.toString(
                map.getClass().getTypeParameters()
        ));

        System.out.println("______________________________________");

        System.out.println(Arrays.toString(
                pear.getClass().getTypeParameters()
        ));

        System.out.println("______________________________________");

        System.out.println(Arrays.toString(
                watermelon.getClass().getTypeParameters()
        ));

    }
}
