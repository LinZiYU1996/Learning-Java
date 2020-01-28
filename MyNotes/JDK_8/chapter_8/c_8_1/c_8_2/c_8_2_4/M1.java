package JDK_8.chapter_8.c_8_1.c_8_2.c_8_2_4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 17:02
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        ProcessingObject<String> p1 = new HeaderTextProcessing();
        ProcessingObject<String> p2 = new SpellCheckerProcessing();


//        将两个处理对//象链接起来
        p1.setSuccessor(p2);

        String result = p1.handle("Aren't labdas really sexy?!!");
        System.out.println(result);

    }
}
