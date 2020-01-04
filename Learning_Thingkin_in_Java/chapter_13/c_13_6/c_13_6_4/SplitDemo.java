package chapter_13.c_13_6.c_13_6_4;

import java.util.Arrays;
import java.util.regex.Pattern;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:28 2020/1/4
 */
public class SplitDemo {

    public static void main(String[] args) {
        String input =
                "This!!unusual use!!of exclamation!!points";
        print(Arrays.toString(
                Pattern.compile("!!").split(input)));
// Only do the first three:
        print(Arrays.toString(
                Pattern.compile("!!").split(input, 3)));
    }


}
