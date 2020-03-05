package Effective.P10.A1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/5
 * \* Time: 17:41
 * \* Description:
 * \
 */
public class Point {

    //传递性：子类增加的信息会影响到equals的比较结果。我们首先以一个简单的不可变的二维整数型Point类作为开始：

    private final int x;

    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {

        if ( !(obj instanceof Point)) {
            return false;
        }

        Point p = (Point) obj;

        return p.x == x && p.y == y;

    }
}
