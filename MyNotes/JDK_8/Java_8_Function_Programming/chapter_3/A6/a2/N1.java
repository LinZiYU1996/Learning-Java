package JDK_8.Java_8_Function_Programming.chapter_3.A6.a2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 20:20
 * \* Description:
 * \
 */
public class N1 {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1, "Mahesh", 12));
        list.add(new Student(2, "Suresh", 15));
        list.add(new Student(3, "Nilesh", 10));


        //Natural Sorting by Name

        List<Student> students = list.stream()
                .sorted()
                .collect(Collectors.toList());

        students.forEach(System.out::println);

        System.out.println("-------------------------------------");

        //Natural Sorting by Name in reverse order

        List<Student> students_1 = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        students_1.forEach(System.out::println);
        System.out.println("-------------------------------------");


        //Sorting using Comparator by Age

        List<Student> students_2 = list.stream()
                .sorted(Comparator.comparingInt(Student::getAge))
                .collect(Collectors.toList());

        students_2.forEach(System.out::println);

        System.out.println("-------------------------------------");

        //Sorting using Comparator by Age with reverse order

        List<Student> students_3 = list.stream()
                .sorted(Comparator.comparing(Student::getAge).reversed())
                .collect(Collectors.toList());

        students_3.forEach(System.out::println);

    }
}
