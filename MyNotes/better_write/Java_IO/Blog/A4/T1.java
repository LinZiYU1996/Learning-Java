package better_write.Java_IO.Blog.A4;

import java.io.File;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/30
 * \* Time: 10:56
 * \* Description:
 * \
 */
public class T1 {


    public static void main(String[] args) throws IOException {

        String pathName = "E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\d.txt";

        File file = new File(pathName);

        System.out.println("exists ? \n");
        System.out.println(file.exists());

        System.out.println("----------------------------------------------------------");

//        System.out.println(file.length());

        System.out.println("canExecute ? \n");
        System.out.println(file.canExecute());

        System.out.println("----------------------------------------------------------");

        System.out.println("canRead ? \n");
        System.out.println(file.canRead());

        System.out.println("----------------------------------------------------------");

        System.out.println("canWrite ? \n");
        System.out.println(file.canWrite());

        System.out.println("----------------------------------------------------------");

        System.out.println("isFile ? \n");
        System.out.println(file.isFile());

        System.out.println("----------------------------------------------------------");

        System.out.println("isDirectory ? \n");
        System.out.println(file.isDirectory());

        System.out.println("----------------------------------------------------------");

        System.out.println("isAbsolute ? \n");
        System.out.println(file.isAbsolute());

        System.out.println("----------------------------------------------------------");

        System.out.println("isHidden ? \n");
        System.out.println(file.isHidden());

        System.out.println("----------------------------------------------------------");

        System.out.println("getName  \n");
        System.out.println(file.getName());

        System.out.println("----------------------------------------------------------");

        System.out.println("getUsableSpace  \n");
        System.out.println(file.getUsableSpace());

        System.out.println("----------------------------------------------------------");

        System.out.println("getTotalSpace  \n");
        System.out.println(file.getTotalSpace());

        System.out.println("----------------------------------------------------------");

        System.out.println("getPath  \n");
        System.out.println(file.getPath());

        System.out.println("----------------------------------------------------------");


        System.out.println("getParentFile  \n");
        System.out.println(file.getParentFile());

        System.out.println("----------------------------------------------------------");


        System.out.println("getParent  \n");
        System.out.println(file.getParent());

        System.out.println("----------------------------------------------------------");

        System.out.println("getFreeSpace  \n");
        System.out.println(file.getFreeSpace());

        System.out.println("----------------------------------------------------------");

        System.out.println("getCanonicalPath  \n");
        System.out.println(file.getCanonicalPath());

        System.out.println("----------------------------------------------------------");


        System.out.println("getCanonicalFile  \n");
        System.out.println(file.getCanonicalFile());

        System.out.println("----------------------------------------------------------");

    }
}
