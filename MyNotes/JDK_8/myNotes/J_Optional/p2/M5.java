package JDK_8.myNotes.J_Optional.p2;

import JDK_8.myNotes.J_Collectors.D_groupingBy.pojo.Employee;

import java.util.List;
import java.util.Optional;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/5
 * \* Time: 21:28
 * \* Description:
 * \
 */
public class M5 {

    public static void main(String[] args) {

        List<Employee> employees = Employee.supply_Ems();

        Random random = new Random();

        Optional<Employee> op1 = Optional.of(employees.get(random.nextInt(employees.size())));


        // 如果这个员工工资高于 5000 则输出
        op1.filter(
                employee -> employee.getSalary() > 5000
        ).ifPresent(System.out::print);
        /*
        Employee{name='5号员工', age=29, partment='技术部', salary=8441}
         */


        System.out.println("--------------------------");

        Optional<Integer> op3 = Optional.of(100);

        Optional<String> stringOptional = op3.map(integer -> integer+100 + "");

        System.out.println(stringOptional.get());

        System.out.println("--------------------------");

        Optional<String> lastName = Optional.of("last");
        Optional<String> firstName = Optional.of("first");
        Optional<String> fullName = lastName.flatMap(
                ln -> firstName.map(f->String.join("  ",ln,f))
        );

        System.out.println(fullName.get());


    }
}
