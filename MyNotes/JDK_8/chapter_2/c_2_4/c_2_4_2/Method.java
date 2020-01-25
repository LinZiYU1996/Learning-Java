package JDK_8.chapter_2.c_2_4.c_2_4_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 10:42
 * \* Description:
 * \
 */
public class Method {

    public static void main(String[] args) {


//        用Lambda表达式

        Thread thread = new Thread(
                ()->
                {
                    System.out.println("hello");
                }
        );

        thread.start();
    }
}
