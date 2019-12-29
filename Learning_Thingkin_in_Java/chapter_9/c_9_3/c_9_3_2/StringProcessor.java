package chapter_9.c_9_3.c_9_3_2;



/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:47 2019/12/29
 */
public abstract class StringProcessor implements Processor{

    public String name() {
        return getClass().getSimpleName();
    }
    public abstract String process(Object input);
    public static String s =
            "If she weighs the same as a duck, she’s made of wood";
    public static void main(String[] args) {
        Apply.process(new Upcase(), s);
        Apply.process(new Downcase(), s);
        Apply.process(new Splitter(), s);
    }



}
