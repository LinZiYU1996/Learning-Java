package JDK_8.functional_interface.Consumer_Interface_and_forEach_Loop;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:45
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
    public void printData(){
        System.out.println("Name:"+name + " age:"+age);
    }

}
