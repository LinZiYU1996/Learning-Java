package chapter_15.c_15_4.c_15_4_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:11 2020/1/5
 */
public class CountedObject {


//    Counted Object类能够记录下它创建了多少个CountedObject实例，并通过toStringO方法知道编号
    private static long counter = 0;
    private final long id = counter++;
    public long id() { return id; }
    public String toString() { return "CountedObject " + id;}


}
