package JDK_8.chapter_3.c_3_6.c_3_6_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 16:09
 * \* Description:
 * \
 */
public class Orange extends Fruit{

    private String color;

    private int weight;

    public Orange(String color) {
        this.color = color;
    }

    public Orange(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
