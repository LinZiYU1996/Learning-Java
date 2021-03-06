package chapter_15.c_15_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:35 2020/1/5
 */
public class Fibonacci implements Generator<Integer> {

    private int count = 0;

    public Integer next() {
        return fib(count++);
    }

//    用递归进行运算
    private int fib(int n) {
        if(n < 2) return 1;
        return fib(n-2) + fib(n-1);
    }


    public static void main(String[] args) {
        Fibonacci gen = new Fibonacci();
        for(int i = 0; i < 18; i++)
            System.out.print(gen.next() + " ");

    }


}
