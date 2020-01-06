package chapter_15.c_15_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:56 2020/1/5
 */
public class GenericMethods {


    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }


//    注意，当使用泛型类时，必须在创建对象的时候指定类型参数的值，而使用泛型方法的时候，
//    通常不必指明参数类型，因为编译器会为我们找出具体的类型。
//    这称为类型参数推断(type argument inference)。因此，我们可以像调用普通方法一样调用f(),
//    而且就好像是ro被无限次地重载过。它甚至可以接受GenericMethods作为其类型参数。

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }


}
