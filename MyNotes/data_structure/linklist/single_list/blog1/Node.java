package data_structure.linklist.single_list.blog1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/5/2
 * \* Time: 22:05
 * \* Description:
 * \
 */
public class Node {


    //数据域
    public Integer data;

    //指针域，指向下一个节点
    public Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }




}
