package chapter_12.c_12_10;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:48 2020/1/3
 */
public class NeedsCleanup {

    private static long counter = 1;
    private final long id = counter++;
    public void dispose() {
        System.out.println("NeedsCleanup " + id + " disposed");
    }

}
