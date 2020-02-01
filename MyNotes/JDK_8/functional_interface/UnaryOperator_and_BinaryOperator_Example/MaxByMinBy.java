package JDK_8.functional_interface.UnaryOperator_and_BinaryOperator_Example;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:24
 * \* Description:
 * \
 */
public class MaxByMinBy {

//BinaryOperator.maxBy and BinaryOperator.minBy
//BinaryOperator.maxBy accepts a Compotator and returns BinaryOperator which will return maximum between two elements. In the same way, BinaryOperator.minBy is used to get minimum between two elements.


    public static void main(String[] args) {


        Student s1 = new Student("Shyam", 22,"A");
        Student s2 = new Student("Ram",23,"A");
        Student s3 = new Student("Mohan",22,"B");
        Student s4 = new Student("Ramesh",21,"B");
        List<Student> list = Arrays.asList(s1,s2,s3,s4);


        Comparator<Student> comparator = Comparator.comparing(Student::getAge);

        //Using BinaryOperator.maxBy
        System.out.println("---BinaryOperator.maxBy---");

        Map<String, Optional<Student>> map = list.stream()
                .collect(Collectors.groupingBy(Student::getClassName,
                        Collectors.reducing(BinaryOperator.maxBy(comparator))));



        map.forEach((k,v)->System.out.println("Class:"+k+" Age:"+
                ((Optional<Student>)v).get().getAge()+" Name:"+((Optional<Student>)v).get().getName()));

        System.out.println("");

        //Using BinaryOperator.minBy

        Map<String, Optional<Student>> youngestByClass = list.stream().collect(Collectors.groupingBy(Student::getClassName,
                Collectors.reducing(BinaryOperator.minBy(comparator))));
        youngestByClass.forEach((k,v)->System.out.println("Class:"+k+" Age:"+
                ((Optional<Student>)v).get().getAge()+" Name:"+((Optional<Student>)v).get().getName()));
    }



}
