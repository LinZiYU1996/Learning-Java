package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Collectors_Examples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:10
 * \* Description:
 * \
 */
public class MappingDemo {

//Collectors.mapping
//Java doc declares mapping() as below.
//mapping(Function<? super T,? extends U> mapper, Collector<? super U,A,R> downstream)
// We need to pass Function and Collector and the method will return Collector instance. mapping() is used in multi-level reduction. Find the example.



    public static void main(String[] args) {

        List<Person> list = Person.getList();


        Map<Integer,String> map = list.stream()
                .collect(Collectors.groupingBy(Person::getAge,
                        Collectors.mapping(Person::getName,Collectors.joining(","))));


        map.forEach((k,v)->System.out.println("Age:"+k +"  Persons: "+v));

    }
}
