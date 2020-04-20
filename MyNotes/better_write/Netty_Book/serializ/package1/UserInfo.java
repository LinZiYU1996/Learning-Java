package better_write.Netty_Book.serializ.package1;

import java.io.Serializable;
import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/19
 * \* Time: 18:10
 * \* Description:
 * \
 */
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private int userID;

    private String userName;

    public UserInfo buildUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public UserInfo buildUserId(int userID) {
        this.userID = userID;
        return this;
    }

    public final  String getUserName() {
        return userName;
    }

    public final  void setUserName(String userName) {
        this.userName = userName;
    }


    public final int getUserID() {
        return userID;
    }

    public final void setUserID(int userID) {
        this.userID = userID;
    }

    public byte[] codeC() {

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        byte[] val = this.userName.getBytes();
        buffer.putInt(val.length);
        buffer.put(val);
        buffer.putInt(this.userID);
        buffer.flip();
        val = null;
        byte[] res = new byte[buffer.remaining()];
        buffer.get(res);
        return res;

    }

    public byte[] codeC(ByteBuffer byteBuffer) {

        byteBuffer.clear();

        byte[] val = this.userName.getBytes();

        byteBuffer.putInt(val.length);

        byteBuffer.put(val);

        byteBuffer.putInt(this.userID);

        byteBuffer.flip();

        val = null;

        byte[] res = new byte[byteBuffer.remaining()];

        byteBuffer.get(res);

        return res;

    }
}
