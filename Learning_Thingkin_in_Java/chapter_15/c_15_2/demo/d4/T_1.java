package chapter_15.c_15_2.demo.d4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:24 2020/1/7
 */
public class T_1 {

    public static void main(String[] args) {

        Map<Orange, List<? extends Fruit>> maps =
                new HashMap<Orange, List<? extends Fruit>>();


        System.out.println(maps);
    }
}
