package C_1.c_1_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/14
 * \* Time: 10:03
 * \* Description:
 * \
 */

class DD{

    D4 d4;

    public DD(D4 d4) {
        this.d4 = d4;
    }

    @Override
    public String toString() {
        return "DD{" +
                "d4=" + d4 +
                '}';
    }
}

public class D4 {

    int d = 100;

    public D4() {
        DD dd = new DD(this);
        System.out.println(dd);
    }

    public static void main(String[] args) {

        D4 d4 = new D4();

    }
}
