package better_write.Java_NIO.learn_api.Buffer_api.P1;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/2
 * \* Time: 20:02
 * \* Description:
 * \
 */
public class T6 {

    public static void main(String[] args) {

        ByteBuffer b1 = ByteBuffer.wrap(new byte[]{'1','2','3'});
        ByteBuffer b2 = ByteBuffer.wrap(new byte[]{'1','2','3'});
        ByteBuffer b3 = ByteBuffer.wrap(new byte[]{'1','2','3'});
        ByteBuffer b4 = ByteBuffer.wrap(new byte[]{'1','2','3'});
        ByteBuffer b5 = ByteBuffer.wrap(new byte[]{'1','2','3'});

        List<ByteBuffer> list = new ArrayList<>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);

        ByteBuffer[] byteBuffers = new ByteBuffer[list.size()];
        list.toArray(byteBuffers);

        System.out.println("--------------------------");


        System.out.println(byteBuffers.length);

        for (int i = 0; i < byteBuffers.length; i++) {

            ByteBuffer byteBuffer = byteBuffers[i];

            while (byteBuffer.hasRemaining()) {

                System.out.println((char)byteBuffer.get());

            }

            System.out.println("--------------------------");

        }



    }
}

