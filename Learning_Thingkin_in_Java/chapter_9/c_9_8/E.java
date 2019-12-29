package chapter_9.c_9_8;

public interface E {
    interface G {
        void f();
    }
    // Redundant "public":
    public interface H {
        void f();
    }
    void g();
// Cannot be private within an interface:
//! private interface I {}

}
