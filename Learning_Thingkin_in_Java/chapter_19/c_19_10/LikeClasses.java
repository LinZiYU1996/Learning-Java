package chapter_19.c_19_10;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

public enum LikeClasses {

    WINKEN { void behavior() { print("Behavior1"); } },

    BLINKEN { void behavior() { print("Behavior2"); } },

    NOD { void behavior() { print("Behavior3"); } };

    abstract void behavior();

}
