package design_pattern.Template_pattern.p2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/7
 * \* Time: 20:34
 * \* Description:
 * \
 */
public abstract class HouseTemplate {

    protected String name;
    protected HouseTemplate(String name) {
        this.name = name;
    }
    protected abstract void buildDoor();

    protected abstract void buildWindow();

    protected abstract void buildWall();

    protected abstract void buildBase();

    //公共逻辑
    public final void buildHouse(){

        buildBase();
        buildWall();
        buildDoor();
        buildWindow();

    }

}
