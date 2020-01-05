package chapter_14.c_14_7.d;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:00 2020/1/5
 */
public class MethodSelector implements InvocationHandler {

    private Object proxied;
    public MethodSelector(Object proxied) {
        this.proxied = proxied;
    }
    public Object
    invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        if(method.getName().equals("interesting"))
            print("Proxy detected the interesting method");
        return method.invoke(proxied, args);
    }


}
