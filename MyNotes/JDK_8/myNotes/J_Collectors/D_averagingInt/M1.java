package JDK_8.myNotes.J_Collectors.D_averagingInt;

import JDK_8.myNotes.J_Collectors.D_toMap.pojo.Student;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/4
 * \* Time: 12:00
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<Student> students = Student.supple_S();


        // 计算 学生 年龄 平均值
        System.out.println(
                students.stream()
                .collect(Collectors.averagingInt(Student::getAge))
        );


        System.out.println("---------------------------------");

        // 计算 语文成绩 平均分
        System.out.println(
                students.stream()
                .collect(Collectors.averagingInt(Student::getG_chinese))
        );


    }
}
