package JDK_8.functional_interface.Java_Predicate;

import java.util.function.Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 19:51
 * \* Description:
 * \
 */
public class PredicateOrDemo {

    //3. or(Predicate<? super T> other)
    //default Predicate<T> or(Predicate<? super T> other) or is the default method of Predicate that returns a composed predicate that represents the short-circuiting logical OR of this predicate and the other predicate. When evaluating the composed predicate, if this predicate is true then other predicate will not be evaluated. In case of error, if this predicate throws error then other predicate will not be evaluated.


    public static void main(String[] args) {


        Predicate<Student> isMaleStudent = s -> s.getAge() >= 20 && "male".equals(s.getGender());
        Predicate<Student> isFemaleStudent = s -> s.getAge() > 18 && "female".equals(s.getGender());
        Predicate<Student> isStudentPassed = s -> s.getMarks() >= 33;

        Student student1 = new Student("Mahesh", 22, "male", 35);
        //Test either male or female student
        Boolean result = isMaleStudent.or(isFemaleStudent).test(student1);
        System.out.println(result); //true
        //Is student passed, too
        result = isMaleStudent.or(isFemaleStudent).and(isStudentPassed).test(student1);
        System.out.println(result); //true
    }

}
