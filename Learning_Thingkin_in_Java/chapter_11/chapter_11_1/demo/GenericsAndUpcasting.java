package chapter_11.chapter_11_1.demo;

import java.util.ArrayList;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:34 2020/1/2
 */
public class GenericsAndUpcasting {

    public static void main(String[] args) {

        ArrayList<People> peoples = new ArrayList<>();

        peoples.add(new Chinese());

        peoples.add(new Janpanse());

        for (People people : peoples) {
            people.where();
        }


    }
}
