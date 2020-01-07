package chapter_15.demo.d3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:14 2020/1/7
 */
public class CountedObject {

    private static long counter = 0;

    private final long id = counter++;

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "CountedObject" + id;
    }
}
