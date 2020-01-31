package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Concat_Streams_Lists_Sets_Arrays;

import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:31
 * \* Description:
 * \
 */


//Now find the syntax of Stream.concat() from Java doc.

    //static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)


public class ConcatStreamsDemo {


    //concat() creates lazily concatenated stream. This stream contains all elements of first stream followed by all elements of second stream. The resulting stream will be ordered if both input streams are ordered. The resulting stream will be parallel if any of the two streams is parallel


    public static void main(String[] args) {


        Stream<String> s1 = Stream.of("AA", "BB", "CC");
        Stream<String> s2 = Stream.of("AA", "BB", "DD");

        Stream<String> s = Stream.concat(s1, s2);

        s.forEach(e-> System.out.println(e+" "));

        //Remove duplicates using distinct()
        System.out.println("------------------");
        s1 = Stream.of("AA", "BB", "CC");
        s2 = Stream.of("AA", "BB", "DD");
        System.out.println("\nRemove duplicates using distinct()");
        s = Stream.concat(s1, s2).distinct();
        s.forEach(e->System.out.print(e+" "));




    }
}
