package chapter_14.c_14_7.d;

import java.lang.reflect.Proxy;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:01 2020/1/5
 */
public class SelectingMethods {

    public static void main(String[] args) {
        SomeMethods proxy= (SomeMethods) Proxy.newProxyInstance(
                SomeMethods.class.getClassLoader(),
                new Class[]{ SomeMethods.class },
                new MethodSelector(new Implementation()));
        proxy.boring1();
        proxy.boring2();
        proxy.interesting("bonobo");
        proxy.boring3();
    }


}
