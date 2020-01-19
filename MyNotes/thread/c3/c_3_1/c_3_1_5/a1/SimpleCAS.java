package thread.c3.c_3_1.c_3_1_5.a1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 14:54
 * \* Description:
 * \
 */
public class SimpleCAS implements Runnable{

    private volatile int value = 0;

    public void addValue(){
        int newVal = value + 1;
        while (value != cas(value, newVal)){
            newVal = value + 1;
        }
    }

    private synchronized int cas(int expectVal, int newVal){
        int curVal = value;
        if (expectVal == curVal){
            value = newVal;
        }
        return curVal;
    }

    @Override
    public void run() {
        addValue();
        System.out.println("+1");
    }

    public int getValue() {
        return value;
    }

    //    线程首先读取 value 的值并加 1，如果此时有另一个线程更新了 value，则期望值和 value 不相等，更新失败。更新失败后，循环尝试，重新读取 value 的值，直到更新成功退出循环。


}
