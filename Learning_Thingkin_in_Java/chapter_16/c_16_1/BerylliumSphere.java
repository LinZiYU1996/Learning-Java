package chapter_16.c_16_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:59 2020/1/6
 */
public class BerylliumSphere {
    private static long counter;
    private final long id = counter++;
    public String toString() { return "Sphere " + id; }
}
