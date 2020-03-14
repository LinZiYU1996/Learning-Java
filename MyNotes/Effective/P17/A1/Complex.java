package Effective.P17.A1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/13
 * \* Time: 21:10
 * \* Description:
 * \
 */
public class Complex {

    /*

    确保不变性 类绝对不允许自身被子类化

    除了   使类成为final这种方法外

    还有一种更加灵活的办法可以做到



     */

    private final double re;

    private final double im;

    private Complex(double re,double im){
        this.re = re;
        this.im = im;
    }

    public static Complex valueOf(double re,double im) {
        return new Complex(re,im);
    }
}
