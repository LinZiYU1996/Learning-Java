package chapter_6.c_6_1.c_6_1_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:10 2019/12/26
 *
 * 该库的第二个组件可以是range（）方法，该方法在
 * 控制执行一章，允许对简单整数使用foreach语法顺序
 */
public class Range {

    // Produce a sequence [0..n)
    public static int[] range(int n) {
        int[] result = new int[n];
        for(int i = 0; i < n; i++)
            result[i] = i;
        return result;
    }
    // Produce a sequence [start..end)
    public static int[] range(int start, int end) {
        int sz = end - start;
        int[] result = new int[sz];
        for(int i = 0; i < sz; i++)
            result[i] = start + i;
        return result;
    }
    // Produce a sequence [start..end) incrementing by step
    public static int[] range(int start, int end, int step) {
        int sz = (end - start)/step;
        int[] result = new int[sz];
        for(int i = 0; i < sz; i++)
            result[i] = start + (i * step);
        return result;
    }


}
