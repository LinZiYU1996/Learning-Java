package chapter_19.c_19_4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 11:47
 * \* Description:
 * \
 */
public class NonEnum {

    public static void main(String[] args) {


        Class<Integer> integerClass = Integer.class;

        for (Object en : integerClass.getEnumConstants()) {
            System.out.println(en);
        }

//        java.lang.NullPointerException

    }
}
