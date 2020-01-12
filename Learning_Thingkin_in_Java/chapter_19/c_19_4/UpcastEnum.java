package chapter_19.c_19_4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 11:45
 * \* Description:
 * \
 */
public class UpcastEnum {

//    Class中的getEnumConstants方法可以帮助我们获取所有enum实例

    public static void main(String[] args) {

        Search[] searches = Search.values();

        Enum e = Search.HITHER;

        for (Enum ee : e.getClass().getEnumConstants()) {

            System.out.println(ee);
        }

    }
}
