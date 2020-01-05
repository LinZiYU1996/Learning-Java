package chapter_14.c_14_7;

import java.lang.reflect.Proxy;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:29 2020/1/4
 */
public class SimpleDynamicProxy {

//    通过调用静态方法Proxy.newProxylnstanceO可以创建动态代理，这个方法蒂要得到一个类加载器
//    （你通常可以从已经被加载的对象中获取其类加载器，然后传递给它），
//    一个你希望该代理实现的接口列表（不是类或抽象类）， 以及InvocationHandler接口的一个实现。
//    动态代理可以将所有调用重定向到调用处理器，
//    因此通常会向调用处理器的构造器传递给一个 “实际” 对象的引用，
//    从而使得调用处理器在执行其中介任务时， 可以将请求转发。

    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
// Insert a proxy and call again:
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{ Interface.class },
                new DynamicProxyHandler(real));
        consumer(proxy);
    }


}
