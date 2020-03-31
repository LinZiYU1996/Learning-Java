package better_write.Java_IO.Blog.A4;

import java.io.File;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/30
 * \* Time: 11:53
 * \* Description:
 * \
 */
public class T {


    public static void main(String[] args) {

        String pathName = "E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO";

        File file = new File(pathName);
        for (String s : file.list()) {

            System.out.println(s);

        }

        System.out.println("-------------------------------------------------");


        for (File f : file.listFiles()) {

            System.out.println(f.getAbsolutePath());
        }


    }
}
