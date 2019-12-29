package chapter_9.c_9_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:53 2019/12/29
 */
public class Adventure {

    public static void t(CanFight x) { x.fight(); }
    public static void u(CanSwim x) { x.swim(); }

    public static void v(CanFly x) { x.fly(); }
    public static void w(ActionCharacter x) { x.fight(); }
    public static void main(String[] args) {
        Hero h = new Hero();
        h.fight();
//        t(h); // Treat it as a CanFight
//        u(h); // Treat it as a CanSwim
//        v(h); // Treat it as a CanFly
//        w(h); // Treat it as an ActionCharacter
    }



}
