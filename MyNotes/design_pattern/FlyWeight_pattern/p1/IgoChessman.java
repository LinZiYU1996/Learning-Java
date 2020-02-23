package design_pattern.FlyWeight_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/23
 * \* Time: 21:38
 * \* Description:
 * \
 */
public abstract class IgoChessman {


    //围棋享元抽象类


    //共享抽象方法棋子的颜色
    public abstract String chessColor();

    public void display() {
        System.out.println("棋子:"+this.chessColor());
    }


}
