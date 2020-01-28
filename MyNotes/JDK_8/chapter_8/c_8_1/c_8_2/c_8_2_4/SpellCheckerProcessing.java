package JDK_8.chapter_8.c_8_1.c_8_2.c_8_2_4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 17:01
 * \* Description:
 * \
 */
public class SpellCheckerProcessing extends ProcessingObject<String>{

    @Override
    protected String handleWork(String text) {
        return text.replaceAll("labda", "lambda");
    }
}
