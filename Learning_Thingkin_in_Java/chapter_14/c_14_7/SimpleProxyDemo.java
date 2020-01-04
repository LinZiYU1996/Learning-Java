package chapter_14.c_14_7;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:00 2020/1/4
 */
public class SimpleProxyDemo {

    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }


}
