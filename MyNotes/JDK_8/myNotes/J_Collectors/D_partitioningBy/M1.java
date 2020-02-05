package JDK_8.myNotes.J_Collectors.D_partitioningBy;

import JDK_8.myNotes.J_Collectors.D_toMap.pojo.Person;
import JDK_8.myNotes.J_Collectors.D_toMap.pojo.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/4
 * \* Time: 21:50
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<Person> people = Person.supply_P();

        // 是否为北京来的
        Map<Boolean,List<Person>> map1 = people.stream()
                .collect(Collectors.partitioningBy(person ->
                        person.getAddress().equals("北京")));

        map1.forEach(
                (k,v)->
                        System.out.println(k + "    " + v)
        );

        /*
        false    [Person{name='A', address='深圳'}, Person{name='A', address='深圳'}, Person{name='A', address='上海'}, Person{name='C', address='深圳'}]
        true    [Person{name='C', address='北京'}, Person{name='C', address='北京'}]
         */

        System.out.println("--------------------------");

        // 统计英语成绩高于80分的学生

        List<Student> students = Student.supple_S();

        Map<Boolean,List<Student>> map2 = students.stream()
                .collect(Collectors.partitioningBy(student ->
                        student.getG_english() > 80));

        map2.forEach(
                (k,v)->
                        System.out.println(k + "    " + v)
        );

        /*
        false    [Student{id=0, name='0号学生', age=1, G_math=5, G_english=25, G_chinese=45}, Student{id=1, name='1号学生', age=18, G_math=8, G_english=80, G_chinese=0}, Student{id=2, name='2号学生', age=0, G_math=82, G_english=53, G_chinese=46}, Student{id=3, name='3号学生', age=16, G_math=87, G_english=52, G_chinese=60}, Student{id=4, name='4号学生', age=16, G_math=23, G_english=21, G_chinese=88}, Student{id=5, name='5号学生', age=13, G_math=82, G_english=19, G_chinese=3}, Student{id=6, name='6号学生', age=3, G_math=55, G_english=18, G_chinese=12}, Student{id=7, name='7号学生', age=2, G_math=65, G_english=56, G_chinese=20}, Student{id=8, name='8号学生', age=0, G_math=25, G_english=36, G_chinese=98}, Student{id=10, name='10号学生', age=5, G_math=11, G_english=6, G_chinese=84}, Student{id=12, name='12号学生', age=13, G_math=32, G_english=3, G_chinese=11}, Student{id=13, name='13号学生', age=22, G_math=71, G_english=11, G_chinese=44}, Student{id=15, name='15号学生', age=3, G_math=77, G_english=39, G_chinese=51}, Student{id=18, name='18号学生', age=12, G_math=24, G_english=55, G_chinese=84}]
        true    [Student{id=9, name='9号学生', age=5, G_math=60, G_english=99, G_chinese=21}, Student{id=11, name='11号学生', age=12, G_math=69, G_english=94, G_chinese=14}, Student{id=14, name='14号学生', age=10, G_math=88, G_english=90, G_chinese=11}, Student{id=16, name='16号学生', age=23, G_math=85, G_english=83, G_chinese=32}, Student{id=17, name='17号学生', age=15, G_math=67, G_english=98, G_chinese=82}, Student{id=19, name='19号学生', age=11, G_math=21, G_english=92, G_chinese=68}]
         */


    }
}
