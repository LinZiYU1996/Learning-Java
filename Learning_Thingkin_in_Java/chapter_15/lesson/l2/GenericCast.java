package chapter_15.lesson.l2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 11:23
 * \* Description:
 * \
 */
public class GenericCast {

    public static final int size = 10;

    public static void main(String[] args) {

        FixedSizeStack<String> fixedSizeStack =
                new FixedSizeStack<>(size);

        for(String s : "A B J J I D U K L P".split(" ")){
            fixedSizeStack.push(s);
        }

        for (int i = 0; i < size; i++) {
            String s = fixedSizeStack.pop();
            System.out.println(s +"     ");
        }

    }
}
