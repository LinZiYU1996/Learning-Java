package design_pattern.FlyWeight_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/23
 * \* Time: 22:03
 * \* Description:
 * \
 */
public class Main {


    public static void main(String[] args) {


        IgoChessman b1,b2,w1,w2;
        IgoChessmanFactory igoChessmanFactory;
        //获取对应的工厂对象
        igoChessmanFactory = IgoChessmanFactory.getIgoChessmanFactory();
        //判断是不是同一个对象。就是看是不是共享了。
        System.out.println(igoChessmanFactory);
        b1 = IgoChessmanFactory.getIgoChessman("黑");
        b2= IgoChessmanFactory.getIgoChessman("黑");
        System.out.println(b1==b2);
        w1 =IgoChessmanFactory.getIgoChessman("白");
        w2 =IgoChessmanFactory.getIgoChessman("白");
        System.out.println(w1==w2);
        b1.display();
        w1.display();
        w2.display();
        b2.display();




    }
}
