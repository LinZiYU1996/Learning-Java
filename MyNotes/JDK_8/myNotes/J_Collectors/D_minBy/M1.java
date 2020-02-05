package JDK_8.myNotes.J_Collectors.D_minBy;

import JDK_8.myNotes.J_Collectors.D_toMap.pojo.Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/4
 * \* Time: 12:07
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<Student> students = Student.supple_S();

        System.out.println(
                students.stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getAge)))
        );

    }
}
