package chapter_14.c_14_6.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:54 2020/1/5
 */
public class ConstructorDemo {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class<?> clazz = null;


//        获取Person类对应的Class对象的引用

        clazz = Class.forName("chapter_14.c_14_6.demo.Person");

        //第一种方法，实例化默认构造方法，Person必须有无参构造函数,否则将抛异常

        Person p1 =  (Person) clazz.newInstance();

        p1.setAge(100);

        p1.setName("P1");

        System.out.println(p1);

        System.out.println("_____________________________________________________________");


        //获取带String参数的public构造函数

        Constructor cs1 = clazz.getConstructor(String.class);

//      创建Person

        Person p2 = (Person) cs1.newInstance("P2");

        p2.setAge(90);

        System.out.println(p2);

        System.out.println("_____________________________________________________________");

        //取得指定带int和String参数构造函数,该方法是私有构造private

        Constructor cs2 = clazz.getDeclaredConstructor(int.class,String.class);

        //由于是private必须设置可访问

        cs2.setAccessible(true);

        Person p3 = (Person) cs2.newInstance(80,"P3");

        System.out.println(p3);

        System.out.println("_____________________________________________________________");

        //获取所有构造包含private

        Constructor<?>[] cons = clazz.getDeclaredConstructors();

        //查看每个构造方法需要的参数
        for (int i = 0; i < cons.length; i++) {
            //获取构造函数参数类型
            Class<?> clazzs[] = cons[i].getParameterTypes();
            System.out.println("构造函数["+i+"]:"+cons[i].toString() );
            System.out.print("参数类型["+i+"]:(");
            for (int j = 0; j < clazzs.length; j++) {
                if (j == clazzs.length - 1)
                    System.out.print(clazzs[j].getName());
                else
                    System.out.print(clazzs[j].getName() + ",");
            }
            System.out.println(")");
        }


    }
}
