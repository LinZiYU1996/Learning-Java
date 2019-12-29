package chapter_9.c_9_3.c_9_3_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:44 2019/12/29
 */
public class BandPass extends Filter{

    double lowCutoff, highCutoff;
    public BandPass(double lowCut, double highCut) {
        lowCutoff = lowCut;
        highCutoff = highCut;
    }
    public Waveform process(Waveform input) { return input; }


}
