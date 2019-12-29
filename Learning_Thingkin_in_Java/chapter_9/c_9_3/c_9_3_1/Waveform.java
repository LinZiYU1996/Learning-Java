package chapter_9.c_9_3.c_9_3_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:43 2019/12/29
 */
public class Waveform {

    private static long counter;
    private final long id = counter++;
    public String toString() { return "Waveform " + id; }


}
