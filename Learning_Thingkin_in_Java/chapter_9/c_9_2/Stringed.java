package chapter_9.c_9_2;

import chapter_8.c_8_1.Note;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:22 2019/12/29
 */
public class Stringed implements Instrument{

    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() { return "Stringed"; }
    public void adjust() { print(this + ".adjust()"); }


}
