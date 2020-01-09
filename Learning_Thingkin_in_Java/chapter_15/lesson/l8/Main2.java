package chapter_15.lesson.l8;

import java.util.ArrayList;

import static chapter_15.lesson.l8.Full.fill;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 15:08
 * \* Description:
 * \
 */
public class Main2 {

    public static void main(String[] args) {

        ArrayList<Apple> list = new ArrayList<>();
        for(int i=0; i<10; ++i){
            list.add(new Apple());
        }
        try {
            fill(list, Apple.class.getMethod("getId"),null);
        } catch (NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }

    }
}
