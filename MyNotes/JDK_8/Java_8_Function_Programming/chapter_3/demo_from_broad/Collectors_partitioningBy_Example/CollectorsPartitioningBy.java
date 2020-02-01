package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Collectors_partitioningBy_Example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 12:03
 * \* Description:
 * \
 */
public class CollectorsPartitioningBy {

    //Java 8 Collectors.partitioningBy is a method that partitions the element of stream always in two part. It returns a Collector that stores the values in a Map. The key of map can be only true and false. Find the syntax of partitioningBy method. This method accepts a predicate and returns a Collector.
    //public static <T> Collector<T,?,Map<Boolean,List<T>>>
    //                                         partitioningBy(Predicate<? super T> predicate)


    //Now we will partition the student on the basis of their age. For the example we are partitioning all student for the age 20. The student with the age greater than 20 will be one partition and the rest will be another partition. We will achieve it as below.
    //Map<Boolean, List<Student>> stdByClass = list.stream()
    //                                     .collect(Collectors.partitioningBy(s -> s.getAge() > 20));Collectors.partitioningBy accepts predicate that will be defined to return true or false. This predicate is applied on all the elements of stream. Collectors.partitioningBy returns the Collector that will be converted into a map by Stream.collect method. The key of map will be true and false only.





    public static void main(String[] args) {



        Student s1 = new Student("Ram", 18);
        Student s2 = new Student("Shyam",22);
        Student s3 = new Student("Mohan",19);
        Student s4 = new Student("Mahesh",20);
        Student s5 = new Student("Krishna",21);
        List<Student> list = Arrays.asList(s1,s2,s3,s4,s5);
        //partition of Student on the basis of age

        Map<Boolean,List<Student>> booleanListMap = list.stream()
                .collect(Collectors.partitioningBy(student -> student.getAge() > 20));

        booleanListMap.forEach((k,v)->System.out.println("Key:"+k+"  "+
                ((List<Student>)v).stream().map(s->s.getName()).collect(Collectors.joining(","))));

    }
}
