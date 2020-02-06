package JDK_8.myNotes.J_Optional.p2;

import JDK_8.myNotes.J_Collectors.D_groupingBy.pojo.Employee;

import java.util.List;
import java.util.Optional;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/5
 * \* Time: 21:04
 * \* Description:
 * \
 */
public class M2 {

    public static void main(String[] args) {


        Optional<List<Employee>> op1 = Optional.of(Employee.supply_Ems());

        op1.get()
                .stream()
                .limit(5)
                .forEach(System.out::println);

        /*
        Employee{name='0号员工', age=28, partment='管理部', salary=5892}
        Employee{name='1号员工', age=43, partment='管理部', salary=2216}
        Employee{name='2号员工', age=24, partment='设计部', salary=7463}
        Employee{name='3号员工', age=32, partment='技术部', salary=3475}
        Employee{name='4号员工', age=48, partment='管理部', salary=5221}
         */

        System.out.println("--------------------------------------");
        Optional<Integer> o1 = Optional.of(100);
        Optional<Integer> o2 = Optional.of(100);
        Optional<Integer> o3 = Optional.ofNullable(null);

        System.out.println("");
        System.out.println(addFunction(o1,o2));

        System.out.println();
        System.out.println(addFunction(o1,o3));

        System.out.println("--------------------------------------");


        Optional<String> p1 = Optional.of("hello");
        Optional<String> p2 = Optional.of("world");
        Optional<String> p3 = Optional.ofNullable(null);

        System.out.println(function(p1,p2));

        System.out.println("");

        System.out.println(function(p1,p3));

    }


    public static Integer addFunction(Optional<Integer> x,Optional<Integer> y){

        // Optional.isPresent - 判断值是否存在

        System.out.println("第一个参数是否存在  " + x.isPresent()  );

        System.out.println("第二个参数是否存在  " + y.isPresent()  );

        // Optional.orElse - 如果值存在，返回它，否则返回默认值

        Integer i1 = x.orElse(0);

        Integer i2 = y.orElse(0);

        return i1+i2;
    }

    public static String function(Optional<String> o1, Optional<String> o2){

        return  o1.orElseGet(()->"o1 空参数")+"-----"+o2.orElseGet(()->"o2 空参数");

    }
}
