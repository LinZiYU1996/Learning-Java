package jvm.Exception.A1.A4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/21
 * \* Time: 19:44
 * \* Description:
 * \
 */
public class MyException2 extends Exception{

    private int x;

    public MyException2(){}

    public MyException2(String msg) {
        super(msg);
    }

    public MyException2(String msg,int x) {
        super(msg);
        this.x = x;
    }
    public int val() {
        return x;
    }

    public String getMessage() {
        return "Detail Message"
                + x + " " + super.getMessage();
    }
}
