package JDK_8.functional_interface.Java_Custom_Functional_Interface;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:26
 * \* Description:
 * \
 */
public class MyNumber {

    private long firstNum;
    private long secondNum;
    public MyNumber(long firstNum, long secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }


    public long process(Calculator calc) {
        return calc.calculate(this.firstNum, this.secondNum);
    }

    public long getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(long firstNum) {
        this.firstNum = firstNum;
    }

    public long getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(long secondNum) {
        this.secondNum = secondNum;
    }


}
