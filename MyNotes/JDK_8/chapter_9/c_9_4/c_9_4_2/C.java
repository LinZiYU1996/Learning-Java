package JDK_8.chapter_9.c_9_4.c_9_4_2;

import JDK_8.chapter_9.c_9_4.A.A;
import JDK_8.chapter_9.c_9_4.A.B;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 20:50
 * \* Description:
 * \
 */
public class C extends D implements B, A {

    public static void main(String[] args) {

        new C().hello();
    }
}
