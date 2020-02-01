package JDK_8.functional_interface.Function_apply_in_Java_8;

import java.util.function.Function;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:50
 * \* Description:
 * \
 */
public class Student {

    public String name;
    public int age;
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public  String customShow(Function<Student,String> fun){
        return fun.apply(this);
    }

}
