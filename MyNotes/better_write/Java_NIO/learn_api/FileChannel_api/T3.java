package better_write.Java_NIO.learn_api.FileChannel_api;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/4
 * \* Time: 14:09
 * \* Description:
 * \
 */
public class T3 {

    public static void main(String[] args) throws IOException, InterruptedException {

        File file = new File("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_NIO\\d.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

//        r1(fileInputStream.getChannel());

//        r2(fileInputStream.getChannel());

//        r3(fileInputStream.getChannel());

//        r4(fileInputStream.getChannel());

//        r5(fileInputStream.getChannel());

        r6(fileInputStream.getChannel());
    }

    /*
    检验 int read(ByteBuffer dst)方法返回值的意义

    正数  代表从通道的当前位置向缓冲区中读的字节个数

    0 代表从通道中没有读取任何数据  0字节

    -1 到达流的末端
     */
    private static void r1(FileChannel fileChannel) throws IOException {

        ByteBuffer buffer = ByteBuffer.allocate(5);
        int readLen = fileChannel.read(buffer);
        System.out.println(readLen);
        readLen = fileChannel.read(buffer);
        System.out.println(readLen);
        buffer.clear();
        readLen = fileChannel.read(buffer);
        System.out.println(readLen);
        buffer.clear();
        fileChannel.close();


    }


    /*
      验证 int read(ByteBuffer dst) 方法是从通道的当前位置开始读取的
     */
    private static void r2(FileChannel fileChannel) throws IOException {
        fileChannel.position(2);
        ByteBuffer buffer = ByteBuffer.allocate(5);
        fileChannel.read(buffer);

        byte[] bytes = buffer.array();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print((char)bytes[i] + "  ");
        }
        fileChannel.close();
    }

    /*
        验证 int read(ByteBuffer dst)将字节放入缓冲区当前位置
     */
    private static void r3(FileChannel fileChannel) throws IOException {
        fileChannel.position(2);
        ByteBuffer buffer = ByteBuffer.allocate(5);
        buffer.position(3);
        fileChannel.read(buffer);

        byte[] bytes = buffer.array();

        for (int i = 0; i < bytes.length; i++) {
            System.out.print((char) bytes[i] + "  ");
        }

        fileChannel.close();
    }


    /*
            验证 int read(ByteBuffer dst) 方法具有同步性

     */
    private static void  r4(FileChannel fileChannel) throws InterruptedException, IOException {

        for (int i = 0; i < 1; i++) {

            Thread thread1 = new Thread() {

                @Override
                public void run() {
                    ByteBuffer buffer = ByteBuffer.allocate(5);
                    int read = 0;
                    try {
                        read = fileChannel.read(buffer);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    while (read != -1) {
                        byte[] bytes = buffer.array();
                        System.out.println(new String(bytes,0,read));
                        buffer.clear();
                        try {
                            read = fileChannel.read(buffer);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };



            Thread threa2 = new Thread(){


                @Override
                public void run() {
                    ByteBuffer buffer = ByteBuffer.allocate(5);
                    int read = 0;
                    try {
                        read = fileChannel.read(buffer);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    while (read != -1) {
                        byte[] bytes = buffer.array();
                        System.out.println(new String(bytes,0,read));
                        buffer.clear();
                        try {
                            read = fileChannel.read(buffer);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };

            thread1.start();
            threa2.start();
        }

        Thread.sleep(3000);
        fileChannel.close();
    }

    /*
      验证 int read(ByteBuffer dst) 方法 从通道读取的数据大于缓冲区容量
     */
    private static void r5(FileChannel fileChannel) throws IOException {

        ByteBuffer buffer = ByteBuffer.allocate(3);
        System.out.println("po " + fileChannel.position());

        fileChannel.read(buffer);

        System.out.println("");

        System.out.println("po " + fileChannel.position());

        fileChannel.close();

        buffer.rewind();

        for (int i = 0; i < buffer.limit(); i++) {
            System.out.print((char)buffer.get());
        }
    }

    /*
    验证 int read(ByteBuffer dst)  方法从通道读取的字节放入缓冲区的remaining空间中
     */
    private static void r6(FileChannel fileChannel) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(100);
        buffer.position(1);
        buffer.limit(3);
        fileChannel.read(buffer);
        fileChannel.close();
        buffer.rewind();
        for (int i = 0; i < buffer.limit(); i++) {
            byte b = buffer.get();
            if (b == 0) {
                System.out.println("空格");
            } else {
                System.out.println((char) b);
            }

        }

    }
}
