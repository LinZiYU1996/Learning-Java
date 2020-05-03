package oschina.Java.generic.pack1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/27
 * \* Time: 11:02
 * \* Description:
 * \
 */
public class ImplTest extends AbstractA implements InterfaceA<Integer>{

    //public class ImplTest extends AbstractA implements InterfaceA<String> {
// ImplTest类实现InterfaceA接口时声明的泛型参数是String,AbstractA实现InterfaceA时声明的泛型参数是 Integer,这时就不可以了，
// 如果可以会导致类型冲突,比如 get方法，在AbstractA中返回值是Integer,但是在ImplTest中就变成了String，无论重载或重写都不能解决这个问题


}
