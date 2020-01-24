package JDK_8.chapter_2.c_2_1.c_2_1_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/24
 * \* Time: 21:35
 * \* Description:
 * \
 */
public class CreateDataForApple {


    private static int random=(int)(Math.random()*10);// 生成种子
    private static Random rand = new Random(random);



    public static List<Apple> create(){
        List<Apple> apples = new ArrayList<>();
        String[] colors = {
                "red",
                "blue",
                "green",
                "white",
                "black"
        };

        for (int i = 0; i < 20; i++) {

            apples.add(new Apple(colors[rand.nextInt(colors.length)]));
        }

        return apples;
    }


    public static List<Apple> create_2(){
        List<Apple> apples = new ArrayList<>();
        String[] colors = {
                "red",
                "blue",
                "green",
                "white",
                "black"
        };

        for (int i = 0; i < 30; i++) {
            Apple apple = new Apple();
            apple.setColor(colors[rand.nextInt(colors.length)]);
            apple.setWeight(rand.nextInt(500));
            apples.add(apple);
        }

        return apples;
    }

    public static void main(String[] args) {

        System.out.println(create_2());
    }
}
