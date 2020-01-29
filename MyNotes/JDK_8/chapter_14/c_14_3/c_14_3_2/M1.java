package JDK_8.chapter_14.c_14_3.c_14_3_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 15:00
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        MyList<Integer> l =
                new MyLinkedList<>(5, new MyLinkedList<>(10, new Empty<>()));



    }
}
