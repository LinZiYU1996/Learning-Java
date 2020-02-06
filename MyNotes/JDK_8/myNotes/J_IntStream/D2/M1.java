package JDK_8.myNotes.J_IntStream.D2;

import JDK_8.myNotes.J_Collectors.D_groupingBy.pojo.Employee;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/5
 * \* Time: 13:30
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {


        List<Employee> employees = Employee.supply_Ems();

        IntStream intStream1 = IntStream.of(1,2,3,4,5,6,7,8,9);

        int sum = intStream1.sum();

        System.out.println(sum);

        System.out.println("---------------------------------------");

        //统计员工工资
        IntStream intStream2 = employees.stream()
                            .mapToInt(Employee::getSalary);

//        intStream2.forEach(System.out::println);

        //统计工资总数
//        int sum1  = intStream2.sum();

//        System.out.println(sum1);

        System.out.println("---------------------");
// 找出最低工资
//        OptionalInt optionalInt = intStream2.min();
//
//        System.out.println(optionalInt.getAsInt());

        System.out.println("---------------------");


        // 找出最高工资

//        OptionalInt optionalInt2 = intStream2.max();
//
//        System.out.println(optionalInt2.getAsInt());


//        long num = intStream2.count();
//// 数据个数
//        System.out.println(num);

        System.out.println("---------------------");


        // 平均工资
//        OptionalDouble d1 = intStream2.average();
//
//        System.out.println(d1.getAsDouble());

        System.out.println("---------------------");

        IntSummaryStatistics intSummaryStatistics = intStream2.summaryStatistics();

        System.out.println(intSummaryStatistics.toString());

        /*
        IntSummaryStatistics{count=30, sum=173068, min=1621, average=5768.933333, max=9000}

         */

    }
}
