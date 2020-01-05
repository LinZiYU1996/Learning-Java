package chapter_14.c_14_7;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:00 2020/1/4
 */
public class SimpleProxyDemo {

//    因为consumer()接受的Interface,所以它无法知道正在获得的到底是Rea.lObject还是
//    SimpleProxy, 因为这二者都实现了Interface。但是SimpleProxy已经被插人到了客户端和
//    RealObject之间， 因此它会执行操作， 然后调用RealObject上相同的方法。

    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        consumer(new RealObject());
        System.out.println("___________________________________________");
        consumer(new SimpleProxy(new RealObject()));
    }


}
