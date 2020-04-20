package better_write.Netty_Book.serializ.package1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/19
 * \* Time: 21:29
 * \* Description:
 * \
 */
public class PerformTestUserInfo {

    public static void main(String[] args) throws IOException {

        UserInfo info = new UserInfo();

        info.buildUserId(100).buildUserName("welcome to netty");

        int loop = 100000;

        ByteArrayOutputStream bos = null;

        ObjectOutputStream os = null;

        long start = System.currentTimeMillis();

        for (int i = 0; i < loop; i++) {

            bos = new ByteArrayOutputStream();

            os = new ObjectOutputStream(bos);

            os.writeObject(info);

            os.flush();

            os.close();

            byte[] b = bos.toByteArray();

            bos.close();

        }

        long end = System.currentTimeMillis();

        System.out.println("cost time is "
        + (end - start) + " ms");

        System.out.println("----------------------------");

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        start = System.currentTimeMillis();

        for (int i = 0; i < loop; i++) {
            byte[] b = info.codeC(buffer);
        }

         end = System.currentTimeMillis();

        System.out.println("cost time is "
                + (end - start) + " ms");


    }
    /*
    cost time is 276 ms
    ----------------------------
    cost time is 43 ms
     */
}
