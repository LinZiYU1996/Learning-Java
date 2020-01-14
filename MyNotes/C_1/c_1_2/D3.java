package C_1.c_1_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/14
 * \* Time: 10:00
 * \* Description:
 * \
 */
public class D3 {

    void m(D3 obj) {
        System.out.println("method is invoked");
        System.out.println(obj.hashCode());
    }

    void p() {
        m(this);
    }



    public static void main(String[] args) {

        D3 d3 = new D3();

        d3.p();

    }
}
