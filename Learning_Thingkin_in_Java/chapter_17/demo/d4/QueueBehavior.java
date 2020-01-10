package chapter_17.demo.d4;

import chapter_15.c_15_3.Generator;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/10
 * \* Time: 22:12
 * \* Description:
 * \
 */
public class QueueBehavior {

    private static int count = 7;

    static <T> void test(Queue<T> queue, Generator<T> generator){

        for (int i = 0; i < count; i++) {
            queue.offer(generator.next());
        }

        while (queue.peek() != null){
            System.out.println(queue.remove() + "  ");
        }
        System.out.println("");
    }

    static class Gen implements Generator<String>{

        String[] strings = ("dhd jdjh wudh hf5 455 dkd 78 djis".split(" "));

        int i;

        @Override
        public String next() {
            return strings[i++];
        }
    }

    public static void main(String[] args) {

        test(new LinkedList<String>(),new Gen());

        test(new PriorityQueue<String>(),new Gen());

        test(new ArrayBlockingQueue<String>(count),new Gen());



    }
}
