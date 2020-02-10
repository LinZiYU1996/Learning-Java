package jvm.a1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/9
 * \* Time: 14:07
 * \* Description:
 * \
 */
public class Test {

    private int id;

    public Test(int id) {
        this.id = id;
    }

    public void show(){
        System.out.println(id);
    }

    public static void main(String[] args) {

        Test t1 = new Test(1);

        Test t2 = new Test(100);

        t1.show();

        t2.show();

    }
}
