package JDK_8.chapter_3.c_3_4.c_3_4_2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 11:20
 * \* Description:
 * \
 */
public class Method {


//    java.util.function.Consumer<T> 定义了一个名叫 accept 的抽象方法，它接受泛型 T
//的对象，没有返回（ void ）。你如果需要访问类型 T 的对象，并对其执行某些操作，就可以使用
//这个接口。比如，你可以用它来创建一个 forEach 方法，接受一个 Integers 的列表，并对其中
//每个元素执行操作。


    public static <T> void forEach(List<T> list, Consumer<T> c){
        for(T i: list){
            c.accept(i);
        }

    }

    public static void main(String[] args) {

//        Lambda是 Consumer 中
//accept 方法的实现
        forEach(
                Arrays.asList(1,2,3,4,5),
                (Integer i) -> System.out.println(i)
        );



    }
}
