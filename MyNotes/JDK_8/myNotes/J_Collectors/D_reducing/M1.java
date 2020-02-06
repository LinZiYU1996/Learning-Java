package JDK_8.myNotes.J_Collectors.D_reducing;

import JDK_8.myNotes.J_Collectors.D_groupingBy.pojo.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/4
 * \* Time: 14:45
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<Employee> employees = Employee.supply_Ems();

        Comparator<Employee> bySalary = Comparator.comparing(Employee::getSalary);

        // 找出 每个部门工资最高的员工
        Map<String, Optional<Employee>> map1 = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getPartment,
                        Collectors.reducing(BinaryOperator.maxBy(bySalary))
                ));

        map1.forEach(
                (k,v)->
                        System.out.println(k + "    " + v)
        );

        /*
        财务部    Optional[Employee{name='22号员工', age=30, partment='财务部', salary=8226}]
        技术部    Optional[Employee{name='27号员工', age=41, partment='技术部', salary=7898}]
        设计部    Optional[Employee{name='12号员工', age=25, partment='设计部', salary=5544}]
        市场部    Optional[Employee{name='11号员工', age=39, partment='市场部', salary=8179}]
        公关部    Optional[Employee{name='25号员工', age=25, partment='公关部', salary=4269}]
        管理部    Optional[Employee{name='10号员工', age=23, partment='管理部', salary=7286}]
         */

    }
}
