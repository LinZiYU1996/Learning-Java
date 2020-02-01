package JDK_8.functional_interface.UnaryOperator_and_BinaryOperator_Example;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:36
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
