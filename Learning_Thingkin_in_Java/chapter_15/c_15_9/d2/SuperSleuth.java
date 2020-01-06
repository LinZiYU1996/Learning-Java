package chapter_15.c_15_9.d2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:14 2020/1/6
 */
public class SuperSleuth<POWER extends XRayVision>
        extends SuperHero<POWER> {

    SuperSleuth(POWER power) { super(power); }
    void see() { power.seeThroughWalls(); }

}
