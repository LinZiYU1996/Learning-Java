package JDK_8.functional_interface.Java_Predicate;


import java.util.function.Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 19:47
 * \* Description:
 * \
 */
public class PredicateAndDemo {


    //2. and(Predicate<? super T> other)
    //default Predicate<T> and(Predicate<? super T> other) and is the default method of Predicate that returns a composed predicate that represents the short-circuiting logical AND of this predicate and the other predicate. When evaluating the composed predicate, if this predicate is false then other predicate will not be evaluated. In case of error, if this predicate throws error then other predicate will not be evaluated.


    public static void main(String[] args) {

        Predicate<Student> predicate1 = student ->

                student.getAge()>=20 && student.getGender().equals("male");

        Predicate<Student> predicate2 = student ->

                student.getAge() > 18 && student.getGender().equals("female");

        Predicate<Student> predicate3 = student ->

                student.getMarks() >= 33;

        Student student1 = new Student("Mahesh", 22, "male", 30);


        System.out.println(predicate1.and(
                predicate3
        ).test(student1));

        Student student2 = new Student("Gauri", 19, "female", 40);

        System.out.println(predicate1.and(
                predicate3
        ).test(student2));


    }

}
