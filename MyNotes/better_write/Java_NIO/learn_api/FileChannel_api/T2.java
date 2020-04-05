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
 * \* Time: 11:54
 * \* Description:
 * \
 */
public class T2 {

    public static void main(String[] args) throws IOException, InterruptedException {

        File file = new File("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_NIO\\c.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

//        w1(fileOutputStream.getChannel());

//        w2(fileOutputStream.getChannel());

        w3(fileOutputStream.getChannel());
    }


    /*
    验证 int write(ByteBuffer src)方法是从通道的当前位置开始写入的
     */
    private static void w1(FileChannel fileChannel) throws IOException {

        ByteBuffer buffer = ByteBuffer.wrap("abcde".getBytes());
        System.out.println(" 1 channle position : \n"
        + fileChannel.position()
        +"\n");
        System.out.println("write 1 返回值 : \n"
        +fileChannel.write(buffer)
        +"\n");
        System.out.println("2 channel position : \n"
        + fileChannel.position()
        +"\n");
        fileChannel.position(2);
        buffer.rewind();
        System.out.println("write 2 返回值 : \n"
        +fileChannel.write(buffer)
        +"\n");
        System.out.println("3 channel position : \n"
        +fileChannel.position()
        + "\n");

        fileChannel.close();

    }


    /*
    验证 int write(ByteBuffer src)将ByteBuffer的remaining写入通道
     */
    private static void w2(FileChannel fileChannel) throws IOException {

        ByteBuffer buffer1 = ByteBuffer.wrap("abcdefg".getBytes());
        ByteBuffer buffer2 = ByteBuffer.wrap("123456789".getBytes());

        fileChannel.write(buffer1);

        buffer2.position(1);
        buffer2.limit(3);

        fileChannel.position(2);
        fileChannel.write(buffer2);

        fileChannel.close();
    }



    private static void w3(FileChannel fileChannel) throws InterruptedException, IOException {


        for (int i = 0; i < 10; i++) {

            Thread thread  = new Thread() {
                @Override
                public void run() {

                    ByteBuffer buffer = ByteBuffer.wrap("abcde\r\n".getBytes());
                    try {
                        fileChannel.write(buffer);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            };


            Thread thread1 = new Thread(){
                @Override
                public void run() {
                    ByteBuffer buffer = ByteBuffer.wrap("我是中国人\r\n".getBytes());
                    try {
                        fileChannel.write(buffer);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };

            thread.start();
            thread1.start();

        }

        Thread.sleep(3000);
        fileChannel.close();

    }

}
