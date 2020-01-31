package JDK_8.Java_8_Function_Programming.chapter_3.A5.a3;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 15:30
 * \* Description:
 * \
 */
public class Grade {

    private String name;

    private List<Student> students;

    public Grade() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
