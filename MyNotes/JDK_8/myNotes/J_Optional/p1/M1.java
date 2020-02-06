package JDK_8.myNotes.J_Optional.p1;

import JDK_8.myNotes.J_Collectors.D_toMap.pojo.Student;

import java.util.List;
import java.util.Optional;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/5
 * \* Time: 17:36
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        Optional<Integer> op1 = Optional.of(155);

        Optional<Double> op2 = Optional.ofNullable(555.66);

        Optional<String> op3 = Optional.empty();

        System.out.println("----------------------");

        Integer integer1 = op1.get();

        System.out.println(integer1);

        System.out.println("-------------------------");

        Double d = op2.orElse(151.33);

        System.out.println(d);

        String s1 = op3.orElse("hello");

        System.out.println(s1);

        System.out.println("-------------------------");

        String s2 = op3.orElseGet(() -> "world");

        System.out.println(s2);

        System.out.println("--------------------------");

        Optional<String> op4 = Optional.of("HGFFSFS");

        op4.ifPresent((s)-> System.out.println(s.toLowerCase()));

        System.out.println("--------------------------");

        List<Student> students = Student.supple_S();

        Optional<List<Student>> op5 = Optional.of(students);













    }
}
