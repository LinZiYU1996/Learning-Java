package C_1.c_1_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/14
 * \* Time: 10:07
 * \* Description:
 * \
 */

class DDD{

    DDD get(){
        return this;
    }

    void f(){
        System.out.println("Hello World");
    }

}
public class D5 {

    public static void main(String[] args) {

        new DDD().get().f();

    }
}
