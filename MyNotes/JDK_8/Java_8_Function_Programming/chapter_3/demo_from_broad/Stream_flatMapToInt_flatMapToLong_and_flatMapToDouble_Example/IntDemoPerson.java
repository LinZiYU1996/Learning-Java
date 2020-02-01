package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_flatMapToInt_flatMapToLong_and_flatMapToDouble_Example;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:22
 * \* Description:
 * \
 */
public class IntDemoPerson {


    private String name;
    private int[] luckyNum;
    public IntDemoPerson(String name, int[] luckyNum){
        this.name = name;
        this.luckyNum = luckyNum;
    }
    public String getName() {
        return name;
    }
    public int[] getLuckyNum() {
        return luckyNum;
    }


    @Override
    public String toString() {
        return "IntDemoPerson{" +
                "name='" + name + '\'' +
                ", luckyNum=" + Arrays.toString(luckyNum) +
                '}';
    }
}
