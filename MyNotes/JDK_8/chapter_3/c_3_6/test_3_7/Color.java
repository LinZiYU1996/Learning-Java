package JDK_8.chapter_3.c_3_6.test_3_7;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 16:19
 * \* Description:
 * \
 */
public class Color {

    private int a1;

    private int a2;

    private int a3;

    public Color(int a1, int a2, int a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    @Override
    public String toString() {
        return "Color{" +
                "a1=" + a1 +
                ", a2=" + a2 +
                ", a3=" + a3 +
                '}';
    }
}
