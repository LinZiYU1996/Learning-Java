package chapter_9.c_9_3.c_9_3_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:47 2019/12/29
 */
public class Upcase extends StringProcessor{

    public String process(Object input) { // Covariant return
        return ((String)input).toUpperCase();
    }
}
