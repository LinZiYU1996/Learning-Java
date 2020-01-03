package chapter_12.c_12_6.c_12_6_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:56 2020/1/3
 */
public class WhoCalled {

    static void f() {
// Generate an exception to fill in the stack trace
        try {
            throw new Exception();
        } catch (Exception e) {
            for(StackTraceElement ste : e.getStackTrace())
                System.out.println(ste.getMethodName());
        }
    }
    static void g() { f(); }
    static void h() { g(); }
    public static void main(String[] args) {
        f();
        System.out.println("--------------------------------");
        g();
        System.out.println("--------------------------------");
        h();
    }
}
