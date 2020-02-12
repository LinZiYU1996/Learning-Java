package better_write.ma_chu_gao_xiao.p2.a2;

import java.lang.reflect.Field;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/11
 * \* Time: 19:50
 * \* Description:
 * \
 */
public class ClassTest {


    private static int[] array = new int[3];

    private static int length = array.length;

    // 魔法属性 class  获取此类的大写Class类对象
    private static Class<One> one = One.class;

    private static Class<Another> another = Another.class;

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {

        //  通过newInstance方法创建One && Another 的类对象
        One oneObject = one.newInstance();

        oneObject.call();

        Another anotherObject = another.newInstance();

        //  通过one这个大写的Class对象   获取私有成员属性对象Field
        Field privateFieldInOne = one.getDeclaredField("inner");

        privateFieldInOne.setAccessible(true);

        privateFieldInOne.set(oneObject,"world change");

        System.out.println(oneObject.getInner());

    }
}
