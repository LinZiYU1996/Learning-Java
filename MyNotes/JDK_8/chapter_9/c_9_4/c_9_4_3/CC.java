package JDK_8.chapter_9.c_9_4.c_9_4_3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 20:58
 * \* Description:
 * \
 */
public class CC implements B,A{

    @Override
    public void hello() {
        B.super.hello();
    }
}
