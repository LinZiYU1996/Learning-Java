package C_2.c_2_2;

import java.util.PriorityQueue;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 10:56
 * \* Description:
 * \
 */
public class PriorityQueueTest {

    public static void main(String[] args)
    {
        PriorityQueue pq = new PriorityQueue();
        // 下面代码依次向pq中加入四个元素
        pq.offer(6);
        pq.offer(-3);
        pq.offer(20);
        pq.offer(18);
        // 输出pq队列，并不是按元素的加入顺序排列
        System.out.println(pq); // 输出[-3, 6, 20, 18]
        // 访问队列第一个元素，其实就是队列中最小的元素：-3
        System.out.println(pq.poll());
    }
}
