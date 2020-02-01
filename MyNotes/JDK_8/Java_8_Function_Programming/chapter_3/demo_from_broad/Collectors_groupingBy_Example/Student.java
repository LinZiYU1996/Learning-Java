package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Collectors_groupingBy_Example;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 12:05
 * \* Description:
 * \
 */
public class Student {


    private String name;
    private int age;
    private String className;
    public Student(String name,String className,int age){
        this.name=name;
        this.age=age;
        this.className = className;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getClassName() {
        return className;
    }


}
