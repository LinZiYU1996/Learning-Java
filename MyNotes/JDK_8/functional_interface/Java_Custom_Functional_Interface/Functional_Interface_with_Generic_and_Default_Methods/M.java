package JDK_8.functional_interface.Java_Custom_Functional_Interface.Functional_Interface_with_Generic_and_Default_Methods;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:41
 * \* Description:
 * \
 */
public class M {


    public static void main(String[] args) {

        DataCombiner<Project> dataCombiner = (Project p) -> {
            if(p.getLocation() == null) {
                return p.getPname()+" : " + p.getTeamLead();
            } else {
                return p.getPname()+" : " + p.getTeamLead() + " : " + p.getLocation();
            }
        };

        InfoProvider<Employee, Project> infoProvider = (Employee emp) -> {
            if(emp.getId() > 100) {
                return new Project("ABCD", emp.getName());
            } else {
                return new Project("PQRS", emp.getName());
            }
        };

//        InfoProvider<Employee, Project> infoProvider_1 = (Employee emp) -> {
//            if(emp.getId() > 100) {
//                return new Project("ABCD", emp.getName());
//            } else {
//                return new Project("PQRS", emp.getName());
//            }
//        };
//        String s = infoProvider.addMore(extraInfoProvider)
//                .addCombiner(dataCombiner).combine(new Employee(50, "Mahesh"));
//
//        System.out.println(s);

    }
}
