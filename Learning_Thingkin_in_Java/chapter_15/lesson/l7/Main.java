package chapter_15.lesson.l7;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 14:51
 * \* Description:
 * \
 */
public class Main {

    public static void main(String[] args) {

        Original original = new Original();

        Basket basket =
                new AppleDecorator(new BananaDecorator(original));

        basket.show();


    }
}
