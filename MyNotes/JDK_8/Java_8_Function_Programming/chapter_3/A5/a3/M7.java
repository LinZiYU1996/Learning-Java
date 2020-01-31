package JDK_8.Java_8_Function_Programming.chapter_3.A5.a3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 16:39
 * \* Description:
 * \
 */
public class M7 {


    public static void main(String[] args) {
        List<String> first= Arrays.asList("one", "two", "three", "four");
        List<String> second= Arrays.asList("A", "B", "C", "D");
        //不使用lambda表达式
        first.stream()
                .flatMap(new Function<String, Stream<String>>() {
                    //f是first发出的元素
                    public Stream<String> apply(String f) {
                        return second.stream().map(new Function<String, String>() {
                            //s是second发出的元素
                            public String apply(String s) {
                                return String.format("%s,%s \n", f, s);
                            }
                        });
                    }
                })
                .forEach(System.out::println);
        //使用lambda表达式

        System.out.println("-------------------");
        first.stream()
                .flatMap(f -> second.stream().map(s -> String.format("%s,%s ", f, s)))
                .forEach(System.out::println);

    }
}
