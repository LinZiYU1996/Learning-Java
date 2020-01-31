package JDK_8.Java_8_Function_Programming.chapter_3.A5.a3;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 15:30
 * \* Description:
 * \
 */
public class Grade_Data {


    public static List<Grade> grades(){

        List<Grade> grades = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            Grade grade = new Grade();

            grade.setName((i+1) + " 班");

            grade.setStudents(Student_Data.create());

            grades.add(grade);

        }

        return grades;
    }


}
