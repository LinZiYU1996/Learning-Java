package chapter_8.c_8_2.c_8_2_3;

import chapter_8.c_8_1.Note;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:01 2019/12/27
 */
public class Music3 {

    // Doesn’t care about type, so new types
// added to the system still work right:
    public static void tune(Instrument i) {
// ...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {
// Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }


}
