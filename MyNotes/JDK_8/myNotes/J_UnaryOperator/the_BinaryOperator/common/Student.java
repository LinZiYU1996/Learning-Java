package JDK_8.myNotes.J_UnaryOperator.the_BinaryOperator.common;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 20:28
 * \* Description:
 * \
 */
public class Student {

    private String name;
    private Integer age;
    private String className;
    public Student(String name,Integer age, String className){
        this.name=name;
        this.age=age;
        this.className = className;
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public String getClassName() {
        return className;
    }
}
