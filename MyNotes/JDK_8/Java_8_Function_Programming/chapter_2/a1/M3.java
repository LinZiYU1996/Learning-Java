package JDK_8.Java_8_Function_Programming.chapter_2.a1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 20:45
 * \* Description:
 * \
 */
public class M3 {

    final static String STRING = "hello";

    interface Greet{
        void say(String Msg);
    }

    public static void main(String[] args) {

        Greet greet = Msg ->
        {
            System.out.println(STRING + Msg);
        };

        greet.say("lolo");

    }
}
