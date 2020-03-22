package jvm.Exception.A1.A2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/21
 * \* Time: 18:13
 * \* Description:
 * \
 */
public class FellConstructors {

    public static void g() throws MyException {
        System.out.println("g");
        throw new MyException("g()");
    }

    public static void f() throws MyException {
        System.out.println("f");
        throw new MyException();
    }


    public static void main(String[] args) {


        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }

        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }

    /*
    f
jvm.Exception.A1.A2.MyException
	at jvm.Exception.A1.A2.FellConstructors.f(FellConstructors.java:20)
	at jvm.Exception.A1.A2.FellConstructors.main(FellConstructors.java:28)
g
jvm.Exception.A1.A2.MyException: g()
	at jvm.Exception.A1.A2.FellConstructors.g(FellConstructors.java:15)
	at jvm.Exception.A1.A2.FellConstructors.main(FellConstructors.java:34)
     */
}
