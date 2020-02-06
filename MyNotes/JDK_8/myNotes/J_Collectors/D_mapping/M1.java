package JDK_8.myNotes.J_Collectors.D_mapping;

import JDK_8.myNotes.J_Collectors.D_groupingBy.pojo.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/4
 * \* Time: 14:14
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<Employee> employees = Employee.supply_Ems();

        // 统计 每个部门下员工名字
        Map<String,List<String>> map1 = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getPartment,
                        Collectors.mapping(Employee::getName,Collectors.toList())
                ));

        map1.forEach(
                (k,v)->
                        System.out.println(k + "    " + v)
        );

        /*
        财务部    [0号员工, 1号员工, 8号员工, 10号员工, 14号员工, 15号员工, 16号员工, 18号员工, 19号员工, 20号员工, 21号员工]
        技术部    [3号员工, 4号员工, 29号员工]
        设计部    [7号员工, 25号员工, 27号员工]
        市场部    [5号员工, 11号员工]
        公关部    [12号员工, 13号员工, 22号员工, 23号员工, 24号员工, 26号员工, 28号员工]
        管理部    [2号员工, 6号员工, 9号员工, 17号员工]
         */
    }
}
