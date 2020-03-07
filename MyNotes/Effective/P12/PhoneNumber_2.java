package Effective.P12;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/7
 * \* Time: 19:43
 * \* Description:
 * \
 */
public class PhoneNumber_2 {

    private final int areaCode;

    private final int prefix;

    private final int lineNumber;

    public PhoneNumber_2(int areaCode, int prefix, int lineNumber) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }


    @Override
    public String toString() {
        return String.format(
                "(%03d) %03d-%04d",
                areaCode,prefix,lineNumber
        );
    }

    public static void main(String[] args) {

        PhoneNumber_2 p1 = new PhoneNumber_2(100,100,100);

        System.out.println(p1);

    }
}
