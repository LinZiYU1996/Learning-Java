package chapter_15.c_15_2.demo.d3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:34 2020/1/7
 */
public class Coffee {

    private static long counter = 0;

//   counter 每次赋值后自动+1   id用来记录生成次数
    private final long id = counter++;
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }


}
