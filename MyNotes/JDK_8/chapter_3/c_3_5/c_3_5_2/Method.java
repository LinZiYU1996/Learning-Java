package JDK_8.chapter_3.c_3_5.c_3_5_2;

import java.security.PrivilegedAction;
import java.util.concurrent.Callable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 13:20
 * \* Description:
 * \
 */
public class Method {


//    有了目标类型的概念，同一个Lambda表达式就可以与不同的函数式接口联系起来，只要它
//们的抽象方法签名能够兼容。比如，前面提到的 Callable 和 PrivilegedAction ，这两个接口
//都代表着什么也不接受且返回一个泛型 T 的函数。 因此，下面两个赋值是有效的：



    public static void main(String[] args) throws Exception {

        Callable<Integer> integerCallable = () -> 42;

        System.out.println(integerCallable.call());

        PrivilegedAction<Integer> privilegedAction = () -> 55;

        System.out.println(privilegedAction.run());



    }

//    类型推断
//你还可以进一步简化你的代码。Java编译器会从上下文（目标类型）推断出用什么函数式接
//口来配合Lambda表达式，这意味着它也可以推断出适合Lambda的签名，因为函数描述符可以通
//过目标类型来得到。这样做的好处在于，编译器可以了解Lambda表达式的参数类型，这样就可
//以在Lambda语法中省去标注参数类型。换句话说，Java编译器会像下面这样推断Lambda的参数
//类型：
//①
//List<Apple> greenApples =
//filter(inventory, a -> "green".equals(a.getColor()));
//Lambda表达式有多个参数，代码可读性的好处就更为明显。例如，你可以这样来创建一个
//Comparator 对象：
//Comparator<Apple> c =
//(Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
//Comparator<Apple> c =
//(a1, a2) -> a1.getWeight().compareTo(a2.getWeight());
//请注意，有时候显式写出类型更易读，有时候去掉它们更易读。没有什么法则说哪种更好；
//对于如何让代码更易读，程序员必须做出自己的选择。


}
