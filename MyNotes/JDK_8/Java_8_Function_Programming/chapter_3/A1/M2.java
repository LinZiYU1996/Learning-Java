package JDK_8.Java_8_Function_Programming.chapter_3.A1;

import JDK_8.Java_8_Function_Programming.chapter_3.data.a2.Number_Data;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 17:34
 * \* Description:
 * \
 */
public class M2 {


    public static void main(String[] args) {

        List<Integer> data = Number_Data.createData();

        long count = data.stream()
                .filter(integer -> integer > 100)
                .count();

        System.out.println(count);

    }
}
