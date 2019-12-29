package chapter_9.c_9_2;

import chapter_8.c_8_1.Note;

public interface Instrument {

    // Compile-time constant:
    int VALUE = 5; // static & final
    // Cannot have method definitions:
    void play(Note n); // Automatically public
    void adjust();


}
