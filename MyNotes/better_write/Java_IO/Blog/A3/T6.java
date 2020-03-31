package better_write.Java_IO.Blog.A3;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/30
 * \* Time: 10:40
 * \* Description:
 * \
 */
public class T6 {


    public static void main(String[] args) throws IOException {

        RandomAccessFile accessFile = new RandomAccessFile("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\f.txt", "rw");

//        System.out.println(accessFile.length());//

//        System.out.println(accessFile.getFilePointer());


        //从下表 5（包括） 的位置开始读取
//        accessFile.seek(5);
//

        accessFile.skipBytes(5);

        int data = accessFile.read();

        while (data != -1) {
            System.out.println((char) data);

            data = accessFile.read();
        }
        accessFile.close();
    }
}
