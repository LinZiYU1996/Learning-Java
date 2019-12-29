package chapter_9.c_9_3.c_9_3_3;


import chapter_9.c_9_3.c_9_3_1.BandPass;
import chapter_9.c_9_3.c_9_3_1.HighPass;
import chapter_9.c_9_3.c_9_3_1.LowPass;
import chapter_9.c_9_3.c_9_3_1.Waveform;
import chapter_9.c_9_3.c_9_3_2.Apply;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:50 2019/12/29
 */
public class FilterProcessor {

    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)), w);
        Apply.process(new FilterAdapter(new HighPass(2.0)), w);
        Apply.process(
                new FilterAdapter(new BandPass(3.0, 4.0)), w);
    }

}
