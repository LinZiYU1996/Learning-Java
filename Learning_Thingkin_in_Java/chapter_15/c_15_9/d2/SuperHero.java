package chapter_15.c_15_9.d2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:14 2020/1/6
 */
public class SuperHero<POWER extends SuperPower> {

    POWER power;
    SuperHero(POWER power) { this.power = power; }
    POWER getPower() { return power; }


}
