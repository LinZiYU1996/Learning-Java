package JDK_8.chapter_6.c_6_3.c_6_3_1;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;
import JDK_8.chapter_6.c_6_3.CaloricLevel;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 10:25
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<Dish> menu = Data.create();


        Map<Dish.Type,Map<CaloricLevel,List<Dish>>> dishesByTypeCaloricLevel =

                menu.stream()
                .collect(
                        groupingBy(Dish::getType,
                                groupingBy(dish ->
                                {
                                    if (dish.getCalories() <=400) return CaloricLevel.DIET;
                                    else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                                    else return CaloricLevel.FAT;
                                }))
                );


        System.out.println(dishesByTypeCaloricLevel);
//        {
//        OTHER={
//        NORMAL=
//        [Dish
//        {name='french fries', vegetarian=true, calories=530, type=OTHER}, Dish{name='pizza', vegetarian=true, calories=550, type=OTHER}], DIET=[Dish{name='rice', vegetarian=true, calories=350, type=OTHER}, Dish{name='season fruit', vegetarian=true, calories=120, type=OTHER}]}, FISH={NORMAL=[Dish{name='salmon', vegetarian=false, calories=450, type=FISH}], DIET=[Dish{name='prawns', vegetarian=false, calories=300, type=FISH}]}, MEAT={FAT=[Dish{name='pork', vegetarian=false, calories=800, type=MEAT}], NORMAL=[Dish{name='beef', vegetarian=false, calories=700, type=MEAT}], DIET=[Dish{name='chicken', vegetarian=false, calories=400, type=MEAT}]}}


//        两级 Map


//        这里的外层 Map 的键就是第一级分类函数生成的值：“fish, meat, other”，而这个 Map 的值又是
//一个 Map ，键是二级分类函数生成的值：“normal, diet, fat”。最后，第二级 map 的值是流中元素构
//成的 List ，是分别应用第一级和第二级分类函数所得到的对应第一级和第二级键的值：“salmon、
//pizza…” 这种多级分组操作可以扩展至任意层级，n级分组就会得到一个代表n级树形结构的n级
//Map 。


    }
}
