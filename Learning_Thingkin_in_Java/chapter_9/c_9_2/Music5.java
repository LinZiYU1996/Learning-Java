package chapter_9.c_9_2;

import chapter_8.c_8_1.Note;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:23 2019/12/29
 */
public class Music5 {

    // Doesn’t care about type, so new types
// added to the system still work right:
    static void tune(Instrument i) {
// ...
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e) {
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
