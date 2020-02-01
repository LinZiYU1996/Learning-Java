package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_flatMap_generate_and_Stream_of_Example;

import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:16
 * \* Description:
 * \
 */
public class StreamOfDemo {


    //.flatMap(), Stream.generate() and Stream.of() methods. These methods return stream object. Stream.flatMap() maps a function to all elements of the stream. Stream.generate() method generates infinite number of elements as a stream. Stream.of() method returns stream object for the element passed as an argument. We will see the use of these methods by the example.



    public static void main(String[] args) {


        //Stream.of()
        //Stream.of() is a method which returns sequential ordered stream. We can pass any number of elements comma separated and will get stream instance.

        Stream.of("Ram","Shyam","Mohan").forEach(s->System.out.println(s));

    }
}
