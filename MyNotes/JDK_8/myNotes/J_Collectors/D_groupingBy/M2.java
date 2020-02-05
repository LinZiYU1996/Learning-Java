package JDK_8.myNotes.J_Collectors.D_groupingBy;

import JDK_8.myNotes.J_Collectors.D_toMap.pojo.Person;
import JDK_8.myNotes.J_Collectors.D_toMap.pojo.Student;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/4
 * \* Time: 20:03
 * \* Description:
 * \
 */
public class M2 {

    public static void main(String[] args) {

        List<Person> people = Person.supply_P();


        // 按照 地址 进行分组
        Map<String,List<String>> map = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getAddress,
                        Collectors.mapping(
                                Person::getName,
                                Collectors.toList()
                        )
                ));


        map.forEach(
                (k,v)->
                        System.out.println(k + "    " + v)
        );

        /*
        广州    [C]
        上海    [A, C]
        深圳    [C]
        南京    [A, A]
         */

        // 返回的集合类型可以根据需要而定

        System.out.println("------------------");

        Map<String, Set<String>> map2 = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getAddress,
                        Collectors.mapping(
                                Person::getName,
                                Collectors.toSet()
                        )
                ));

        map2.forEach(
                (k,v)->
                        System.out.println(k + "    " + v)
        );

        /*
        广州    [A, C]
        南京    [C]
        北京    [A, C]
         */

        System.out.println("------------------");

        List<Student> students = Student.supple_S();

        Function<Student,String> function = student ->
        {
            if (student.getG_english() > 60){
                return "及格人数";
            } else {
                return "不及格人数";
            }
        };

        // 统计 及格 不及格人数
        Map<String,Long> map3 = students.stream()
                .collect(Collectors.groupingBy(
                        function,
                        Collectors.counting()
                ));



        map3.forEach(
                (k,v)->
                        System.out.println(k + "    " + v)
        );

        /*
        不及格人数    14
        及格人数    6
         */

    }
}
