package chapter_9.c_9_1;

import chapter_8.c_8_1.Note;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:16 2019/12/29
 */
abstract class Instrument {

    private int i; // Storage allocated for each


    public abstract void play(Note n);
    public String what() { return "Instrument"; }

    public abstract void adjust();

}
