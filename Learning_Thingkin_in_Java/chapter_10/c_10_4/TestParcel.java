package chapter_10.c_10_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:46 2019/12/29
 */
public class TestParcel {

    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
// Illegal -- can’t access private class:
//! Parcel4.PContents pc = p.new PContents();
    }


}
