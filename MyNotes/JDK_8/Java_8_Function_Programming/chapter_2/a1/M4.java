package JDK_8.Java_8_Function_Programming.chapter_2.a1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 20:47
 * \* Description:
 * \
 */
public class M4 {


    interface Converter<T1,T2>{
        void convert(int i);
    }
    public static void main(String[] args) {

        final int num = 1;

        Converter<Integer,String> stringConverter =

        (param) ->

        {
            System.out.println(String.valueOf(param + num));
        };

        stringConverter.convert(6);

    }
}
