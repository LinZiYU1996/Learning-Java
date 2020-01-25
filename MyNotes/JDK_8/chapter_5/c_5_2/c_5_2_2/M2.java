package JDK_8.chapter_5.c_5_2.c_5_2_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 20:25
 * \* Description:
 * \
 */
public class M2 {

    public static void main(String[] args) {
        String[] arrayOfWords = {"Goodbye", "World"};

        Stream<String> streamOfwords = Arrays.stream(arrayOfWords);

        List<String> uniqueCharacters =
                streamOfwords

//                        将每个单词转换为由其字母构成的数组
                .map(w -> w.split(""))

//                        将各个生成流扁平化为单个流
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueCharacters);



    }
}
