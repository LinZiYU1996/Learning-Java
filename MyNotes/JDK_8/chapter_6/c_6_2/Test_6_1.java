package JDK_8.chapter_6.c_6_2;


import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;

import static java.util.stream.Collectors.*;


/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/26
 * \* Time: 22:29
 * \* Description:
 * \
 */
public class Test_6_1 {

//    用 reducing 连接字符串

//    以下哪一种 reducing 收集器的用法能够合法地替代 joining 收集器


//    String shortMenu = menu.stream().map(Dish::getName).collect(joining());
    public static void main(String[] args) {

        List<Dish> menu = Data.create();

//        这会将每道菜转换为菜名，就像原先使用 joining 收集器的语句一样。然后用一个
//String 作为累加器归约得到的字符串流，并将菜名逐个连接在它后面。
        String shortMenu = menu.stream().map(Dish::getName)
                .collect( reducing ( (s1, s2) -> s1 + s2 ) ).get();


        System.out.println(shortMenu);

        System.out.println("==================================");


//         这会把一个空字符串作为累加器来进行归约，在遍历菜肴流时，它会把每道菜转换成
//菜名，并追加到累加器上。请注意，我们前面讲过， reducing 要返回一个 Optional 并不需
//要三个参数，因为如果是空流的话，它的返回值更有意义——也就是作为累加器初始值的空字
//符串。
        String shortMenu_1 = menu.stream()
                .collect( reducing( "",Dish::getName, (s1, s2) -> s1 + s2 ) );

        System.out.println(shortMenu_1);


//        这无法编译，因为 reducing 接受的参数是一个 BinaryOperator<t> ，也就是一个
//BiFunction<T,T,T> 。这就意味着它需要的函数必须能接受两个参数，然后返回一个相同类
//型的值，但这里用的Lambda表达式接受的参数是两个菜，返回的却是一个字符串。

//        String shortMenu_3 = menu.stream()
//                .collect( reducing( (d1, d2) -> d1.getName() + d2.getName() ) ).get();




    }
}
