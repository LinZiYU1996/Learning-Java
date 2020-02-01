package JDK_8.functional_interface.Java_Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:03
 * \* Description:
 * \
 */
public class PredicateStreamDemo2 {


    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Mahesh", 20, "male", 38));
        list.add(new Student("Gauri", 21, "female", 45));
        list.add(new Student("Krishna", 19, "male", 42));
        list.add(new Student("Radha", 20, "female", 35));

        System.out.println("--- All students scoring marks > 40 ---");
        System.out.println("");

        Predicate<Student> p1 = student ->

                student.getMarks()>40;

        filterStudent(p1,list)
                .forEach(System.out::println);

        System.out.println("");

        System.out.println("--- All Male Students ---");

        System.out.println("");

        Predicate<Student> p2 = student ->

                student.getGender().equals("male");

        filterStudent(p2,list)
                .forEach(System.out::println);

        System.out.println("");

        System.out.println("--- All Female Students ---");
        System.out.println("");

        Predicate<Student> isFemaleStudent = std -> "female".equals(std.getGender());
        filterStudent(isFemaleStudent, list).forEach(s -> System.out.println(s));
        System.out.println("");

        System.out.println("--- All Female Students scoring > 40 ---");
        filterStudent(isFemaleStudent.and(p1), list).forEach(s -> System.out.println(s));




    }

    static List<Student> filterStudent(Predicate<Student> predicate, List<Student> list) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
}
