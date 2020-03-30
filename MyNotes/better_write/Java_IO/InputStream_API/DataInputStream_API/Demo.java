package better_write.Java_IO.InputStream_API.DataInputStream_API;

import java.io.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/29
 * \* Time: 9:38
 * \* Description:
 * \
 */
public class Demo {

/*

如果你需要读取的数据是由大于一个字节的java基础类型构成，比如int, long, float, double等，那么用DataInputStream是很方便的。DataInputStream希望的数据是写入到网络的有序多字节数据。
你经常会使用一个DataInputStream去读DataOutputStream写好的数据。




 */
    public static void main(String[] args) throws IOException {

        DataOutputStream dataOutputStream =
                new DataOutputStream(
                        new FileOutputStream("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\InputStream_API\\DataInputStream_API\\data.bin"));

        dataOutputStream.writeInt(123);
        dataOutputStream.writeFloat(123.45F);
        dataOutputStream.writeLong(789);

        dataOutputStream.close();

        DataInputStream dataInputStream =
                new DataInputStream(
                        new FileInputStream("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\InputStream_API\\DataInputStream_API\\data.bin"));

        int   int123     = dataInputStream.readInt();
        float float12345 = dataInputStream.readFloat();
        long  long789    = dataInputStream.readLong();

        dataInputStream.close();

        System.out.println("int123     = " + int123);
        System.out.println("float12345 = " + float12345);
        System.out.println("long789    = " + long789);

    }
}
