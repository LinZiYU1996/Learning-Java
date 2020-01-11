package chapter_17.demo.d6;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/11
 * \* Time: 15:52
 * \* Description:
 * \
 */
public class Groundhog {

    protected int number;

    public Groundhog(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Groundhog{" +
                "number=" + number +
                '}' + "\n";
    }
}
