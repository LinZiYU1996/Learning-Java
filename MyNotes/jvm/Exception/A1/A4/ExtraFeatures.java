package jvm.Exception.A1.A4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/21
 * \* Time: 19:46
 * \* Description:
 * \
 */
public class ExtraFeatures {

    public static void f() throws MyException2 {
        System.out.println("from f");
        throw new MyException2();
    }

    public static void g() throws MyException2 {
        System.out.println("from g");
        throw new MyException2("origin in g");
    }

    public static void h() throws MyException2 {
        System.out.println("from h");
        throw new MyException2("origin in h",4545);
    }

    public static void main(String[] args) {

        try {
            f();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
        }

        try {
            g();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
        }

        try {
            h();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
            System.out.println("e val == " + e.val());
        }

/*
from f
jvm.Exception.A1.A4.MyException2: Detail Message0 null
	at jvm.Exception.A1.A4.ExtraFeatures.f(ExtraFeatures.java:15)
	at jvm.Exception.A1.A4.ExtraFeatures.main(ExtraFeatures.java:31)
from g
jvm.Exception.A1.A4.MyException2: Detail Message0 origin in g
	at jvm.Exception.A1.A4.ExtraFeatures.g(ExtraFeatures.java:20)
	at jvm.Exception.A1.A4.ExtraFeatures.main(ExtraFeatures.java:37)
from h
jvm.Exception.A1.A4.MyException2: Detail Message4545 origin in h
	at jvm.Exception.A1.A4.ExtraFeatures.h(ExtraFeatures.java:25)
	at jvm.Exception.A1.A4.ExtraFeatures.main(ExtraFeatures.java:43)
e val == 4545
 */
    }
}
