package chapter_15.folder.f7;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 20:11
 * \* Description:
 * \
 */
public class IntegerFactory implements Factory<Integer> {

    @Override
    public Integer create() {
        return new Integer(0);
    }
}
