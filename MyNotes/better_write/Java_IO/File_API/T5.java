package better_write.Java_IO.File_API;

import java.io.File;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 15:01
 * \* Description:
 * \
 */
public class T5 {


    public static void main(String[] args) throws IOException {

        String pathname = "E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\File_API\\aa.txt";

        File file = new File(pathname);

        System.out.println("创建文件: \n");


        System.out.println(create_file(file));

        System.out.println("");

        System.out.println(file.getAbsoluteFile());

        System.out.println("");

        System.out.println(file.getAbsolutePath());

        System.out.println("");

        System.out.println(file.getCanonicalFile());

        System.out.println("");

        System.out.println(file.getCanonicalPath());

        System.out.println("");

        System.out.println(file.getFreeSpace());

        System.out.println("");

        System.out.println(file.getName());

        System.out.println("");

        System.out.println(file.getParent());

        System.out.println("");

        System.out.println(file.getParentFile());

        System.out.println("");

        System.out.println(file.getPath());

        System.out.println("");

        System.out.println(file.getTotalSpace());

        System.out.println("");

        System.out.println(file.getUsableSpace());

        System.out.println("");

        System.out.println(file.isAbsolute());

        System.out.println("");

        System.out.println(file.isDirectory());

        System.out.println("");

        System.out.println(file.isFile());

        System.out.println("");

//        for (String s : file.list()) {
//            System.out.println(s);


        System.out.println("");

        System.out.println(file.lastModified());

        System.out.println("");

        /*  针对目录了 */

        String pathname1 = "E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\File_API\\l";

        File file1 = new File(pathname1);

        System.out.println("创建目录: \n");

        System.out.println(file1.mkdir());











    }


    public static boolean create_file(File file) throws IOException {



        return file.createNewFile();


    }
}
