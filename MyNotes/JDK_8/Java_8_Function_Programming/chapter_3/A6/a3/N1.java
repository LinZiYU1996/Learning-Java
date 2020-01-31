package JDK_8.Java_8_Function_Programming.chapter_3.A6.a3;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 20:58
 * \* Description:
 * \
 */
public class N1 {

    public static void main(String[] args) {

        List<User> users = User.supplier();


        //统计所有人的年龄
        int ages = users.stream()
                .mapToInt(User::getAge)////返回IntStream
                .sum();

        System.out.println(ages);

        System.out.println("------------------");

        IntStream intStream = users.stream().mapToInt(User::getAge); //将Strean转化为数值流

        Stream<Integer> stream = intStream.boxed(); //将数值流转化为Stream


    }
}
