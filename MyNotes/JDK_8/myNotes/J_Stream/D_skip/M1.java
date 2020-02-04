package JDK_8.myNotes.J_Stream.D_skip;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 13:08
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<String> list = Arrays.asList("AA","BB","CC","DD");

        //跳过前两个
        list.stream().skip(2).forEach(s->System.out.println(s));


    }
}
