package chapter_8.c_8_1.c_8_1_1;

import chapter_8.c_8_1.Note;
import chapter_8.c_8_1.Wind;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:45 2019/12/27
 */
public class Music2 {

    public static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }


    public static void tune(Stringed i) {
        i.play(Note.MIDDLE_C);
    }


    public static void tune(Brass i) {
        i.play(Note.MIDDLE_C);
    }


    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute); // No upcasting
        tune(violin);
        tune(frenchHorn);
    }
}
