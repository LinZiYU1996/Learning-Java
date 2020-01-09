package chapter_15.lesson.l8;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 15:08
 * \* Description:
 * \
 */
public class Apple {
    private static int count = 1;
    private final int id = count++;

    public void getId(){
        System.out.println(id);
    }
}
