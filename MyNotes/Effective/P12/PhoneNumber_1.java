package Effective.P12;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/7
 * \* Time: 19:41
 * \* Description:
 * \
 */
public class PhoneNumber_1 {


    private final short areaCode;

    private final short prefix;

    private final short lineNumber;


    public PhoneNumber_1(int areaCode, int prefix, int lineNumber) {
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }


    @Override
    public String toString() {
        return "PhoneNumber_1{" +
                "areaCode=" + areaCode +
                ", prefix=" + prefix +
                ", lineNumber=" + lineNumber +
                '}';
    }

    public static void main(String[] args) {

        PhoneNumber_1 p1 = new PhoneNumber_1(1,1,1);

        System.out.println(p1);

        System.out.println("---------------");

        PhoneNumber_1 p2 = new PhoneNumber_1(100,100,100);

        System.out.println(p2);


    }

}
