package better_write.Learn_reflection.A2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/20
 * \* Time: 21:20
 * \* Description:
 * \
 */
public class Data {

    private int anInt;

    private double aDouble;

    public String string;

    public short aShort;

    protected float aFloat;

    char aChar;

    public Data(int anInt) {
        this.anInt = anInt;
    }

    public Data(int anInt, double aDouble, String string) {
        this.anInt = anInt;
        this.aDouble = aDouble;
        this.string = string;
    }

    public Data() {
    }

    public Data(float aFloat, char aChar) {
        this.aFloat = aFloat;
        this.aChar = aChar;
    }

    public Data(int anInt, double aDouble, String string, float aFloat, char aChar) {
        this.anInt = anInt;
        this.aDouble = aDouble;
        this.string = string;
        this.aFloat = aFloat;
        this.aChar = aChar;
    }

    private Data(double aDouble, String string, float aFloat) {
        this.aDouble = aDouble;
        this.string = string;
        this.aFloat = aFloat;
    }

    public static int m1(int a,int b) {
        return  a+b;
    }

    private void m2() {
        System.out.println("hello");
    }

    protected double m3() {
        return 4.0d;
    }

    void m4(){
        System.out.println("lll");
    }

    public void m5(){
        System.out.println("");
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public short getaShort() {
        return aShort;
    }

    public void setaShort(short aShort) {
        this.aShort = aShort;
    }

    public float getaFloat() {
        return aFloat;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }

    public char getaChar() {
        return aChar;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

    @Override
    public String toString() {
        return "Data{" +
                "anInt=" + anInt +
                ", aDouble=" + aDouble +
                ", string='" + string + '\'' +
                ", aShort=" + aShort +
                ", aFloat=" + aFloat +
                ", aChar=" + aChar +
                '}';
    }
}
