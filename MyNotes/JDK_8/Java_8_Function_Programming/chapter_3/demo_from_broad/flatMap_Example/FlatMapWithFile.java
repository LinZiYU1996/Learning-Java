package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.flatMap_Example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:43
 * \* Description:
 * \
 */
public class FlatMapWithFile {



    //Stream flatMap with Files.lines()
    //Files.lines() has been introduced in Java 8. It reads all the lines of the file as a stream. Here in our example we have a file with some lines. We will store all the words in a list and print it out.



    public static void main(String[] args) {
        Stream<String> lines = null;
        try {
            lines = Files.lines(Paths.get("E:\\learn-java\\Learning-Java\\MyNotes\\JDK_8\\Java_8_Function_Programming\\chapter_3\\demo_from_broad\\flatMap_Example\\info.txt"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stream<String> stringStream = lines
                .flatMap(line -> Stream.of(line.split("  + ")));

        List<String> words = new ArrayList<>();
        stringStream.forEach(w->words.add(w));
        words.forEach(w -> System.out.println(w));
    }
}
