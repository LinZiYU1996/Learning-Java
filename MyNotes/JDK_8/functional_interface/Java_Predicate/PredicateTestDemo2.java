package JDK_8.functional_interface.Java_Predicate;


import java.util.function.Function;
import java.util.function.Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 19:42
 * \* Description:
 * \
 */
public class PredicateTestDemo2 {


    public static void main(String[] args) {

        Predicate<Student> malepredicate = student ->

                student.getAge()>=20 && student.getGender().equals("male");

        Predicate<Student> femalepredicate = student ->

                student.getAge()>18 && student.getGender().equals("female");


        Function<Student,String> function1 = student ->

                "Male age "+ student.getAge();

        Function<Student,String> function2 = student ->

                "female age " + student.getAge();

        Student s1 = new Student("Gauri", 20,"female");


        if (malepredicate.test(s1)){
            System.out.println(s1.customShow(function1));
        } else if (femalepredicate.test(s1)){
            System.out.println(s1.customShow(function2));
        }

    }
}
