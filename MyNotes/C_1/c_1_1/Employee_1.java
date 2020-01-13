package C_1.c_1_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 21:38
 * \* Description:
 * \
 */
public class Employee_1 {

    @Override
    public String toString() {
        return "Employee_1{}";
    }

    public static void main(String[] args) {

//        没有显式提供构造函数

//        程序会自动给你加上一个无参数无操作的构造函数

        Employee_1 employee_1 = new Employee_1();

        System.out.println(employee_1);
    }
}
