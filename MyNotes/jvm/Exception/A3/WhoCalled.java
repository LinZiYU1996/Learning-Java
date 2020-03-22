package jvm.Exception.A3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/21
 * \* Time: 19:55
 * \* Description:
 * \
 */
public class WhoCalled {


    static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace()) {
                System.out.println(ste.getMethodName());
            }
        }
    }

    static void g() {
        f();
    }

    static void h() {
        g();
    }

    public static void main(String[] args) {

        f();

        System.out.println("------------------------------");

        g();

        System.out.println("------------------------------");

        h();



    }
    /*
    f
main
------------------------------
f
g
main
------------------------------
f
g
h
main
     */
}
