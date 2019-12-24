package chapter_5.c_5_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:32 2019/12/24
 */
public class Leaf {


    private int i = 0;

    Leaf increment() {
        i++;
        return this;
    }
    void print() {
        System.out.println("i = " + i);
    }

//    由于increment()通过 this 关键字返回当前对象的句柄，所以可以方便地对同一个对象执行多项操作。
    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }

}
