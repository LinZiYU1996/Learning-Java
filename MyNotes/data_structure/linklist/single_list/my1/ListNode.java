package data_structure.linklist.single_list.my1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/5/1
 * \* Time: 11:19
 * \* Description:
 * \
 */
public class ListNode {

    private int data;

    private ListNode next;

    public ListNode() {
    }

    public ListNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
