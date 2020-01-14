package C_1.c_1_4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/14
 * \* Time: 17:33
 * \* Description:
 * \
 */
class Useful
{
    public void d(){System.out.println("d()") ;}
    public void f(){System.out.println("f()") ;}
}

class MoreUseful extends Useful
{
    public void d(){System.out.println("More.d()") ;}
    public void f(){System.out.println("More.f()") ;}
    public void u(){}
    public void g(){}
}

public class Main
{
    public static void main(String args[])
    {
        Useful[] x = {new Useful() , new MoreUseful()} ;
        x[0].f() ;
        x[1].d() ;
        ((MoreUseful)x[1]).u() ;

//        Exception in thread "main" java.lang.ClassCastException: C_1.c_1_4.Useful cannot be cast to C_1.c_1_4.MoreUseful
        ((MoreUseful)x[0]).g() ;    //编译时通过,运行时会产生ClassCastException
    }
}