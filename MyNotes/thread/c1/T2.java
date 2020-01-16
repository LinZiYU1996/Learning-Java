package thread.c1;

import java.util.stream.IntStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 21:11
 * \* Description:
 * \
 */
public class T2 {

    private final static String STRING = "APPLE-";

    private static Thread create(final int intName){
        return new Thread(
                ()-> System.out.println(Thread.currentThread().getName()),STRING + intName
        );
    }

    public static void main(String[] args) {

        IntStream.range(0,5).mapToObj(T2::create).forEach(Thread::start);


    }
}
