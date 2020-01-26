package JDK_8.chapter_5.c_5_7.c_5_7_4;

import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/26
 * \* Time: 20:01
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        Stream.iterate(0,n-> n + 2)
                .limit(10)
                .forEach(System.out::println);

    }

//    iterate 方法接受一个初始值（在这里是 0 ），还有一个依次应用在每个产生的新值上的
//Lambda（ UnaryOperator<t> 类型）。这里，我们使用Lambda  n -> n + 2 ，返回的是前一个元
//素加上2。因此， iterate 方法生成了一个所有正偶数的流：流的第一个元素是初始值 0 。然后加
//上 2 来生成新的值 2 ，再加上 2 来得到新的值 4 ，以此类推。这种 iterate 操作基本上是顺序的，
//因为结果取决于前一次应用


}
