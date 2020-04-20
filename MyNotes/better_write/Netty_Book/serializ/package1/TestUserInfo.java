package better_write.Netty_Book.serializ.package1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/19
 * \* Time: 18:15
 * \* Description:
 * \
 */
public class TestUserInfo {

    public static void main(String[] args) throws IOException {

        UserInfo userInfo = new UserInfo();

        userInfo.buildUserId(100).buildUserName("hello ao netty ");

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);

        objectOutputStream.writeObject(userInfo);

        objectOutputStream.flush();

        objectOutputStream.close();

        byte[] b = byteArrayOutputStream.toByteArray();

        System.out.println("the jdk seri len is : "
        + b.length);

        byteArrayOutputStream.close();

        System.out.println("----------");

        System.out.println("the byte array se length is "
        + userInfo.codeC().length);

/*
the jdk seri len is : 134
----------
the byte array se length is 23
 */

    }
}
