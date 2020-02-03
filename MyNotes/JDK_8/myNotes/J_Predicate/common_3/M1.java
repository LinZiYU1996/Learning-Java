package JDK_8.myNotes.J_Predicate.common_3;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 12:54
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        MyPredicate<Integer,String,Float> myPredicate = (i,s,f) ->
                i > 12 && s.length()>2 && f>0.1;

        List<Student> students = Create_Data.supply_Student();

        for (Student student : students) {
            if (myPredicate.test(student.getAge(),student.getName(),student.getHeight())){
                System.out.println(student);
            }
        }

    }



}
