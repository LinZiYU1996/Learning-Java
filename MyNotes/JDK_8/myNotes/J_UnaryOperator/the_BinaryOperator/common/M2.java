package JDK_8.myNotes.J_UnaryOperator.the_BinaryOperator.common;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 20:28
 * \* Description:
 * \
 */
public class M2 {

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

        //---BinaryOperator.maxBy---
        //Class:A Age:23 Name:Ram
        //Class:B Age:22 Name:Mohan
        System.out.println("");
    }
}
