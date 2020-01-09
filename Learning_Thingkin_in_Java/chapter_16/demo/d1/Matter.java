package chapter_16.demo.d1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 15:24
 * \* Description:
 * \
 */
public class Matter {

    private static long counter;

    private final long id = counter++;

    @Override
    public String toString() {
        return "Matter{" +
                "id=" + id +
                '}';
    }
}
