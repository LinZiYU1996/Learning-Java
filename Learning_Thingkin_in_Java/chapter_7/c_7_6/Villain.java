package chapter_7.c_7_6;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:20 2019/12/26
 */
public class Villain {

    private String name;

    protected void set(String nm) { name = nm; }

    public Villain(String name) { this.name = name; }

    public String toString() {
        return "I’m a Villain and my name is " + name;
    }

}
