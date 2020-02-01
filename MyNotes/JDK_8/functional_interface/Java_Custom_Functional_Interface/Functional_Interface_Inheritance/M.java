package JDK_8.functional_interface.Java_Custom_Functional_Interface.Functional_Interface_Inheritance;

import JDK_8.functional_interface.Java_Custom_Functional_Interface.Functional_Interface_with_Generic_and_Default_Methods.Employee;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:44
 * \* Description:
 * \
 */
public class M {


    public static void main(String[] args) {
        DataReceiver<Employee> dataReceiver = (Employee emp) -> emp.getId() + "-" + emp.getName();

        TaskHandler tskHandler = (res) -> System.out.println(res);

        dataReceiver.receive(tskHandler, new Employee(101, "Krishna"));
    }
}
