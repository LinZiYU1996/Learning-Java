package design_pattern.FlyWeight_pattern.p1;

import java.util.HashMap;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/23
 * \* Time: 22:02
 * \* Description:
 * \
 */
public class IgoChessmanFactory {

    //首先私有化自己的类
    private static IgoChessmanFactory igoChessmanFactory = new IgoChessmanFactory();
    //创建享元池
    private static  HashMap<String,IgoChessman > ht;

    //私有化构造函数自己创建自己 。
    private  IgoChessmanFactory() {
        //创建对应的棋子放进去.
        ht= new HashMap<String,IgoChessman >();
        IgoChessman white,black;
        white = new WhiteChessman();
        ht.put("白",white);
        black = new BlackChessman();
        //放入HASHTABLE
        ht.put("黑",black);

    }

    //提供一个全局访问的方法。
    /**
     *
     * <p>Title: getIgoChessmanFactory</p>
     * <p>Description: </p>
     * @return IgoChessmanFactory
     */
    public static IgoChessmanFactory getIgoChessmanFactory() {
        return igoChessmanFactory;
    }

    //工厂方法创建对象
    public  static IgoChessman getIgoChessman(String name) {

        return(IgoChessman)ht.get(name);

    }







}
