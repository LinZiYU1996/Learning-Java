package JDK_8.chapter_3.c_3_2.c_3_2_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 10:59
 * \* Description:
 * \
 */
public class Method {


//    用函数式接口可以干什么呢？Lambda表达式允许你直接以内联的形式为函数式接口的抽象
//    方法提供实现，并把整个表达式作为函数式接口的实例（具体说来，是函数式接口一个具体实现
//的实例）。你用匿名内部类也可以完成同样的事情，只不过比较笨拙：需要提供一个实现，然后
//再直接内联将它实例化。下面的代码是有效的，因为 Runnable 是一个只定义了一个抽象方法 run
//的函数式接口：


    public static void main(String[] args) {

//        使用Lambda
        Runnable runnable = ()->
        {
            System.out.println("hepplk");
        };
//使用匿名类
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hepplk");
            }
        };

        runnable.run();
        runnable2.run();

    }
}
