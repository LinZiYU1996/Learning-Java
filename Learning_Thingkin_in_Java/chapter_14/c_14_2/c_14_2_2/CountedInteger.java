package chapter_14.c_14_2.c_14_2_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:59 2020/1/4
 */
class CountedInteger {

    private static long counter;

    //每次创建一个实例，都会执行一次初始化id=counter++
    private final long id = counter++;


    public String toString() { return Long.toString(id); }


}
