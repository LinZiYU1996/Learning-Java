package chapter_13.c_13_6.c_13_6_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static chapter_6.c_6_1.c_6_1_3.Print.print;
import static chapter_6.c_6_1.c_6_1_3.Print.printnb;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:25 2020/1/4
 */
public class Groups {

    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";
    public static void main(String[] args) {
        Matcher m =
                Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$")
                        .matcher(POEM);
        while(m.find()) {
            for(int j = 0; j <= m.groupCount(); j++)
                printnb("[" + m.group(j) + "]");
            print();
        }
    }

}
