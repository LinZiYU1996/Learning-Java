package chapter_13.c_13_6.c_13_6_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:30 2020/1/4
 */
public class Resetting {
    public static void main(String[] args) throws Exception {
        Matcher m = Pattern.compile("[frb][aiu][gx]")
                .matcher("fix the rug with bags");
        while(m.find())System.out.print(m.group() + " ");
        System.out.println();
        m.reset("fix the rig with rags");
        while(m.find())
            System.out.print(m.group() + " ");
    }
}
