package chapter_8.c_8_1.c_8_1_1;

import chapter_8.c_8_1.Instrument;
import chapter_8.c_8_1.Note;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:45 2019/12/27
 */
public class Brass extends Instrument {

    public void play(Note n) {
        print("Brass.play() " + n);
    }


}
