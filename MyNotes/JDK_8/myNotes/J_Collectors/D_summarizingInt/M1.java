package JDK_8.myNotes.J_Collectors.D_summarizingInt;

import JDK_8.myNotes.J_Collectors.D_toMap.pojo.Student;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/4
 * \* Time: 11:31
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<Student> students = Student.supple_S();

        // 统计 每个同学的语文成绩
        IntSummaryStatistics intSummaryStatistics = students.stream()
                .collect(Collectors.summarizingInt(Student::getG_chinese));

        System.out.println("最高分  " + intSummaryStatistics.getMax());

        System.out.println("");
        System.out.println("最低分  " + intSummaryStatistics.getMin());

        System.out.println("");
        System.out.println("平均分  " + intSummaryStatistics.getAverage());

        System.out.println("");
        System.out.println("参加考试人数    " + intSummaryStatistics.getCount());

        System.out.println("");
        System.out.println("所有信息汇总  :");
        System.out.println(intSummaryStatistics.toString());



    }
}
