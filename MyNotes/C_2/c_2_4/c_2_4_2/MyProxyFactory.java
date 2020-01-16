package C_2.c_2_4.c_2_4_2;

import java.lang.reflect.Proxy;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 15:18
 * \* Description:
 * \
 */
public class MyProxyFactory {

    // 为指定target生成动态代理对象
    public static Object getProxy(Object target)
            throws Exception
    {
        // 创建一个MyInvokationHandler对象
        MyInvokationHandler handler =
                new MyInvokationHandler();
        // 为MyInvokationHandler设置target对象
        handler.setTarget(target);
        // 创建、并返回一个动态代理
        return Proxy.newProxyInstance(target.getClass().getClassLoader()
                , target.getClass().getInterfaces() , handler);
    }
}
