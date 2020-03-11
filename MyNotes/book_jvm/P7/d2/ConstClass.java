package book_jvm.P7.d2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/11
 * \* Time: 19:55
 * \* Description:
 * \
 */
public class ConstClass {

    static {
        System.out.println("ConstClass init");
    }


    public static final String STRING = "hello world";
}
