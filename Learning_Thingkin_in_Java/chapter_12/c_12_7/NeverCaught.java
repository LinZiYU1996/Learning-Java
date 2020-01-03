package chapter_12.c_12_7;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:04 2020/1/3
 */
public class NeverCaught {

    static void f() {
        throw new RuntimeException("From f()");
    }
    static void g() {
        f();
    }
    public static void main(String[] args) {
        g();
    }



}
