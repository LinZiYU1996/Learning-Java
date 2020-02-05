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


        Map<String, Optional<Employee>> map1 = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getPartment,
                        Collectors.reducing(BinaryOperator.maxBy(bySalary))
                ));

        map1.forEach(
                (k,v)->
                        System.out.println(k + "    " + v)
        );

    }
}
