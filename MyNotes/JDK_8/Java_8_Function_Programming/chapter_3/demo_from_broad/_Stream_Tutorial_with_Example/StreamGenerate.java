package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad._Stream_Tutorial_with_Example;

import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:49
 * \* Description:
 * \
 */
public class StreamGenerate {


    public static void main(String[] args) {

//generate(): We need to pass Supplier to this method and it will return an infinite sequential unordered stream.
//limit(): We need to pass a max value and it returns the stream up to the max number of elements.


        String str = "Hello World!";
        Stream<String> stream = Stream.generate(str::toString).limit(5);
        stream.forEach(s->System.out.println(s));


    }
}
