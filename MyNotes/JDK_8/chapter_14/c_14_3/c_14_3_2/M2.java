package JDK_8.chapter_14.c_14_3.c_14_3_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 15:04
 * \* Description:
 * \
 */
public class M2 {

    public static LazyList<Integer> from(int n) {
        return new LazyList<Integer>(n, () -> from(n+1));
    }


    public static void main(String[] args) {

        LazyList<Integer> numbers = from(2);
        int two = numbers.head();
        int three = numbers.tail().head();
        int four = numbers.tail().tail().head();
        System.out.println(two + " " + three + " " + four);

    }
}
