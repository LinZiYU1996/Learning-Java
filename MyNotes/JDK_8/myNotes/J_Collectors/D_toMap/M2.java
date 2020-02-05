package JDK_8.myNotes.J_Collectors.D_toMap;

import JDK_8.myNotes.J_Collectors.D_toMap.pojo.Person;
import JDK_8.myNotes.J_Collectors.D_toMap.pojo.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/4
 * \* Time: 10:55
 * \* Description:
 * \
 */
public class M2 {

//       * @apiNote
//     * There are multiple ways to deal with collisions between multiple elements
//     * mapping to the same key.  The other forms of {@code toMap} simply use
//     * a merge function that throws unconditionally, but you can easily write
//     * more flexible merge policies.  For example, if you have a stream
//     * of {@code Person}, and you want to produce a "phone book" mapping name to
//     * address, but it is possible that two persons have the same name, you can
//     * do as follows to gracefully deals with these collisions, and produce a
//     * {@code Map} mapping names to a concatenated list of addresses:
//            * <pre>{@code
//     *     Map<String, String> phoneBook
//     *         people.stream().collect(toMap(Person::getName,
//                *                                       Person::getAddress,
//                *                                       (s, a) -> s + ", " + a));
//     * }</pre>
    public static void main(String[] args) {

        List<Person> people = Person.supply_P();
//  对于重复的key的处理
        Map<String,String> phoneBook = people.stream()
                .collect(Collectors.toMap(Person::getName,
                        Person::getAddress,
                        (s,a) -> s + ",   " + a));

        phoneBook.forEach(
                (k,v) ->
                        System.out.println(k + "     "  + v)
        );


        System.out.println("---------------");

        // 也可以这样处理

        //
        //   这里我们假设有两个id相同Student，如果他们id相同，在转成Map的时候，取name大一个，小的将会被丢弃。

        System.out.println("----------------");


        Student s1 = new Student(1,"Mike",15);

        Student s2 = new Student(1,"Joshon",15);

        Student s3 = new Student(2,"Ted",15);

        Map<Integer,Student> map1 = Stream.of(s1,s2,s3)
                .collect(Collectors.toMap(
                        Student::getId,
                        Function.identity(),
                        BinaryOperator
                                .maxBy(Comparator.comparing(Student::getName))
                ));

        map1.forEach(
                (k,v)->
                        System.out.println(k+"---"+v)
        );
        /* 输出 */

//        1---Student{id=1, name='Mike', age=15, G_math=0, G_english=0, G_chinese=0}
//        2---Student{id=2, name='Ted', age=15, G_math=0, G_english=0, G_chinese=0}


    }
}
