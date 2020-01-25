package JDK_8.chapter_3.c_3_6.test_3_7;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 16:19
 * \* Description:
 * \
 */
public class Method {

    public static void main(String[] args) {

        TriFunction<Integer,Integer,Integer,Color> colorTriFunction
                = Color::new;

        Color color = colorTriFunction.apply(454,445,5455);

        System.out.println(color);

    }
}
