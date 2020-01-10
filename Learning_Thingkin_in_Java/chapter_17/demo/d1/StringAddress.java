package chapter_17.demo.d1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/10
 * \* Time: 9:39
 * \* Description:
 * \
 */
public class StringAddress {

    private String string;

    public StringAddress(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "StringAddress{" +
                "string='" + string + '\'' +
                '}';
    }
}
