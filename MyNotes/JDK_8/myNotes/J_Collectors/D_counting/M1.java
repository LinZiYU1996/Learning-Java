package JDK_8.myNotes.J_Collectors.D_counting;

import JDK_8.myNotes.J_Collectors.D_toMap.pojo.Student;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/4
 * \* Time: 12:16
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<Student> students = Student.supple_S();

        // 统计有多少个学生

        System.out.println(
                students.stream()
                .collect(Collectors.counting())
        );

        System.out.println("-----------");

        // 统计 数学 80分以上的有多少人

        System.out.println(
                students.stream()
                .filter(student -> student.getG_math() > 80)
                .collect(Collectors.counting())
        );

    }
}
