package design_pattern.Observer_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/20
 * \* Time: 21:30
 * \* Description:
 * \
 */
public class Main {

    public static void main(String[] args) {
//定义两个观察者
        MyObserver o1 = new RealObserver1("段友1");
        MyObserver o2 = new RealObserver2("段友2");

        //定义一个主题
        MySubject subject = new RealSubject();
        //添加观察者
        subject.addObserver(o1);
        subject.addObserver(o2);
        //发布消息通知观察者
        subject.notifyObservers("内涵段子TV已下架！");


    }
}
