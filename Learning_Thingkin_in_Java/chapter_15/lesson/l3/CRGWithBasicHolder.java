package chapter_15.lesson.l3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 11:43
 * \* Description:
 * \
 */
public class CRGWithBasicHolder {

    public static void main(String[] args) {

        Subtype subtype = new Subtype();

        Subtype subtype2 = new Subtype();

        subtype.setElement(subtype2);

        Subtype subtype3 = subtype.getElement();

        subtype.f();

    }
}
