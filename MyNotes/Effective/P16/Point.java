package Effective.P16;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/12
 * \* Time: 20:51
 * \* Description:
 * \
 */
public class Point {

    /*

    public 不应该这么使用
    class Point{
    public double x;
   public double y;

方法:

私有域 + 公有访问方法(getter)

     */

    private double x;

    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
