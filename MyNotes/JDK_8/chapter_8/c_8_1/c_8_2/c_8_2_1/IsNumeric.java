package JDK_8.chapter_8.c_8_1.c_8_2.c_8_2_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 16:28
 * \* Description:
 * \
 */
public class IsNumeric implements ValidationStrategy{


    @Override
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}
