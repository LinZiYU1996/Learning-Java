package C_2.c_2_2;

import java.util.ArrayDeque;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 10:59
 * \* Description:
 * \
 */
public class ArrayDequeQueue {

    public static void main(String[] args) {

        ArrayDeque queue = new ArrayDeque();
        // 依次将三个元素加入队列
        queue.offer("Java");
        queue.offer("Java EE");
        queue.offer("Android");


        System.out.println(queue);



        System.out.println(queue.peek());



        System.out.println(queue);



        System.out.println(queue.poll());



        System.out.println(queue);

    }
}
