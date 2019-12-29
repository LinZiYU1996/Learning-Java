package chapter_9.c_9_5.c_9_5_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:03 2019/12/29
 */
public class C4 extends C implements I3{

    // Identical, no problem:
    public int f() { return 1; }


    // Methods differ only by return type:
//! class C5 extends C implements I1 {}
//! interface I4 extends I1, I3 {} ///:~
}
