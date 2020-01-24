package JDK_8.chapter_2.c_2_1.c_2_1_1.random_test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/24
 * \* Time: 21:38
 * \* Description:
 * \
 */
public class RandomTest {


//    枚举类中随机获取枚举

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++){
            System.out.println(Enums.random(WeekEnum.class) );
        }
    }

}
