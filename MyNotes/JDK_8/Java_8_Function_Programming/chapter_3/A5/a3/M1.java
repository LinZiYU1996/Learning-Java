package JDK_8.Java_8_Function_Programming.chapter_3.A5.a3;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 15:17
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<Student> students = Student_Data.create();

        List<Integer> ages = students.stream()
                .map(Student::getAge).collect(Collectors.toList());


        System.out.println(ages);
    }
}
