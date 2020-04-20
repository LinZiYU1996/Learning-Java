package better_write.Netty_Book.decoder.my_try_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/19
 * \* Time: 15:14
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
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
