package better_write.Java_IO.Blog.A7;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/31
 * \* Time: 10:03
 * \* Description:
 * \
 */
public class T1 {


    public static void main(String[] args) throws IOException {

        String pathName = "E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\bb.txt";

        FileInputStream inputStream = new FileInputStream(pathName);

        DataInputStream in = new DataInputStream(inputStream);

//        int data = 0;
//
//        while ( (data = in.read()) != -1) {
//            System.out.println((char) data);
//        }

//        System.out.println(in.readByte());

        System.out.println(in.readInt());
        System.out.println(in.readInt());
        System.out.println(in.readInt());



        System.out.println(in.readInt());
//
//        System.out.println(in.readDouble());




    }






}
