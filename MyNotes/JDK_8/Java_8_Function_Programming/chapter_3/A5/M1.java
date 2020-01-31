package JDK_8.Java_8_Function_Programming.chapter_3.A5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 13:29
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        // 创建一个包含人名称的流（英文名和中文名）
        Stream<String> stream = Stream.of("Alen", "Hebe", "Zebe", "张成瑶", "钟其林");

        // 通过判断人名称的首字母是否为英文字母，将其分为两个不同流

        final Map<Boolean, List<String>> map =

                stream.collect(
                        Collectors.partitioningBy(
                                s ->
                                {
                                    int code = s.codePointAt(0);
                                    return (code>=65&&code<=90) ||
                                            (code>=97&&code<=122);
                                }
                        )
                );

//        / 输出分组结果

        map.forEach((isEnglishName, names) -> {
            if (isEnglishName) {
                System.out.println("英文名称如下：");
            } else {
                System.out.println("中文名称如下：");
            }
            names.forEach(name -> System.out.println("\t" + name));
        });


        //中文名称如下：
        //	张成瑶
        //	钟其林
        //英文名称如下：
        //	Alen
        //	Hebe
        //	Zebe

    }
}
