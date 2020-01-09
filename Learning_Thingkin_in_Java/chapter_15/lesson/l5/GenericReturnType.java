package chapter_15.lesson.l5;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 13:03
 * \* Description:
 * \
 */
public class GenericReturnType {

    void test(Getter g){

        Getter res = g.get();

        GenericGetter gg = g.get();
    }
}
