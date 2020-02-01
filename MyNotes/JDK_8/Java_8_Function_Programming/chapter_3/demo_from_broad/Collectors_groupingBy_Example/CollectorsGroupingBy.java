package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Collectors_groupingBy_Example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 12:05
 * \* Description:
 * \
 */
public class CollectorsGroupingBy {

//groupingBy is a static method of java.util.stream.Collectors in java 8. groupingBy does the grouping of elements on the basis of any given key and returns a Collector. Find the method syntax.
//<T,K> Collector<T,?,Map<K,List<T>>> groupingBy(Function<? super T,? extends K> classifier)



    //Now if we want to group students on the basis of className, we will do as below.
    //Map<String, List<Student>> stdByClass = list.stream()
    //                                    .collect(Collectors.groupingBy(Student::getClassName));We have a list of Student class. Grouping is done on the basis of student class name. List is converted into stream of student object. Then call collect method of stream. groupingBy of Collectors class checks each element of stream and gets class name and then group it as list. Finally we get a map where key is the one by which grouping is done. Find the complete example.




    public static void main(String[] args) {



        Student s1 = new Student("Ram", "A", 20);
        Student s2 = new Student("Shyam", "B", 22);
        Student s3 = new Student("Mohan", "A", 22);
        Student s4 = new Student("Mahesh", "C", 20);
        Student s5 = new Student("Krishna", "B", 21);
        List<Student> list = Arrays.asList(s1,s2,s3,s4,s5);
        //Group Student on the basis of ClassName


        System.out.println("----Group Student on the basis of ClassName----");
        System.out.println("");


        Map<String,List<Student>> ByClass = list.stream()
                .collect(Collectors.groupingBy(Student::getClassName));

        ByClass.forEach((k,v)->System.out.println("Key:"+k+"  "+
                ((List<Student>)v).stream().map(m->m.getName()).collect(Collectors.joining(","))));



        System.out.println("");


        //Group Student on the basis of age

        System.out.println("----Group Student on the basis of age----");
        System.out.println("");

        Map<Integer, List<Student>> stdByAge = list.stream()
                .collect(Collectors.groupingBy(Student::getAge));

        stdByAge.forEach((k,v)->System.out.println("Key:"+k+"  "+
                ((List<Student>)v).stream().map(m->m.getName()).collect(Collectors.joining(","))));






    }
}
