package JDK_8.method_reference.A3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 15:15
 * \* Description:
 * \
 */
public class Test2 {

//构造器引用
//   &nbsp构造器引用的语法格式为： 类名::new ，如() -> new ArrayList<String>() 等价于 ArrayList<String>::new



    public static void main(String[] args) {

        Supplier<List<String>> supplier = () ->
                new ArrayList<>();

        System.out.println(supplier.get());

        Supplier<List<String>> supplier1 = ArrayList<String>::new;

        System.out.println(supplier1);
    }

    //构造器引用适用于lambda表达式主体中仅仅调用了某个类的构造函数返回实例的场景。


}
