package JDK_8.chapter_2.c_2_1.c_2_1_1;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/24
 * \* Time: 21:32
 * \* Description:
 * \
 */
public class filterGreenApples {

//筛选绿苹果

    public static List<Apple> filterGreenApples_1(List<Apple> inventory) {
        List<Apple> result = new ArrayList<Apple>();
        for(Apple apple: inventory){
            if( "green".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }


    public static void main(String[] args) {

        List<Apple> apples = CreateDataForApple.create();

        System.out.println(filterGreenApples_1(apples));


    }


//    农民改主意了，他还想要筛选红苹果。
//你该怎么做呢？简单的解决办法就是复制这个方法，把名字改成 filterRedApples ，然后更改
//if 条件来匹配红苹果。然而，要是农民想要筛选多种颜色：浅绿色、暗红色、黄色等，这种方法
//就应付不了了。一个良好的原则是在编写类似的代码之后，尝试将其抽象化。
}
