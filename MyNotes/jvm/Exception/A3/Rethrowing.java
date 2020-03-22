package jvm.Exception.A3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/21
 * \* Time: 19:58
 * \* Description:
 * \
 */
public class Rethrowing {

    public static void f() throws Exception {
        System.out.println("orgin in f()");
        throw new Exception("throw from f()");
    }

    public static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("inside g e.p");
            e.printStackTrace(System.out);
            throw  e;
        }
    }

    public static void h() throws Throwable {
        try {
            f();
        } catch (Exception e) {
            System.out.println("inside h e p");
            e.printStackTrace(System.out);
            throw e.fillInStackTrace();
        }
    }

    public static void main(String[] args) throws Throwable {

        try {
            g();
        } catch (Exception e) {
            System.out.println("main print");
            e.printStackTrace(System.out);
        }

        try {
            h();
        } catch (Exception e) {
            System.out.println("main print");
            e.printStackTrace(System.out);
        }


    }
}

/*
orgin in f()
inside g e.p
java.lang.Exception: throw from f()
	at jvm.Exception.A3.Rethrowing.f(Rethrowing.java:15)
	at jvm.Exception.A3.Rethrowing.g(Rethrowing.java:20)
	at jvm.Exception.A3.Rethrowing.main(Rethrowing.java:41)
main print
java.lang.Exception: throw from f()
	at jvm.Exception.A3.Rethrowing.f(Rethrowing.java:15)
	at jvm.Exception.A3.Rethrowing.g(Rethrowing.java:20)
	at jvm.Exception.A3.Rethrowing.main(Rethrowing.java:41)
orgin in f()
inside h e p
java.lang.Exception: throw from f()
	at jvm.Exception.A3.Rethrowing.f(Rethrowing.java:15)
	at jvm.Exception.A3.Rethrowing.h(Rethrowing.java:30)
	at jvm.Exception.A3.Rethrowing.main(Rethrowing.java:48)
main print
java.lang.Exception: throw from f()
	at jvm.Exception.A3.Rethrowing.h(Rethrowing.java:34)
	at jvm.Exception.A3.Rethrowing.main(Rethrowing.java:48)
 */