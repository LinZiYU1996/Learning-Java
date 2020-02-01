package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Collectors_joining_Example;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:15
 * \* Description:
 * \
 */
public class JoiningExampleWithListOfObject {


    public static void main(String[] args) {

        List<Person> list = Person.getList();
        System.out.println("--Join person name--");


        String result = list.stream()
                .map(person -> person.getName())
                .collect(Collectors.joining());

        System.out.println(result);

        System.out.println("");
        result = list.stream()
                .map(person -> person.getName())
                .collect(Collectors.joining("|"));
        System.out.println(result);
        System.out.println("");

        result=  list.stream().map(p -> p.getName()).collect(Collectors.joining("-","[","]"));
        System.out.println(result);
        System.out.println("");


        System.out.println("--Join person age--");


        result = list.stream()
                .map(person -> String.valueOf(person.getAge()))
                .collect(Collectors.joining());

        System.out.println(result);

        result=  list.stream().map(p -> String.valueOf(p.getAge())).collect(Collectors.joining("|"));
        System.out.println(result);
        result=  list.stream().map(p -> String.valueOf(p.getAge())).collect(Collectors.joining("-","[","]"));
        System.out.println(result);


        System.out.println("");

        System.out.println("--Join person name-age--");
        result=  list.stream().map(p -> p.getName()+"-" + p.getAge()).collect(Collectors.joining("|"));
        System.out.println(result);
        result=  list.stream().map(p -> p.getName()+"-" + p.getAge()).collect(Collectors.joining("|","[","]"));
        System.out.println(result);



    }
}
