package better_write.ma_chu_gao_xiao.p2.啊;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/11
 * \* Time: 16:28
 * \* Description:
 * \
 */
public class GenericDemo<T> {

    /*
    此时 泛型参数中的String 是一个全新的东西
    类名后定义的<T>  与  get前面定义的T  是两个指代      可以完全不同  互不影响
     */
    static <String,T,Ali> String get(String string,Ali ali){
        return string;
    }

    public static void main(String[] args) {

        Integer f = 222;

        Long s = 333L;

        Integer res = get(f,s);

        System.out.println(res);

    }
}
