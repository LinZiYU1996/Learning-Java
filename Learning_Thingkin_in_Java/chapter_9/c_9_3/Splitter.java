package chapter_9.c_9_3;

import java.util.Arrays;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:35 2019/12/29
 */
public class Splitter extends Processor{

    String process(Object input) {
// The split() argument divides a String into pieces:
        return Arrays.toString(((String)input).split(" "));
    }



}
