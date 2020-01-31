package JDK_8.Java_8_Function_Programming.chapter_3.A5.a3;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 15:32
 * \* Description:
 * \
 */
public class M2 {


    public static void main(String[] args) {

        List<Grade> grades = Grade_Data.grades();

        List<List<Student>> ages = grades.stream()
                .map(Grade::getStudents)
                .collect(Collectors.toList());


        System.out.println(ages);


        System.out.println("-------------------");


        List<Integer> flat_ages = grades.stream()
                .flatMap(
                        grade ->
                                grade.getStudents().stream()
                )
                .map(Student::getAge).collect(Collectors.toList());


        System.out.println(flat_ages);
    }
}
