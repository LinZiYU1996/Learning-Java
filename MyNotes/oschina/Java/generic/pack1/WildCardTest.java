package oschina.Java.generic.pack1;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/27
 * \* Time: 11:04
 * \* Description:
 * \
 */
public class WildCardTest <T extends List<String> & Iterable<String> & InterfaceAA<?>>  {

    public void test(T t) {
        t.add("");  // List接口的方法
        t.iterator(); // Iterable接口的方法
        t.testMethod(); // InterfaceA方法
    }

}
interface InterfaceAA<T>{

    //    void add(T t); // List接口也有同样方法签名的方法，所以在 同时将 List与InterfaceA设置为上边界时List与InterfaceA的泛型参数要兼容，否则也会出错
    void testMethod();

}
