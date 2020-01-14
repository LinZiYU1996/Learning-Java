package C_1.c_1_4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/14
 * \* Time: 16:54
 * \* Description:
 * \
 */
class Person {
    public String name;

    public Person() {
        name = "person";
    }

    public void show() {
        System.out.println("person show");
    }
}

class Woman extends Person {
    public String name;

    public Woman() {
        name = "woman";
    }

    public void show() {
        System.out.println("woman show");
    }

    public void myshow(){
        System.out.println("++++++++++++++++++");
    }
}

public class TestDemo {

//    当使用该对象引用进行调用的时候，有这么一条规则，对象调用编译时类型的属性和运行时类型的方法

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        person.show();

        System.out.println();

        Person person1 = new Woman();
        System.out.println(person1.name);
        person1.show();
//        person1.myshow();报错

        System.out.println();

        Woman woman = new Woman();
        System.out.println(woman.name);
        woman.show();
        woman.myshow();
    }

}

