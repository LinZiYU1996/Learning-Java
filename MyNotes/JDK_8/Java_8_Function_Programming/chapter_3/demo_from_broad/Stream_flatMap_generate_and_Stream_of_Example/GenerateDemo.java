package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_flatMap_generate_and_Stream_of_Example;

import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:18
 * \* Description:
 * \
 */
public class GenerateDemo {

//Stream.generate()
//Stream.generate() returns infinite sequential and unordered stream. We need to pass supplier to generate element.

    public static void main(String[] args) {
        Item item =new Item("AA");
        Stream<String> stream = Stream.generate(item::getName);
        stream.limit(5)
                .forEach(s->System.out.println(s));

    }
}
