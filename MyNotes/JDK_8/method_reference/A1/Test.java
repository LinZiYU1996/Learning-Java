package JDK_8.method_reference.A1;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 14:34
 * \* Description:
 * \
 */
public class Test {


    public static void main(String[] args) {

        List<Person> people = Person.get();



        people.sort(new PersonAgeComparator());

        people.stream()
                .forEach(System.out::println);


        List<Person> people2 = Person.get();

        //lambda
        people2.sort(
                (p1,p2) ->
                        p1.getAge().compareTo(p2.getAge())
        );

        System.out.println("--------------");
        people2.stream()
                .forEach(System.out::println);

        System.out.println("--------------");

        //Perdon类中已经有了一个静态方法的比较器：compareByAge，

        List<Person> people3 = Person.get();

        people3.sort(Person::compareByAge);

        people3.stream()
                .forEach(System.out::println);
    }
}
