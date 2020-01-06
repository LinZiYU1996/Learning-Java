package chapter_15.c_15_9.d2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:15 2020/1/6
 */
public class CanineHero <POWER extends SuperHearing & SuperSmell>
        extends SuperHero<POWER>{

    CanineHero(POWER power) { super(power); }
    void hear() { power.hearSubtleNoises(); }
    void smell() { power.trackBySmell(); }


}
