package chapter_10.c_10_6;

import chapter_10.c_10_4.Contents;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:50 2019/12/29
 */
public class Parcel7 {

    public Contents contents() {
        return new Contents() { // Insert a class definition
            private int i = 11;
            public int value() { return i; }
        }; // Semicolon required in this case
    }
    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }


}
