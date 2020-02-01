package JDK_8.functional_interface.Consumer_Interface_and_forEach_Loop;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:45
 * \* Description:
 * \
 */
public class ConsumerDemo {


    public static void main(String[] args) {


        List<Student> list = new ArrayList();
        list.add(new Student("Ram",20));
        list.add(new Student("Shyam",22));
        list.add(new Student("Kabir",18));
        //Creating instance of Consumer functional interface


        Consumer<Student> consumer = student ->

                System.out.println(
                        "name:  " + student.name+
                                " age:  " + student.age
                );


        list.forEach(consumer);

        System.out.println("");

        list.forEach(Student::printData);

        System.out.println("");

        list.forEach(student ->
                student.printData());

    }



}
