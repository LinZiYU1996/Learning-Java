package better_write.Java_IO.Blog.A4;

import java.io.File;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/30
 * \* Time: 15:24
 * \* Description:
 * \
 */
public class T4 {


    public static void main(String[] args) {

        String pathName = "E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\IG";

        File file = new File(pathName);

        System.out.println("创建目录 : \n");

        System.out.println(file.mkdir());


    }
}
