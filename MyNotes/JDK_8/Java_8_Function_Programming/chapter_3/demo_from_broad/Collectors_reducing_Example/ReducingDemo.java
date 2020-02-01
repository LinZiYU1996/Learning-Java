package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Collectors_reducing_Example;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:59
 * \* Description:
 * \
 */
public class ReducingDemo {

//Java 8 Collectors.reducing is used to reduce the stream element with the help of Comparator and BinaryOperator. Collectors.reducing returns the Collector with Optional data. Here in this page, we will find the example of Collectors.reducing. Method syntax from Java Doc is as below.
//public static <T> Collector<T,?,Optional<T>> reducing(BinaryOperator<T> op) Collectors.reducing returns a collector with Optional class. We need to pass binary operator as BinaryOperator.maxBy and BinaryOperator.minBy. BinaryOperator takes a Comparator as an argument. According to that Comparator and BinaryOperator, stream elements are reduced and finally can be collected as group. For the demo we are using a class as given below.




    public static void main(String[] args) {


        Student s1 = new Student("Shyam", 22,"A");
        Student s2 = new Student("Ram",23,"A");
        Student s3 = new Student("Mohan",22,"B");
        Student s4 = new Student(null,21,"B");
        List<Student> list = Arrays.asList(s1,s2,s3,s4);
        Comparator<Student> ageComparator = Comparator.comparing(Student::getAge);

        Map<String, Optional<Student>> stringOptionalMap = list.stream()
                .collect(Collectors.groupingBy(Student::getClassName,
                        Collectors.reducing(BinaryOperator.maxBy(ageComparator))));


        stringOptionalMap.forEach((k,v)->System.out.println("Class:"+k+" Age:"+
                ((Optional<Student>)v).get().getAge()+" Name:"+((Optional<Student>)v).get().getName()));





    }
}
