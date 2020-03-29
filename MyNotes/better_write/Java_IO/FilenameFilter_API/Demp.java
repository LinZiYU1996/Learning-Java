package better_write.Java_IO.FilenameFilter_API;

import java.io.File;
import java.io.FilenameFilter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 15:23
 * \* Description:
 * \
 */
public class Demp {


    public static void main(String[] args) {

        String pathName = "E:\\learn-java\\Learning-Java\\MyNotes\\jvm";

        File file = new File(pathName);

        File[] files = file.listFiles(new MyFilter());

        for (File file1 : files) {

            System.out.println(file1.getName());
        }

        System.out.println("");

        String[] strings = file.list(new MyFilter());

        for (String s : strings) {

            System.out.println(s);

        }

    }

    static class MyFilter implements FilenameFilter {


        @Override
        public boolean accept(File dir, String name) {
            if (name != null && name.toLowerCase().endsWith(".java")) {
                return true;
            } else {
                return false;
            }
        }
    }

}
