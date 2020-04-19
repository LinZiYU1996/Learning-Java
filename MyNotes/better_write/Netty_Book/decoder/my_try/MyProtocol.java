package better_write.Netty_Book.decoder.my_try;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/18
 * \* Time: 9:46
 * \* Description:
 * \
 */
public class MyProtocol {

    private int length;

    private String content;

    public MyProtocol(int length, String content) {
        this.length = length;
        this.content = content;
    }

    @Override
    public String toString() {
        return "MyProtocol{" +
                "length=" + length +
                ", content='" + content + '\'' +
                '}';
    }
}
