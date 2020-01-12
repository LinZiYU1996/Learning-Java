package chapter_19.c_19_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 11:00
 * \* Description:
 * \
 */
public class EnumClass {

    public static void main(String[] args) {

        for (Shrubbery s : Shrubbery.values()) {

//            ordinal方法返回一个int值  这是每个enum实例在声明时的次序 从 0 开始
            System.out.println(s + "orginal  " + s.ordinal());

            System.out.println("_________________");


//            enum类实现了Comparable接口 所以具有compareTo方法
            System.out.println(s.compareTo(Shrubbery.CRAWLING ) + "");

            System.out.println("_________________");

//            可以用 == 来比较enum实例  编译器会自动提供equal和hashcode方法
            System.out.println(s == Shrubbery.CRAWLING);

            System.out.println("_________________");


//            getDeclaringClass方法告诉我们所属的enum类
            System.out.println(s.getDeclaringClass());

            System.out.println("_________________");

//            name方法反复enum实例声明时的名字
            System.out.println(s.name());

        }

        for (String s:"jdddh hfhfj jfjkfjf".split(" ")) {

//            valueOf根据给定的名字返回相对应的enum实例
            Shrubbery shrubbery = Enum.valueOf(Shrubbery.class,s);

            System.out.println(shrubbery);
        }

    }
}
