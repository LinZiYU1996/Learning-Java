package chapter_14.c_14_6.demo_1;

import java.lang.reflect.Field;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:08 2020/1/5
 */
public class FieldDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {

        Class<?> clazz = Class.forName("chapter_14.c_14_6.demo_1.Audi");

        //获取指定name名称、具有public修饰的字段，包含继承字段

        Field field = clazz.getField("name");

        System.out.println("field：" + field);

        System.out.println("-----------------------");

        //获取修饰符为public的字段，包含继承字段

        Field[] fields = clazz.getFields();

        for(Field f:fields) {
            System.out.println("field：" + f);
        }


        System.out.println("-----------------------");

        //获取指定name名称的(包含private修饰的)字段，不包括继承的字段

        Field field2 = clazz.getDeclaredField("desc");

        System.out.println("field2：" + field2);

        System.out.println("-----------------------");


//获取Class对象所表示的类或接口的所有(包含private修饰的)字段,不包括继承的字段
        Field[] fields2 = clazz.getDeclaredFields();
        for(Field f:fields2) {
            System.out.println("field：" + f);
        }
        System.out.println("-----------------------");

    }
}
