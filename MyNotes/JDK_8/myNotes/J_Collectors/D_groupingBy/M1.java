package JDK_8.myNotes.J_Collectors.D_groupingBy;

import JDK_8.myNotes.J_Collectors.D_toMap.pojo.Person;
import JDK_8.myNotes.J_Collectors.D_toMap.pojo.Student;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/4
 * \* Time: 14:51
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {


        List<Student> students = Student.supple_S();

        Map<Integer,List<Student>> map =

                students.stream()
                        .collect(Collectors.groupingBy(Student::getG_chinese));


//        map.forEach(
//                (k,v)->
//                        System.out.println(k + "    " + v)
//        );

        Function<Student,Boolean> function = student ->
        {
            if (student.getG_math() > 50) {
                return true;
            } else return false;
        };

        // 根据 数学成绩是否大于50 分组
        Map<Boolean,List<Student>> map2 =

                students.stream()
                .collect(Collectors.groupingBy(function));

        map2.forEach(
                (k,v)->
                        System.out.println(k + "    " + v)
        );

        /*
        false    [Student{id=0, name='0号学生', age=11, G_math=19, G_english=90, G_chinese=18},
         Student{id=2, name='2号学生', age=18, G_math=24, G_english=34, G_chinese=90},
         Student{id=7, name='7号学生', age=4, G_math=35, G_english=92, G_chinese=31},
         Student{id=10, name='10号学生', age=6, G_math=6, G_english=43, G_chinese=91},
         Student{id=18, name='18号学生', age=1, G_math=4, G_english=3, G_chinese=22}]
        true    [Student{id=1, name='1号学生', age=8, G_math=80, G_english=78, G_chinese=9},
        Student{id=3, name='3号学生', age=5, G_math=71, G_english=76, G_chinese=48},
        Student{id=4, name='4号学生', age=15, G_math=96, G_english=91, G_chinese=15},
        Student{id=5, name='5号学生', age=22, G_math=87, G_english=27, G_chinese=47}, Student{id=6, name='6号学生', age=20, G_math=69, G_english=54, G_chinese=75},
        Student{id=8, name='8号学生', age=24, G_math=68, G_english=88, G_chinese=92}, Student{id=9, name='9号学生', age=23, G_math=85, G_english=46, G_chinese=36},
        Student{id=11, name='11号学生', age=14, G_math=51, G_english=31, G_chinese=68}, Student{id=12, name='12号学生', age=19, G_math=64, G_english=6, G_chinese=70},
        Student{id=13, name='13号学生', age=15, G_math=99, G_english=54, G_chinese=84}, Student{id=14, name='14号学生', age=3, G_math=61, G_english=28, G_chinese=51},
        Student{id=15, name='15号学生', age=17, G_math=88, G_english=79, G_chinese=71}, Student{id=16, name='16号学生', age=8, G_math=84, G_english=2, G_chinese=60},
         Student{id=17, name='17号学生', age=5, G_math=68, G_english=2, G_chinese=68}, Student{id=19, name='19号学生', age=5, G_math=54, G_english=40, G_chinese=41}]
         */


        /**********************************/

        System.out.println("-------------------");

        List<Person> people = Person.supply_P();

        Function<Person,String> function1 = person ->
        {
            if (person.getAddress().equals("北京")){
                return "北京人";
            } else return "外地人";
        };

        Map<String,List<Person>> map3 =

                people.stream()
                .collect(Collectors.groupingBy(function1));

        map3.forEach(
                (k,v)->
                        System.out.println(k + "    " + v)
        );

        /*
        北京人    [Person{name='A', address='北京'}]
        外地人    [Person{name='A', address='深圳'}, Person{name='A', address='上海'}, Person{name='C', address='南京'}, Person{name='C', address='广州'}, Person{name='C', address='南京'}]
         */


    }
}
