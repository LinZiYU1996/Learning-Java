package chapter_8.c_8_2.c_8_2_3;

import chapter_8.c_8_1.Note;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:01 2019/12/27
 */
public class Brass extends Wind{

    void play(Note n) { print("Brass.play() " + n); }
    void adjust() { print("Adjusting Brass"); }



}
