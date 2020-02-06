package JDK_8.myNotes.J_Optional.p2;

import JDK_8.myNotes.J_Collectors.D_groupingBy.pojo.Employee;

import java.util.List;
import java.util.Optional;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/5
 * \* Time: 21:24
 * \* Description:
 * \
 */
public class M4 {

    public static void main(String[] args) {

        Optional<String> op1 = Optional.of("helio");

        // 如果值存在  转换成大写字母
        op1.ifPresent(s -> System.out.println(s.toUpperCase()));

        System.out.println("---------------------------");

        List<Employee> employees = Employee.supply_Ems();

        Optional<List<Employee>> op2 = Optional.of(employees);

        op2.ifPresent(employees1 ->
        {
            employees1.stream().limit(3).forEach(System.out::println);
        });

        /*
        Employee{name='0号员工', age=24, partment='技术部', salary=6731}
        Employee{name='1号员工', age=29, partment='市场部', salary=4524}
        Employee{name='2号员工', age=29, partment='管理部', salary=3430}
         */

    }
}
