package chapter_13.c_13_6.c_13_6_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static chapter_6.c_6_1.c_6_1_3.Print.print;
import static chapter_6.c_6_1.c_6_1_3.Print.printnb;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:23 2020/1/4
 */
public class Finding {

    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+")
                .matcher("Evening is full of the linnet’s wings");
        while(m.find())
            printnb(m.group() + " ");
        print();
        int i = 0;
        while(m.find(i)) {
            printnb(m.group() + " ");
            i++;
        }
    }


}
