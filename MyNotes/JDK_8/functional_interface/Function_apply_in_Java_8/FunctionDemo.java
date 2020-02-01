package JDK_8.functional_interface.Function_apply_in_Java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:50
 * \* Description:
 * \
 */
public class FunctionDemo {

    //java.util.function.Function is an interface and has been introduced in java 8. Function is a functional interface. So it can be used to accept lambda expression. Function accepts one argument and returns the result. Function interface contains one method that is apply(). This is the functional interface method. Find the declaration of apply() method.
    //R apply(T t)
    //Where T is the function argument and R is the result.
    //To use it we need to define Function. Suppose we have a method customShow () inside student class which will accept Function instance. Find the student class.


    public static void main(String[] args) {

        List<Student> list = new ArrayList();
        list.add(new Student("Ram",20));
        list.add(new Student("Shyam",22));
        list.add(new Student("Kabir",18));


        for (Student student : list){
            System.out.println(
                    student.customShow(student1 ->
                            student1.name + "  : " + student1.name)
            );
        }

        System.out.println("");


        //Style one to declare function

        Function<Student,String> function = student ->

        {
            String res = "name:  " + student.name + " age  " + student.age;
                    return res;
        };


        //Style two to declare function

        Function<Student,String> function1 = student ->

                "name " + student.name +" age  " + student.age;

        System.out.println("--print value by style one--");
        //print the values of list using stle one function
        for(Student st: list){
            System.out.println(st.customShow(function));
        }

        System.out.println("");


        System.out.println("--print value by style two--");
        //print the values of list using style two function
        for(Student st: list){
            System.out.println(st.customShow(function1));
        }



    }

}
