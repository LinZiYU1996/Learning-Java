package better_write.Java_IO.Blog.A7;

import java.io.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/31
 * \* Time: 10:25
 * \* Description:
 * \
 */
public class T2 {


    public static void main(String[] args) throws IOException {

        String pathName = "E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\k.txt";
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(pathName));
        dos.writeUTF("α");
        dos.writeInt(1234567);
        dos.writeBoolean(true);
        dos.writeShort((short)123);
        dos.writeLong((long)456);
        dos.writeDouble(99.98);
        DataInputStream dis = new DataInputStream(new FileInputStream(pathName));
        System.out.println(dis.readUTF());
        System.out.println(dis.readInt());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readShort());
        System.out.println(dis.readLong());
        System.out.println(dis.readDouble());
        dis.close();
        dos.close();

    }
}
