package data_structure.linklist.single_list.my1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/5/1
 * \* Time: 11:23
 * \* Description:
 * \
 */
public class ListFunction{

    public ListNode init(int[] data, int n) {

        ListNode head = new ListNode();

        ListNode pointer,s;

        pointer = head;
        for (int i = 0; i < n; i++) {

             s = new ListNode(data[i]);

             s.setNext(null);

             pointer.setNext(s);

             pointer = s;
        }

        return head;
    }

    public void print(ListNode head) {

        ListNode pointer = head.getNext();

        while (pointer != null) {
            System.out.print(pointer.getData() + "  ");
            pointer = pointer.getNext();
        }
        System.out.println("");
        System.out.println("===============================");

    }

    public void insertDataByPosition(ListNode head, int data, int position) {

        ListNode pointer = head.getNext();

        ListNode val = new ListNode(data);

        int j = 0;

        while (pointer != null && j < position - 1){
            pointer = pointer.getNext();
            j++;
        }

        if (pointer == null ) {
            return;
        }

        val.setNext(pointer.getNext());

        pointer.setNext(val);
    }

    public void deleteDataByPosition(ListNode head, int position) {

        ListNode pointer = head.getNext();

        int j = 0;

        while (pointer != null && j < position - 1){
            pointer = pointer.getNext();
            j++;
        }

        if (pointer == null ) {
            return;
        }
        pointer.setNext(pointer.getNext().getNext());

    }

    public ListNode findMaxNode(ListNode head) {

        ListNode pointer = head.getNext();

        ListNode max_node = new ListNode();

        max_node = pointer;

        while (pointer != null) {

            if (pointer.getData() > max_node.getData()) {
                max_node.setData(pointer.getData());
            }

            pointer = pointer.getNext();
        }

        return max_node;
    }


    public void reverse(ListNode head) {

        ListNode pointer = head.getNext();

        ListNode q;

        head.setNext(null);

        while (pointer != null) {

            q = pointer.getNext();

            pointer.setNext(head.getNext());

            head.setNext(pointer);

            pointer = q;
        }


    }
}
