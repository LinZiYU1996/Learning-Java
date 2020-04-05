package better_write.Java_NIO.learn_api.FileChannel_api;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/4
 * \* Time: 20:28
 * \* Description:
 * \
 */
public class T6 {

    public static void main(String[] args) throws IOException {

        ByteBuffer buffer1 = ByteBuffer.wrap("abcd".getBytes());
        ByteBuffer buffer2 = ByteBuffer.wrap("cde".getBytes());

        FileOutputStream fileOutputStream = new FileOutputStream(new File("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_NIO\\aa.txt"));

        FileChannel channel = fileOutputStream.getChannel();

        System.out.println("A :\n"+channel.position()
        +"\n"
        +"Size : \n"
        +channel.size());

        System.out.println("---------------------------------------");

        channel.write(buffer1);

        System.out.println("B :\n"+channel.position()
                +"\n"
                +"Size : \n"
                +channel.size());



        System.out.println("---------------------------------------");


        channel.position(2);

        System.out.println("C :\n"+channel.position()
                +"\n"
                +"Size : \n"
                +channel.size());



        System.out.println("---------------------------------------");

        channel.write(buffer2);

        System.out.println("D :\n"+channel.position()
                +"\n"
                +"Size : \n"
                +channel.size());



        System.out.println("---------------------------------------");

        channel.close();

        fileOutputStream.flush();

        fileOutputStream.close();

    }


}
