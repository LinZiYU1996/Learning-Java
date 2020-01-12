package chapter_19.c_19_10;

import static chapter_6.c_6_1.c_6_1_3.Print.print;
import static chapter_6.c_6_1.c_6_1_3.Print.printnb;

public enum OverrideConstantSpecific {

//    是否可以覆盖常量相关的方法呢？ 当然可以

    NUT, BOLT,

    WASHER {
        void f() { print("Overridden method"); }
    };

    void f() { print("default behavior"); }

    public static void main(String[] args) {
        for(OverrideConstantSpecific ocs : values()) {
            printnb(ocs + ": ");
            ocs.f();
        }
    }


}
