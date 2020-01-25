package JDK_8.chapter_3.c_3_4.c_3_4_3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 11:27
 * \* Description:
 * \
 */
public class Test_3_4 {

//    函数式接口

//    对于下列函数描述符（即Lambda表达式的签名），你会使用哪些函数式接口？


//(1)  T->R
//(2)  (int, int)->int
//(3)  T->void
//(4)  ()->T
//(5)  (T, U)->R

//    (1)  Function<T,R> 不错。它一般用于将类型 T 的对象转换为类型 R 的对象（比如
//Function<Apple, Integer> 用来提取苹果的重量）

//    (2)  IntBinaryOperator 具有唯一一个抽象方法，叫作 applyAsInt ，它代表的函数描述
//符是 (int, int) -> int 。

//    (3)  Consumer<T> 具有唯一一个抽象方法叫作 accept ，代表的函数描述符是 T -> void 。

//    (4)  Supplier<T> 具有唯一一个抽象方法叫作 get ，代表的函数描述符是 ()-> T 。或者，
//Callable<T> 具有唯一一个抽象方法叫作 call ，代表的函数描述符是 () -> T 。

//    (5)  BiFunction<T, U, R> 具有唯一一个抽象方法叫作 apply ，代表的函数描述符是 (T,
//U) -> R 。


}
