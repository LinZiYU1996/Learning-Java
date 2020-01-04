package chapter_14.c_14_2.c_14_2_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:58 2020/1/4
 */
public class WildcardClassReferences {

    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }


}
