package data_structure.linklist.single_list.blog1;

import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/5/2
 * \* Time: 22:07
 * \* Description:
 * \
 */
public class Test {


    public static void main(String[] args) {


        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            Function.addData(random.nextInt(1000));
        }

        Function.traverse(Function.head);

        Function.sortLinkList(Function.head);

        System.out.println("============================");
        Function.traverse(Function.head);
        System.out.println("============================");

        System.out.println(Function.findKNode(Function.head, 3).data);
        System.out.println("============================");

        System.out.println(Function.searchMid(Function.head).data);
        System.out.println("============================");

        Function.printListReversely(Function.head);
        System.out.println("============================");

        Function.traverse(Function.reverseList(Function.head));
        System.out.println("============================");

    }
}
