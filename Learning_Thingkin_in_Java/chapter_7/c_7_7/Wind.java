package chapter_7.c_7_7;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:22 2019/12/26
 */
public class Wind extends Instrument{

    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute); // Upcasting
    }
}
