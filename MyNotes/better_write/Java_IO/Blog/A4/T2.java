package better_write.Java_IO.Blog.A4;

import java.io.File;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/30
 * \* Time: 11:29
 * \* Description:
 * \
 */
public class T2 {

    public static void main(String[] args) throws IOException {

        String pathName = "E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\op.txt";

        File file = new File(pathName);

        System.out.println("创建新文件\n");
        System.out.println(file.createNewFile());

        System.out.println("--------------");

        String prefix = "etcedk";

        String suffix = ".txt";


        File file2 = File.createTempFile(prefix,suffix);

        System.out.println(file2.getName());

        System.out.println(file2.getAbsolutePath());


    }
}
