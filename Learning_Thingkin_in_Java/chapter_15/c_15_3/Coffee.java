package chapter_15.c_15_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:24 2020/1/5
 */
public class Coffee {

    private static long counter = 0;
    private final long id = counter++;
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }


}
