package chapter_12.c_12_9;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:41 2020/1/3
 */
abstract class Inning {

    public Inning() throws BaseballException {}
    public void event() throws BaseballException {
// Doesn’t actually have to throw anything
    }
    public abstract void atBat() throws Strike, Foul;
    public void walk() {} // Throws no checked exceptions



}
