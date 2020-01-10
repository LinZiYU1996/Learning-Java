package chapter_17.demo.d4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/10
 * \* Time: 22:35
 * \* Description:
 * \
 */
public class DequeTest {

    static void fillTest(Deque<Integer> deque){

        for (int i = 20; i < 27; i++) {
            deque.addFirst(i);
        }

        for (int i = 50; i < 55; i++) {
            deque.addLast(i);
        }

    }

    public static void main(String[] args) {

        Deque<Integer> deque = new Deque<>();

        fillTest(deque);

        System.out.println(deque);

    }
}
