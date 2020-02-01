package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Collectors_joining_Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:14
 * \* Description:
 * \
 */
public class JoiningExampleWithListOfString {

//joining() Method Description
//Suppose we the elements A,B,C,D that will be collected in following ways.
//1.
//joining()
// It returns the Collector that is used to concatenate the elements with no delimiter. For our given input elements, the output string will be ABCD.
//2.
//joining(CharSequence delimiter)
// It returns the Collector that is used to concatenate the elements with given delimiter. For our given input elements and separator (-), the output string will be A-B-C-D.
//3.
//joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
// It returns the Collector that is used to concatenate the elements with given delimiter, prefix and suffix . For our given input elements, separator(-), prefix([) and suffix(])the output string will be [A-B-C-D].



    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ram","Shyam","Shiv","Mahesh");

        String result = list.stream()
                .collect(Collectors.joining());

        System.out.println(result);


        result = list.stream()
                .collect(Collectors.joining(","));


        System.out.println(result);


        result=  list.stream().collect(Collectors.joining("-","[","]"));
        System.out.println(result);
    }
}
