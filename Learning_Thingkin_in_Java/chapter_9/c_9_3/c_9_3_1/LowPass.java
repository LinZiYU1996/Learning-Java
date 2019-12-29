package chapter_9.c_9_3.c_9_3_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:43 2019/12/29
 */
public class LowPass extends Filter{

    double cutoff;
    public LowPass(double cutoff) { this.cutoff = cutoff; }
    public Waveform process(Waveform input) {
        return input; // Dummy processing
    }


}
