package JDK_8.chapter_3.c_3_5.c_3_5_4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 13:26
 * \* Description:
 * \
 */
public class Method {


//    Lambda表达式
//也允许使用自由变量（不是参数，而是在外层作用域中定义的变量），就像匿名类一样。 它们被
//称作捕获Lambda。例如，下面的Lambda捕获了 portNumber 变量：


    public static void main(String[] args) {

        int port = 1002;

        Runnable runnable = () -> System.out.println(port);

//        尽管如此，还有一点点小麻烦：关于能对这些变量做什么有一些限制。Lambda可以没有限
//制地捕获（也就是在其主体中引用）实例变量和静态变量。但局部变量必须显式声明为 final ，
//或事实上是 final 。换句话说，Lambda表达式只能捕获指派给它们的局部变量一次。（注：捕获
//实例变量可以被看作捕获最终局部变量 this 。） 例如，下面的代码无法编译，因为 portNumber
//变量被赋值两次：

        int portNumber = 1337;
//        错误：Lambda表达式引用的局
//部变量必须是最终的（ final ）
//或事实上最终的
//        Runnable r = () -> System.out.println(portNumber);
        portNumber = 31337;

    }


//    对局部变量的限制
//你可能会问自己，为什么局部变量有这些限制。第一，实例变量和局部变量背后的实现有一
//个关键不同。实例变量都存储在堆中，而局部变量则保存在栈上。如果Lambda可以直接访问局
//部变量，而且Lambda是在一个线程中使用的，则使用Lambda的线程，可能会在分配该变量的线
//程将这个变量收回之后，去访问该变量。因此，Java在访问自由局部变量时，实际上是在访问它
//的副本，而不是访问原始变量。如果局部变量仅仅赋值一次那就没有什么区别了——因此就有了
//这个限制。
//第二，这一限制不鼓励你使用改变外部变量的典型命令式编程模式（我们会在以后的各章中
//解释，这种模式会阻碍很容易做到的并行处理）。



}
