package thread.c3.c_3_1.c_3_1_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 20:40
 * \* Description:
 * \
 */
public class Test {

    public static void main(String[] args) {

        MyList myList = new MyList();

        Ta ta = new Ta(myList);

        ta.setName("A");

        ta.start();

        Tb tb = new Tb(myList);

        tb.setName("B");

        tb.start();

    }
}
