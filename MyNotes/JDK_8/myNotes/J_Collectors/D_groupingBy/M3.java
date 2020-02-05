package JDK_8.myNotes.J_Collectors.D_groupingBy;

import JDK_8.myNotes.J_Collectors.D_groupingBy.pojo.Employee;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/4
 * \* Time: 20:54
 * \* Description:
 * \
 */
public class M3 {

    public static void main(String[] args) {

        List<Employee> employees = Employee.supply_Ems();

        // 计算每个部门各有多少人

        Map<String,Long> map1 = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getPartment,
                        Collectors.counting()
                ));

        map1.forEach(
                (k,v)->
                        System.out.println(k + "    " + v)
        );

        /*
        财务部    3
        技术部    5
        设计部    6
        市场部    8
        管理部    1
        公关部    7
         */

        System.out.println("-----------------------------------");

        /*  多层分组   */

        // 按照工资进行划分评价
        Function<Employee,String> f1 = employee ->
        {
            if (employee.getSalary() > 5000) {
                return "工资不错";
            } else {
                return "工资一般";
            }
        };

        Map<String,Map<String,List<Employee>>> mapMap = employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getPartment,
                                Collectors.groupingBy(
                                     f1
                                )
                        )
                );

        mapMap.forEach(
                (k,v)->
                        System.out.println(k+v)
        );
        /*
        财务部    {工资一般=[Employee{name='5号员工', age=31, partment='财务部', salary=2733}, Employee{name='6号员工', age=42, partment='财务部', salary=4051}, Employee{name='14号员工', age=33, partment='财务部', salary=2347}, Employee{name='23号员工', age=44, partment='财务部', salary=2823}], 工资不错=[Employee{name='0号员工', age=40, partment='财务部', salary=6892}, Employee{name='12号员工', age=45, partment='财务部', salary=8296}, Employee{name='16号员工', age=27, partment='财务部', salary=6659}]}
        技术部    {工资不错=[Employee{name='7号员工', age=45, partment='技术部', salary=7158}, Employee{name='20号员工', age=24, partment='技术部', salary=7582}, Employee{name='29号员工', age=41, partment='技术部', salary=8372}], 工资一般=[Employee{name='1号员工', age=24, partment='技术部', salary=3436}, Employee{name='17号员工', age=39, partment='技术部', salary=2145}, Employee{name='27号员工', age=29, partment='技术部', salary=1580}]}
        设计部    {工资不错=[Employee{name='25号员工', age=38, partment='设计部', salary=8699}, Employee{name='26号员工', age=32, partment='设计部', salary=8503}], 工资一般=[Employee{name='2号员工', age=32, partment='设计部', salary=2732}, Employee{name='3号员工', age=28, partment='设计部', salary=3955}, Employee{name='18号员工', age=35, partment='设计部', salary=1583}]}
        市场部    {工资不错=[Employee{name='15号员工', age=49, partment='市场部', salary=6133}], 工资一般=[Employee{name='11号员工', age=29, partment='市场部', salary=1973}, Employee{name='21号员工', age=26, partment='市场部', salary=4726}]}
        管理部    {工资一般=[Employee{name='24号员工', age=39, partment='管理部', salary=3012}], 工资不错=[Employee{name='10号员工', age=32, partment='管理部', salary=8683}, Employee{name='19号员工', age=50, partment='管理部', salary=5210}]}
        公关部    {工资一般=[Employee{name='9号员工', age=37, partment='公关部', salary=3248}], 工资不错=[Employee{name='4号员工', age=50, partment='公关部', salary=6770}, Employee{name='8号员工', age=42, partment='公关部', salary=8611}, Employee{name='13号员工', age=39, partment='公关部', salary=7496}, Employee{name='22号员工', age=48, partment='公关部', salary=8740}, Employee{name='28号员工', age=24, partment='公关部', salary=5860}]}
         */

        System.out.println("-----------------------------------");


        // 统计每个部门 工资 高于8000的人数各有多少
        Map<String,Long> map2 = employees.stream()
                .filter(employee -> employee.getSalary() > 8000)
                .collect(
                        Collectors.groupingBy(
                                Employee::getPartment,
                                Collectors.counting()
                        )
                );

        map2.forEach(
                (k,v)->
                        System.out.println(k+"  ---  "+v)
        );


    }
}
