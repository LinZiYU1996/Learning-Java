package C_1.c_1_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 21:17
 * \* Description:
 * \
 */
public class Employee {


//    关键字 private 确保只有 Employee 类自身的方法能够访问这些实例域 ， 而其他类的方法不能够读写这些域 。

//     可以用 public 标记实例域 ， 但这是一种极为不提倡的做法
//public 數据域允许程序中的任何方法对其进行读取和修改 ,。 这就完全破坏了封装 。
//任何类的任何方法都可以修改 public 域 ， 从我们的经验来看 ， 某些代码将使用这种存取权限 ， 而这并不我们所希
//望的 ， 因此这里强烈建议将实例域标记为 private , ,

    private String name ;

    private double salary ;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {


//        说明在我们创建Employee对象的时候，会自动调用构造函数完成初始化，

        Employee employee = new Employee("John",44545);

        System.out.println(employee);


    }
}
