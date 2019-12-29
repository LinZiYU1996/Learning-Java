package chapter_9.c_9_3.c_9_3_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:43 2019/12/29
 */
public class Filter {

    public String name() {
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input) { return input; }


}
