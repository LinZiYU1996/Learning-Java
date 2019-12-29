package chapter_9.c_9_3.c_9_3_2;

import java.util.Arrays;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:48 2019/12/29
 */
public class Splitter extends StringProcessor{

    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }


}
