package JDK_8.myNotes.J_Collectors.D_groupingBy.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/4
 * \* Time: 20:54
 * \* Description:
 * \
 */
public class Employee {

    private static Random random = new Random();

    private static String[] parts =
            {
                    "市场部",
                    "管理部",
                    "公关部",
                    "技术部",
                    "设计部",
                    "财务部"

            };


    private String name;

    private int age;

    private String partment;

    private int salary;

    public Employee(String name, int age, String partment, int salary) {
        this.name = name;
        this.age = age;
        this.partment = partment;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPartment() {
        return partment;
    }

    public void setPartment(String partment) {
        this.partment = partment;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //获取[m,n]之间的随机数（0<=m<=n）
    public static int getRandomBetweenNumbers(int m,int n){
        return (int)(m + Math.random() * (n - m + 1));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", partment='" + partment + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static List<Employee> supply_Ems(){
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < 30; i++) {

            employees.add(new Employee(i+"号员工",getRandomBetweenNumbers(23,50),parts[random.nextInt(parts.length)],getRandomBetweenNumbers(1500,9000)));
        }
        return employees;
    }

    public static void main(String[] args) {

        for (Employee e : supply_Ems()){
            System.out.println(e);
        }

    }


}
