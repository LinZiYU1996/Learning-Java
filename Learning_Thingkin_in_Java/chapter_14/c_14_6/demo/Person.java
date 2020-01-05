package chapter_14.c_14_6.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:52 2020/1/5
 */
public class Person {


    private int age;

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    private Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "我的基本信息" + age + "    "  + name;
    }
}
