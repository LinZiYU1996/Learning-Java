package chapter_8.c_8_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:27 2019/12/28
 */
public class CovariantReturn {

    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
        m = new WheatMill();
        g = m.process();
        System.out.println(g);
    }


}
