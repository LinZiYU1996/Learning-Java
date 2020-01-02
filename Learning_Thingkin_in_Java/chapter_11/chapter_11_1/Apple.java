package chapter_11.chapter_11_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:13 2020/1/2
 */
class Apple {

    private static long counter;

    private final long id = counter++;

    public long id(){
        return id;
    }

}
