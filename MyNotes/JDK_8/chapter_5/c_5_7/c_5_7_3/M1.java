package JDK_8.chapter_5.c_5_7.c_5_7_3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/26
 * \* Time: 19:59
 * \* Description:
 * \
 */
public class M1 {

//，一个很有用的方法是
//Files.lines ，它会返回一个由指定文件中的各行构成的字符串流。使用你迄今所学的内容，
//你可以用这个方法看看一个文件中有多少各不相同的词：
    public static void main(String[] args) {

        long uniqueWords = 0;
        try(Stream<String> lines =
                    Files.lines(Paths.get("data.txt"), Charset.defaultCharset())){
            uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
                    .distinct()
                    .count();
        }
        catch(IOException e){
        }

    }
}
