package better_write.Java_IO.A1;

import java.io.File;
import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 11:18
 * \* Description:
 * \
 */
public class DirList {

    public static void main(String[] args) {


        File path = new File(".");

        String[] list;

        if (args.length == 0) {
            list = path.list();
            System.out.println("---");
        } else {

            list = path.list(new DifFilter(args[0]));

        }

        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);

        for (String dirItem:list) {
            System.out.println(dirItem);
        }



    }


}
