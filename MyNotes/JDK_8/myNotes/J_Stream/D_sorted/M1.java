package JDK_8.myNotes.J_Stream.D_sorted;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;
import JDK_8.myNotes.J_Stream.D_sorted.pojo.Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 11:41
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<Integer> integerList = Create_Data.supply_Integers();

        System.out.println(integerList);

        System.out.println("------------------");

        List<Integer> l1  = integerList.stream().sorted().collect(Collectors.toList());

        System.out.println(l1);

        System.out.println("------------------");

        //自然序逆序元素，使用Comparator 提供的reverseOrder() 方法

        List<Integer> l2 = integerList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(l2);

        System.out.println("------------------");

        List<Student> students = Student.supply_S();

        List<Student> list = students.stream()
                .sorted(Comparator.comparing(Student::getAge))
        .collect(Collectors.toList());

        System.out.println(list);

    }
}
