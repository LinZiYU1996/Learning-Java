package chapter_13.c_13_6.c_13_6_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:17 2020/1/4
 */
public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        System.out.println("+911".matches("(-|\\+)?\\d+"));
    }


}
