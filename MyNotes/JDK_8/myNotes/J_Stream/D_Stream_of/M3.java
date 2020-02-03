package JDK_8.myNotes.J_Stream.D_Stream_of;

import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 22:16
 * \* Description:
 * \
 */
public class M3 {

    public static void main(String[] args) {

        //  iterate方法，返回的也是一个无限长度的Stream，与generate方法不同的是，其是通过函数f迭代对给指定的元素种子而产生无限连续有序Stream，其中包含的元素可以认为是：seed，f(seed),f(f(seed))无限循环
        Stream<Integer> stream1 = Stream.iterate(
                1,integer -> integer + 2
        );

        stream1.limit(10).forEach(System.out::println);

        System.out.println("---------------------");
        //生成一个等差数列

        Stream.iterate(0, n -> n + 3).limit(10). forEach(x -> System.out.print(x + " "));


    }
}
