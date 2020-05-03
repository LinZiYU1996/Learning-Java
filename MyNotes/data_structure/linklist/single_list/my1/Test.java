package data_structure.linklist.single_list.my1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/5/1
 * \* Time: 11:29
 * \* Description:
 * \
 */
public class Test {

    public static void main(String[] args) {

        int[] data = {1,48,4545,100,3,0};

        ListFunction function = new ListFunction();
        ListNode head = function.init(data, data.length);
        function.print(head);
        function.insertDataByPosition(head, 555, 3);
        function.print(head);
        function.deleteDataByPosition(head, 4);
        function.print(head);
        ListNode max = function.findMaxNode(head);
        System.out.println(max.getData());
        function.reverse(head);
        function.print(head);

    }
}
