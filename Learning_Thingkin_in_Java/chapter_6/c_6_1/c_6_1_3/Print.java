package chapter_6.c_6_1.c_6_1_3;

import java.io.PrintStream;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:08 2019/12/26
 *
 * 定制工具库
 */
public class Print {

    // Print with a newline:
    public static void print(Object obj) {
        System.out.println(obj);
    }
    // Print a newline by itself:
    public static void print() {
        System.out.println();
    }
    // Print with no line break:
    public static void printnb(Object obj) {
        System.out.print(obj);
    }
    // The new Java SE5 printf() (from C):
    public static PrintStream
    printf(String format, Object... args) {
        return System.out.printf(format, args);
    }


}
