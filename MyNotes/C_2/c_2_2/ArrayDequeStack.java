package C_2.c_2_2;

import java.util.ArrayDeque;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 10:58
 * \* Description:
 * \
 */
public class ArrayDequeStack {

    public static void main(String[] args) {

        ArrayDeque stack = new ArrayDeque();
        // 依次将三个元素push入"栈"
        stack.push("Java");
        stack.push("Java EE");
        stack.push("Android");



        System.out.println(stack);


        System.out.println(stack.peek());


        System.out.println(stack);



        System.out.println(stack.pop());


        System.out.println(stack);

    }
}
