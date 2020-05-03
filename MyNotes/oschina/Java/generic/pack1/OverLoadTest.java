package oschina.Java.generic.pack1;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/27
 * \* Time: 11:03
 * \* Description:
 * \
 */
public class OverLoadTest {

/*
不能通过不同的泛型参数进行方法重载，
但是可以使用 <R extends List<?>> 给泛型参数添加边界重载方法


 */
    public <T> void test(T t) { }

    // 因为T与R没有设置边界在运行时 T与R 都是类似Object，所以不能通过方法签名区分这两个方法
//    public <R> void test(R r) { }

    // 这样是可以的 因为R一定会是一个List的子类，List与Object（T）是有区别的，就可以通过方法签名区分了
    public <R extends List<?>> void test(R r) {    }


}
