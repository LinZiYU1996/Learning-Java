package chapter_12.c_12_4.c_12_4_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:53 2020/1/3
 */
class MyException2 extends Exception{

    private int x;
    public MyException2() {}
    public MyException2(String msg) { super(msg); }
    public MyException2(String msg, int x) {
        super(msg);
        this.x = x;
    }
    public int val() { return x; }
    public String getMessage() {
        return "Detail Message: "+ x + " "+ super.getMessage();
    }
}
