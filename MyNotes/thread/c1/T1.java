package thread.c1;

import java.util.stream.IntStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 21:06
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) {

        IntStream.range(0,5).boxed().map(
                i->new Thread(
                        ()-> System.out.println(Thread.currentThread().getName())
                )
        ).forEach(Thread::start);


    }
}
