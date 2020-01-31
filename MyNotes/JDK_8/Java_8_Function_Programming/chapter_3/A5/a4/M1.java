package JDK_8.Java_8_Function_Programming.chapter_3.A5.a4;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 16:58
 * \* Description:
 * \
 */
public class M1 {


    //   只选取男性
    public static List<Person> getMale(List<Person> people){

        return people.stream()
                .filter(person -> person.getSex().equals("male"))
                .collect(Collectors.toList());
    }

    //选取年龄大于40岁的人
    public static List<Person> getOld(List<Person> people){

        return people.stream()
                .filter(person -> person.getAge() > 40)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {

        List<Person> people = Person_Data.people();

        for (Person person:getMale(people)){
            System.out.println(person);
        }

        System.out.println("--------------------------");

        for (Person person:getOld(people)){
            System.out.println(person);
        }


    }

}
