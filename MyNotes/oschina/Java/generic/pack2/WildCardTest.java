package oschina.Java.generic.pack2;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/27
 * \* Time: 11:05
 * \* Description:
 * \
 */
public class WildCardTest <T extends List<String> & Iterable<String> & InterfaceAAA<?>>  {

    /*
    通配符在泛型中的应用是为了解决下面的问题：有一个容器的泛型是基类的变量，
    想要将一个泛型是子类的容器赋值给这个变量，编译器是不允许的；因为运行时会将泛型擦除，
    一旦将一个泛型是子类的容器赋值给泛型是基类的容器变量，在运行时就可以将一个这个基类的其他子类对象放入这个窗口，
    造成在取出对象时的类型不安全，所以编译期不允许这样赋值;


     */
    public static void main(String[] args) {
        List<InterfaceAAA<String>> list ;
        List<Impl> impls = new ArrayList<>();
//        list = impls;
        // 将 impls赋值给 list是不可以的，原因：
        // 1. 编译期 List<InterfaceA<String>> 与 List<Impl>是不同的且不能向上转型
        // 2. 一旦允许这样赋值，那么之后 的操作会出现类型问题，比如此例，将一个ArrayList<Impl> 赋值给 List<InterfaceA>变量list，
        // 那么之后可以向list 中add 一个 Impl2对象，Impl2与Impl不兼容
    }

}
interface InterfaceAAA<T>{}

class Impl implements InterfaceAAA<String> {}

class Impl2 implements InterfaceAAA<String> {}