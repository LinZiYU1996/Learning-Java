package chapter_15.c_15_4.c_15_4_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:11 2020/1/5
 */
public class CountedObject {

    private static long counter = 0;
    private final long id = counter++;
    public long id() { return id; }
    public String toString() { return "CountedObject " + id;}


}
