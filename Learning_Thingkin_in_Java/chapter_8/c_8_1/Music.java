package chapter_8.c_8_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:41 2019/12/27
 */
public class Music {

//    乐器进行演奏
    public static void tune(Instrument i) {
// ...
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // Upcasting
    }
}
