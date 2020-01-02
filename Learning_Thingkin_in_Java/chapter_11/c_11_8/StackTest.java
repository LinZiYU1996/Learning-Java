package chapter_11.c_11_8;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:37 2020/1/2
 */
public class StackTest {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for(String s : "My dog has fleas".split(" "))
            stack.push(s);
        while(!stack.empty())
            System.out.print(stack.pop() + " ");
    }


}
