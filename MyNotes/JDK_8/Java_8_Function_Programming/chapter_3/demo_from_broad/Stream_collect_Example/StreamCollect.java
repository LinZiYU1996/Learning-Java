package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_collect_Example;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 10:22
 * \* Description:
 * \
 */
public class StreamCollect {


    //Stream.collect() using Supplier, Accumulator and Combiner


//supplier : It creates a new result container which will be populated by accumulator and combiner and finally it will be returned by collect() method. In parallel processing the Supplier function will be called multiple times that will return fresh value each time.
//accumulator : It incorporates additional element into the result.
//combiner : It combines two values that must be compatible with accumulator. Combiner works in parallel processing


    public static void main(String[] args) {

        List<String> list = Arrays.asList("Mukesh", "Vishal", "Amar");

        String result = list.parallelStream().collect(StringBuilder::new,
                (response, element) -> response.append(" ").append(element),
                (response1, response2) -> response1.append(",").append(response2.toString()))
                .toString();
        System.out.println("Result: " + result);

//If we use list.stream() then the output will be different because it is not parallel processing and so nothing to combine.


    }


}
