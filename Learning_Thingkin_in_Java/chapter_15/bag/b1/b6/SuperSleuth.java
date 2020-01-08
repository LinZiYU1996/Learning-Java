package chapter_15.bag.b1.b6;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 21:45
 * \* Description:
 * \
 */
public class SuperSleuth<P extends XrayVersion> extends SuperHero<P>{

    public SuperSleuth(P p) {
        super(p);
    }

    void see(){
        p.seeThroughWalls();
    }
}
