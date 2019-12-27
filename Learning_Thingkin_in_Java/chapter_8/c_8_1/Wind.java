package chapter_8.c_8_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:40 2019/12/27
 */
public class Wind extends Instrument{

//  Wind是一个具体的乐器
    // Redefine interface method:
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }


}
