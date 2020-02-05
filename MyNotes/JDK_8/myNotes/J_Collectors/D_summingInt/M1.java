package JDK_8.myNotes.J_Collectors.D_summingInt;

import JDK_8.myNotes.J_Collectors.D_toMap.pojo.Student;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/4
 * \* Time: 11:52
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {


        List<Student> students = Student.supple_S();


        // 统计学生年龄总和
        System.out.println(
                students.stream()
                .collect(Collectors.summingInt(Student::getAge))
        );

        System.out.println("--------------------------------------");


        // 统计英语成绩总分
        System.out.println(
                students.stream()
                .collect(Collectors.summingInt(Student::getG_english))
        );


    }
}
