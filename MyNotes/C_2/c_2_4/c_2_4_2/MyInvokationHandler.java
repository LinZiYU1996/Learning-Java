package C_2.c_2_4.c_2_4_2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 15:17
 * \* Description:
 * \
 */
public class MyInvokationHandler implements InvocationHandler {

    // 需要被代理的对象
    private Object target;
    public void setTarget(Object target)
    {
        this.target = target;
    }
    // 执行动态代理对象的所有方法时，都会被替换成执行如下的invoke方法
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Exception
    {
        DogUtil du = new DogUtil();
        // 执行DogUtil对象中的method1。
        du.method1();
        // 以target作为主调来执行method方法
        Object result = method.invoke(target , args);
        // 执行DogUtil对象中的method2。
        du.method2();
        return result;
    }
}
