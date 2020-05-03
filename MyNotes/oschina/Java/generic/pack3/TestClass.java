package oschina.Java.generic.pack3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/27
 * \* Time: 11:10
 * \* Description:
 * \
 */
public class TestClass<T> {
/*
当一个类在声明时使用了<? extends Fruit> 这种泛型，而这个类的写法如同下面这样


 */
    public void test(T t){
        // somecode
    }
    public void test2(Object o){
        // somecode
    }


    public static void main(String[] args) {
//        TestClass<? extends Fruit> f = new TestClass<Apple>;
//这样写会出现的问题是不能调用test(T)方法了，
// 因为test 需要的是一个具体的Fruit 的子类，
// 子中应该是Applie,但 ? extends Fruit 代表的不仅仅是
// Apple 这一种子类，也可能是 orange 。如果调用时真的用orange
// 类型实例做为能数，类型就不安全，所以 test(T) 方法不能用了；但是 test
// 2(Object) 还可以用
    }
}
