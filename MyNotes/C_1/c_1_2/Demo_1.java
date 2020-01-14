package C_1.c_1_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/14
 * \* Time: 9:50
 * \* Description:
 * \
 */
public class Demo_1 {

    void f(){
        System.out.println("f_______");
    }

    void m(){
        f();
    }

    void m_1(){
        this.f();
    }

    public static void main(String[] args) {

        Demo_1 d1 = new Demo_1();

        d1.m();

        d1.m_1();

    }
}
