package design_pattern.Proxy_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/24
 * \* Time: 21:13
 * \* Description:
 * \
 */
public class Main {


    public static void main(String[] args) {

        //目标对象
        UserDao target = new UserDao();

        //代理对象,把目标对象传给代理对象,建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(target);

        proxy.save();//执行的是代理的方法

    }
}
