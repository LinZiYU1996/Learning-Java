package C_1.c_1_8;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/15
 * \* Time: 19:46
 * \* Description:
 * \
 */
public class R<T> {

    // 下面代码错误，不能在静态变量声明中使用泛型形参
//	static T info;
    T age;
    public void foo(T msg){}
    // 下面代码错误，不能在静态方法声明中使用泛型形参
//	public static void bar(T msg){}


}
