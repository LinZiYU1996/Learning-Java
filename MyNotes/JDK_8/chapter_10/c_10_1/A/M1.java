package JDK_8.chapter_10.c_10_1.A;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 21:38
 * \* Description:
 * \
 */
public class M1 {

    public String getCarInsuranceName(Person person) {
        return person.getCar().getInsurance().getName();
    }

    public static void main(String[] args) {



    }
}
