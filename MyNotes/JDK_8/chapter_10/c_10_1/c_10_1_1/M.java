package JDK_8.chapter_10.c_10_1.c_10_1_1;

import JDK_8.chapter_10.c_10_1.A.Car;
import JDK_8.chapter_10.c_10_1.A.Insurance;
import JDK_8.chapter_10.c_10_1.A.Person;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 21:40
 * \* Description:
 * \
 */
public class M {

    public String getCarInsuranceName(Person person) {
        if (person != null) {
            Car car = person.getCar();
            if (car != null) {
                Insurance insurance = car.getInsurance();
                if (insurance != null) {
                    return insurance.getName();
                }
            }
        }
        return "Unknown";
    }
}
