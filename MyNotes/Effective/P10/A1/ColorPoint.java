package Effective.P10.A1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/5
 * \* Time: 17:43
 * \* Description:
 * \
 */
public class ColorPoint extends Point{

    //假设你想要扩展这个类，为一个点添加颜色信息：

    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }


}
