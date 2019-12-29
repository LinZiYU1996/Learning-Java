package chapter_9.c_9_3.c_9_3_2;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:46 2019/12/29
 */
public class Apply {

    public static void process(Processor p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s));
    }


}
