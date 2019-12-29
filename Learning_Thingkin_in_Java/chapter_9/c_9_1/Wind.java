package chapter_9.c_9_1;

import chapter_8.c_8_1.Note;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:17 2019/12/29
 */
public class Wind extends Instrument{

    public void play(Note n) {
        print("Wind.play() " + n);
    }
    public String what() { return "Wind"; }
    public void adjust() {}


}
