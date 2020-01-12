package chapter_19.c_19_7;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 15:07
 * \* Description:
 * \
 */
public class Meal {

//    从每一个Course实例随机选择一个food 生成一份菜单
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            for (Course course : Course.values()) {

                Food food = course.randomSelection();

                System.out.println(food);

            }

            System.out.println("-------------");
        }

    }
}
