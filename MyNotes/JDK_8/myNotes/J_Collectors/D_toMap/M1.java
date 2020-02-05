package JDK_8.myNotes.J_Collectors.D_toMap;

import JDK_8.myNotes.J_Collectors.D_toMap.pojo.Student;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 21:59
 * \* Description:
 * \
 */
public class M1 {


//      * <pre>{@code
//     *     Map<Student, Double> studentToGPA
//     *         students.stream().collect(toMap(Functions.identity(),
//                *                                         student -> computeGPA(student)));
//     * }</pre>


//         * And the following produces a {@code Map} mapping a unique identifier to
//     * students:
//            * <pre>{@code
//     *     Map<String, Student> studentIdToStudent
//     *         students.stream().collect(toMap(Student::getId,
//                *                                         Functions.identity());
//     * }</pre>
    public static void main(String[] args) {

        List<Student> students = Student.supple_S();

        Map<Student,Integer> studentToGPA = students.stream()
                .collect(Collectors.toMap(Function.identity(),student -> Student.computeGPA(student)));

//        System.out.println(studentToGPA);

        studentToGPA.forEach(
                (k,v) ->
                        System.out.println(k + "---" + v)
        );

        System.out.println("----------------");

        Map<Integer, Student> studentIdToStudent = students.stream()
                .collect(Collectors.toMap(Student::getId,Function.identity()));

        studentIdToStudent.forEach(
                (k,v) ->
                        System.out.println(k + "---" + v)
        );

        System.out.println("----------------");


        Map<String,String> map = Stream.of("AA","BB","CC").collect(Collectors.toMap(k->k, v->v+v));
        map.forEach((k,v)->System.out.println("key:"+k +"  value:"+v));




    }
}
