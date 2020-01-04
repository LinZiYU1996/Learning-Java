package chapter_13.c_13_6.c_13_6_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:20 2020/1/4
 */
public class Rudolph {

    public static void main(String[] args) {
        for (String pattern : new String[]{"Rudolph",
                "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*"})
            System.out.println("Rudolph".matches(pattern));
    }


}
