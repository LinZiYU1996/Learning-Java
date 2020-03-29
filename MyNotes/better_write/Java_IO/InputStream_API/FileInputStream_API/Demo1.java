package better_write.Java_IO.InputStream_API.FileInputStream_API;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 18:29
 * \* Description:
 * \
 */
public class Demo1 {


    public static void main(String[] args) throws IOException {


        String pathName = "E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\InputStream_API\\FileInputStream_API\\aa.txt";

        File file = new File(pathName);



        System.out.println("创建文件\n");

        System.out.println(file.createNewFile());

        System.out.println("");


        FileInputStream fileInputStream = new FileInputStream(file);

//        while (fileInputStream.read() != -1) {
//
//            System.out.println(fileInputStream.read());
//
//        }

        System.out.println("");

        while (fileInputStream.read() != -1) {

            System.out.println((char) fileInputStream.read());

        }

    }
}
