package chapter_19.c_19_6;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 11:59
 * \* Description:
 * \
 */
public class RandomTest {

    public static void main(String[] args) {

        for(int i = 0; i < 20; i++)
            System.out.print(Enums.random(Activity.class) + " " + "\n");

    }
}
