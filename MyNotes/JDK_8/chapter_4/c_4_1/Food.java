package JDK_8.chapter_4.c_4_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 16:38
 * \* Description:
 * \
 */
public class Food {

    private String name;

    private int calory;

    public Food(String name, int calory) {
        this.name = name;
        this.calory = calory;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", calory=" + calory +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getCalory() {
        return calory;
    }
}
