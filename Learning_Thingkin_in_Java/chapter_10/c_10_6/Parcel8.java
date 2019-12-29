package chapter_10.c_10_6;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:52 2019/12/29
 */
public class Parcel8 {

    public Wrapping wrapping(int x) {
// Base constructor call:
        return new Wrapping(x) { // Pass constructor argument.
            public int value() {
                return super.value() * 47;
            }
        }; // Semicolon required
    }
    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }



}
