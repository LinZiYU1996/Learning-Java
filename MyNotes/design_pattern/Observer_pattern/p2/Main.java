package design_pattern.Observer_pattern.p2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/20
 * \* Time: 21:34
 * \* Description:
 * \
 */
public class Main {


    public static void main(String[] args) {

        // 创建主题对象
        ConcreteSubject subject = new ConcreteSubject();
        // 创建观察者对象
        Observer observer = new ConcreteObserver();
        // 将观察者对象注册到主题对象上
        subject.attach(observer);
        // 改变主题对象的状态
        subject.change("new state");


    }
}
