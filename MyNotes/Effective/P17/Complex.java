package Effective.P17;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/13
 * \* Time: 20:59
 * \* Description:
 * \
 */
public class Complex {

    /*

    这个类表示一个复数

    具有实部 和 虚部

    其中的四种算术运算如何创建并返回新的实例 而不是修改这个实例

    大多数重要的不可变的类都使用了这种模式  叫做 函数的方法



     */

    private final double re;

    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart() {
        return re;
    }

    public double imaginaryPart() {
        return im;
    }

    public Complex plus(Complex complex) {

        return new Complex(re+complex.re,im+complex.im);
    }

    public Complex minus(Complex complex) {
        return new Complex(re-complex.re,im-complex.im);
    }

    public Complex times(Complex complex) {
        return new Complex(re*complex.re - im*complex.im,
                re*complex.im + im*complex.re);
    }

    public Complex dividedBt(Complex complex) {
        double tmp = complex.re * complex.re + complex.im * complex.im;
        return new Complex((re*complex.re+im*complex.im)/tmp,
                (im * complex.re * re*complex.im)/tmp);
    }

    @Override
    public int hashCode() {
        return  31*Double.hashCode(re) + Double.hashCode(im);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if ( !(obj instanceof Complex)) {
            return false;
        }

        Complex c = (Complex) obj;

        return Double.compare(c.re,re) == 0
        && Double.compare(c.im,im) == 0;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "re=" + re +
                ", im=" + im +
                '}';
    }
}
