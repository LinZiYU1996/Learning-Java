package jvm.ji_ke_shi_jian.P7.A1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/21
 * \* Time: 17:55
 * \* Description:
 * \
 */
public class T1 {

    static int remainder(int dividend, int divisor)
            throws DivideByZeroException {
        try {
            return dividend % divisor;
        }
        catch (ArithmeticException e) {
            throw new DivideByZeroException();
        }
    }


    public static void main(String[] args) throws DivideByZeroException {

        System.out.println(remainder(1,0));

        //Exception in thread "main" jvm.ji_ke_shi_jian.P7.A1.DivideByZeroException
        //	at jvm.ji_ke_shi_jian.P7.A1.T1.remainder(T1.java:19)
        //	at jvm.ji_ke_shi_jian.P7.A1.T1.main(T1.java:26)




    }
}
