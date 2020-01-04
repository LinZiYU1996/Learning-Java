package chapter_13.c_13_2;

import java.util.Random;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 23:53 2020/1/3
 */
public class UsingStringBuilder {

    public static Random rand = new Random(47);
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for(int i = 0; i < 25; i++) {
            result.append(rand.nextInt(100));
            result.append(", ");
        }
        result.delete(result.length()-2, result.length());
        result.append("]");
        return result.toString();
    }
    public static void main(String[] args) {
        UsingStringBuilder usb = new UsingStringBuilder();
        System.out.println(usb);
    }



}
