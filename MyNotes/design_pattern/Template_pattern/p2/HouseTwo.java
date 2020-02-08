package design_pattern.Template_pattern.p2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/7
 * \* Time: 20:36
 * \* Description:
 * \
 */
public class HouseTwo extends HouseTemplate{


    public HouseTwo(String name) {

        super(name);
    }

    @Override
    protected void buildDoor() {
        System.out.println(name + "的门采用木门");

    }

    @Override
    protected void buildWindow() {
        System.out.println(name + "的窗户要向南");

    }

    @Override
    protected void buildWall() {
        System.out.println(name + "的墙使用玻璃制造");

    }

    @Override
    protected void buildBase() {
        System.out.println(name + "的地基使用花岗岩");

    }
}
