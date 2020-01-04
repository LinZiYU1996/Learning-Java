package chapter_13.c_13_6.c_13_6_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:27 2020/1/4
 */
public class ReFlags {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("^java",
                Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        Matcher m = p.matcher(
                "java has regex\nJava has regex\n" +
                        "JAVA has pretty good regular expressions\n" +
                        "Regular expressions are in Java");
        while(m.find())
            System.out.println(m.group());
    }
}
