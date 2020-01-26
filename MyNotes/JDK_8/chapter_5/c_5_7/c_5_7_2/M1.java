package JDK_8.chapter_5.c_5_7.c_5_7_2;


import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/26
 * \* Time: 19:56
 * \* Description:
 * \
 */
public class M1 {

//将一个原始类型 int 的数组转换成一个 IntStream
    public static void main(String[] args) {

        int[] nums = {1,2,5,96,4556,5,6,5};

        int sum = Arrays.stream(nums).sum();

        System.out.println(sum);

    }
}
