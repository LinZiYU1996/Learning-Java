package better_write.Java_IO.Blog.A4;

import java.io.File;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/30
 * \* Time: 15:28
 * \* Description:
 * \
 */
public class T5 {

    public static void main(String[] args) {

        String path1 = "E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\t1.txt";

        String path2 = "E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\t2.txt";

        File f1 = new File(path1);

        File f2 = new File(path2);

        System.out.println(f1.compareTo(f2));



    }
}
