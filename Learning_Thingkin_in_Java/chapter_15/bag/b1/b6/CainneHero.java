package chapter_15.bag.b1.b6;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 21:46
 * \* Description:
 * \
 */
public class CainneHero<P extends SuperHearing & SuperSmell> extends SuperHero<P>{

    public CainneHero(P p) {
        super(p);
    }

    void hear(){
        p.hearSubtleNoises();
    }

    void smell(){
        p.trackBySmell();
    }

}
