package chapter_13.c_13_6.c_13_6_1;

import java.util.Arrays;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:17 2020/1/4
 */
public class Splitting {

    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";
    public static void split(String regex) {
        System.out.println(
                Arrays.toString(knights.split(regex)));
    }
    public static void main(String[] args) {
        split(" "); // Doesn’t have to contain regex chars
        System.out.println("_____________________________");
        split("\\W+"); // Non-word characters
        System.out.println("_____________________________");
        split("n\\W+"); // ‘n’ followed by non-word characters
    }


}
