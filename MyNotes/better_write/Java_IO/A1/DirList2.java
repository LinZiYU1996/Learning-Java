package better_write.Java_IO.A1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 11:36
 * \* Description:
 * \
 */
public class DirList2 {

    public static FilenameFilter filenameFilter(final String regex) {

        return new FilenameFilter() {

            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {

                return pattern.matcher(name).matches();

            }
        };

    }


    public static void main(String[] args) {

        File path = new File(".");

        String[] list;

        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(filenameFilter(args[0]));

        }

        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);

        for (String s : list) {

            System.out.println(s);

        }

    }
}

