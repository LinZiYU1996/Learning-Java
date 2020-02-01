package JDK_8.method_reference.A3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 15:19
 * \* Description:
 * \
 */
public class Student {

    private String name;

    private Integer score;

    public void setNameAndScore(String name, Integer score)
    {
        this.name = name;
        this.score = score;
        System.out.println("Student "+  name +"'s score is " + score);
    }


    @FunctionalInterface
    interface TestInterface
    {
        // 注意：入参比Student类的setNameAndScore方法多1个Student对象，除第一个外其它入参类型一致
        public void set(Student d, String name, Integer score);
    }


    public static void main(String[] args) {

          /*lambda表达式的用法：
        TestInterface testInterface = (student, name, score) -> student.setNameAndScore(name, score);*/
        //类的任意对象的实例方法引用的用法:
        TestInterface testInterface = Student::setNameAndScore;
        testInterface.set(new Student(), "DoubleBin", 100);
    }


    //类的任意对象的实例方法引用的特性为：
    //
    //1、方法引用的通用特性：方法引用所使用方法的入参和返回值与lambda表达式实现的函数式接口的入参和返回值一致；
    //2、lambda表达式的第一个入参为实例方法的调用者，后面的入参与实例方法的入参一致。





}
