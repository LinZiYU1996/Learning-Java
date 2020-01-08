package chapter_15.bag.b1.b6;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 21:44
 * \* Description:
 * \
 */
public class SuperHero<P extends SuperPower> {

    P p;

    public SuperHero(P p) {
        this.p = p;
    }

    public P getP() {
        return p;
    }
}
