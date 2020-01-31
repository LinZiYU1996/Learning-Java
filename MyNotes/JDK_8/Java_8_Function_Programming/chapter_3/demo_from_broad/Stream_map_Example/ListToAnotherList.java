package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_map_Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 22:00
 * \* Description:
 * \
 */
public class ListToAnotherList {

//In this example we will convert a List of an object into another List of different object using Stream.map() as an intermediate operation.



    public static void main(String[] args) {

        Person p1 = new Person(1, "Mohan", "student");
        Person p2 = new Person(2, "Sohan", "teacher");
        Person p3 = new Person(3, "Dinesh", "student");
        List<Person> personList = Arrays.asList(p1, p2, p3);

        List<Student> students = personList.stream()
                .filter(person -> person.getPersonType().equals("student"))
                .map(person -> new Student(person.getId(),person.getName()))
                .collect(Collectors.toList());

        students.forEach(System.out::println);

    }
}
