package chapter_15.lesson.l3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 11:48
 * \* Description:
 * \
 */
public class UnconStrained {

    public static void main(String[] args) {

        BasicOther b = new BasicOther();

        BasicOther b2 = new BasicOther();

        b.setElement(new Other());

        Other other = b.getElement();

        b.f();

    }
}
