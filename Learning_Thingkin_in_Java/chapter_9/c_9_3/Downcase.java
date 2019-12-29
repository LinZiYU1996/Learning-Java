package chapter_9.c_9_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:35 2019/12/29
 */
public class Downcase extends Processor{

    String process(Object input) {
        return ((String)input).toLowerCase();
    }
}
