package JDK_8.chapter_10.c_10_4.c_10_4_2;

import java.util.Optional;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 22:18
 * \* Description:
 * \
 */
public class M1 {


    public static Optional<Integer> stringToInt(String s){
        try {

//            如果 String 能转换为对//应的 Integer ，将其封装//在 Optioal 对象中返回
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e){

//            否则返回一个空//的 Optional 对象
            return Optional.empty();
        }
    }
}
